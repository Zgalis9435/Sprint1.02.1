package exceptions_activity;

import java.util.*;

public class Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Attributes

		ArrayList<Product> productList = new ArrayList();
		Scanner uo = new Scanner(System.in);
		Product product1 = new Product(null, 0);
		Product product2 = new Product(null, 0);
		Product product3 = new Product(null, 0);
		int userOption = 0;
		int userProduct = 0;

		// Main code
		while (userOption == 0) {
			System.out.println("Escull una opció per continuar: " + "\n 1. Afegir un producte a la cistella. "
					+ "\n 2. Passar per caixa. ");
			userOption = uo.nextInt();
			switch (userOption) {

			case 1:
				userProduct = 0;
				while (userProduct == 0) {
					System.out.println("Quin producte vols afegir? " + "\n 1. Tomàquets, per 2,99€"
							+ "\n 2. Choco Crispies, per 5,99€." + "\n 3. Salmó, per 8,99€. ");
					userProduct = uo.nextInt();
					switch (userProduct) {
					case 1:
						product1.setName("Tomáquets");
						product1.setPrice(2.99);
						productList.add(product1);
						break;
					case 2:
						product2.setName("Choco Crispies");
						product2.setPrice(5.99);
						productList.add(product2);
						break;
					case 3:
						product3.setName("Salmó");
						product3.setPrice(8.99);
						productList.add(product3);
						break;
					}
				}

				userOption = 0;
				break;
			case 2:
				try {
					calcTotalPrice(productList);

				}

				catch (VendaBuidaException e) {
					System.out.println("La venda no es possible per el següent motiu: " + e.getMessage());
					userOption = 0;
				}

			}

		}

	}

	public static void calcTotalPrice(ArrayList<Product> productList) throws VendaBuidaException {
		
		// Attributes

		int i = 0;
		double price = 0;
		double finalPrice = 0;

		// Throw Exception

		if (productList.size() == 0) {
			throw new VendaBuidaException("Per fer una venda primer has d'afegir productes.");
		} else {
			while (i < productList.size()) {
				price = productList.get(i).getPrice();
				finalPrice = price + finalPrice;
				i++;
			}
			System.out.println("El total es: " + finalPrice + "€, moltes gracies.");
		}
	}

}
