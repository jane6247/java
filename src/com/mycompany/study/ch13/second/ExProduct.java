package com.mycompany.study.ch13.second;

public class ExProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product<String, Integer> product = new Product<>();
		
		product.setKind("jane");
		product.setModel(100);
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		System.out.println("==========================");
		
		
		Product<Tv,String> product2 = new Product<>();
		
		Tv tv = new Tv();
		
		product2.setKind(tv);
		product2.setModel("daraekim");
		
		System.out.println(product2.getKind());
		System.out.println(product2.getModel());
		
		
		
		
		
		
	}

}
