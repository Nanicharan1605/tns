package stream_api;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIexample {
	
public static void main(String[] args) {
	
	List<Product> pl=new ArrayList<Product>();
	
	pl.add(new Product(1,"hp",25000f));
	pl.add(new Product(2,"Dell",30000f));
	pl.add(new Product(1,"Apple",95000f));
	pl.add(new Product(1,"lenova",15000f));
	
	List<Float> pl2=pl.stream().filter(p->p.price>30000)//filtering data
			.map(p->p.price)// fetching the price
			.collect(Collectors.toList());// collecting as a list
			System.out.println(pl2);
}
}