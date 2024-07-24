/***

 * 

 * Emily Wauters

 * 21141140

 * COMP503

 * Assessment A

 * 
 **/

package Classes;

import java.util.Scanner;

public class ShopApp 
{
	private static OnlineShop onlineShop;
	
	// rateProduct method is executed when user selects option B
	private static void rateProduct(OnlineShop onlineShop)
	{
		// Prints inventory to console
		System.out.println(onlineShop);
		
		Scanner scanner = new Scanner(System.in);
		
		// User selects product, if invalid input, keep on asking until valid 
		System.out.println("Please select a product you would like to rate (1 - 5)");
		int selectedProduct = scanner.nextInt();
		while (selectedProduct < 1 || selectedProduct > 5)
		{
			System.out.println("Invalid number, must be between 1 and 5. Please try again");
			selectedProduct = scanner.nextInt();
		}
		
		// Prints specific product that user selected
		System.out.println(onlineShop.getProduct(selectedProduct));
		
		// User enters in their rating for the product, if invalid input, program will keep on looping until input meets conditions
		System.out.println("Please enter your rating (0.0 - 5.0)");
		double rating = scanner.nextDouble();
		while (rating < 0.0 || rating > 5.0)
		{
			System.out.println("Invalid number, rating must be between 0.0 and 5.0. Please try again");
			rating = scanner.nextDouble();
		}
		
		// clears buffer
		scanner.nextLine();
		
		// Invokes the rateReliability method in the Product class, to calculate the new reliability rating for the product
		onlineShop.getProduct(selectedProduct).rateReliability(rating);
		
		// Prints out selected product with updated reliability rating to include user's inputed reliability rating
		System.out.println(onlineShop.getProduct(selectedProduct));
	}
	
	public static void main(String[] args)
	{
		OnlineShop onlineShop = new OnlineShop();
		onlineShop.add(new Product("Coffee Machine", "Baristo Beans", 79.99));
		onlineShop.add(new Product("Faux Fur Ottoman", "Fabric Fanatics", 112.99));
		onlineShop.add(new Product("Vanilla Candle", "Home Fragrance", 8.01));
		onlineShop.add(new Product("Gardening Shovel", "Plant Lovers", 14.49));
		onlineShop.add(new Product("Electric Toothbrush", "Bright Smiles", 132.99));
		
		Scanner scanner = new Scanner(System.in);
		
		String selectedOption = "";
		
		while (!selectedOption.equalsIgnoreCase("C")) 
		{
			System.out.println("\nA. Display inventory \nB. Rate Product \nC. Exit");
			selectedOption = scanner.nextLine();
			
			if (selectedOption.equalsIgnoreCase("A"))
			{
				System.out.println(onlineShop);
			}
			
			if (selectedOption.equalsIgnoreCase("B"))
			{
				rateProduct(onlineShop);
			}
			
			if (selectedOption.equalsIgnoreCase("C"))
			{
				break;
			}
		}
	}
}
