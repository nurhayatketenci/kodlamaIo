package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		 Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram",10);
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("lonovo v15");
		product2.setDetail("16 gb ram");
		product2.setDicount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
        Category category1=new Category();
        category1.setId(1);
       category1.setName("i�ecek");
        
        System.out.println(category1.getName());
	}

}
