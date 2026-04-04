package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	String prodName;
	Double prodPrice;
	public Product(String prodName, Double prodPrice) {
		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	
	
	
	public String getProdName() {
		return prodName;
	}



	public Double getProdPrice() {
		return prodPrice;
	}



	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	
	
}
public class StreamOperations2 {

	public static void main(String[] args) {

		List<Product> productList = Arrays.asList(new Product("Apple", 1200.0),new Product("Samsung", 1000.0),new Product("BlackBerry", 1000.0),
				new Product("OnePlus", 800.0),new Product("Apple Pro", 1500.0),new Product("Redmi", 800.0));
		
		//Collecting and then stream
		String maxProcProduct = productList.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getProdPrice)), (Optional<Product> product)->product.isPresent()?product.get().getProdName():"None"));
		System.out.println("The Product with max price is : "+maxProcProduct);
		
		//Grouping By Stream
		Map<Double, List<Product>> groupingByPriceMap = productList.stream().collect(Collectors.groupingBy(Product::getProdPrice));
		System.out.println("List of Products Group By Price : "+groupingByPriceMap);
		
		//Partitioning By Stream
		Map<Boolean, List<Product>> costlyProduct = productList.stream().collect(Collectors.partitioningBy(product->product.getProdPrice()>1000.0));
		System.out.println("The lis of Products partitioned By : "+costlyProduct);
		
	}

}
