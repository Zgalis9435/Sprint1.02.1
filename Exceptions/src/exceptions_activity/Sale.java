package exceptions_activity;

import java.util.*;


/*Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.
La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada VendaBuidaException i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.
L’excepció personalitzada VendaBuidaException ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
Escriu el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException*/

public class Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Attributes
		
		ArrayList<Product> productList= new ArrayList();
		double totalPrice=0;
		double productPrice=0;
		String productName="null";
		Product product1=new Product(productName,productPrice);
		
		//Main code
		
	}
	public static int calcTotalPrice (ArrayList<Product> productList){
		//Attributes
		
		int i=0;
		int j=0;
		double price=0;
		double finalPrice=0;
		
		
		//Method code
		
		try{
			
			//Without exception
			
			for (i=0;i<productList.size();i++){
				price = productList.get(i).getPrice();
				finalPrice=price+finalPrice;
				
			} catch
		}
		
			
		
		
	}

}
