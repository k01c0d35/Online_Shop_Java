/***

 * 

 * Emily Wauters

 * 21141140

 * COMP503

 * Assessment A

 * 
 **/

package Classes;

public class OnlineShop
{
	private Product[] inventory;
	private int nProduct;
	
	// Default constructor
	public OnlineShop ()
	{
		this.inventory = new Product[5];
		this.nProduct = 0;
	}
	
	// Method - adds a product to the inventory array, but only if the new product will not exceed the length of inventory.
	public void add(Product product)
	{
		if (nProduct < inventory.length)
		{
			// sets the inventory[nProduct] to an input Product object
			inventory[nProduct] = product;
			
			//increments nProduct by 1 to show that a new product has been added
			nProduct++;
		}
	}
	
	// toString method which returns a string with all its inventory contents with iterating onto a new line
	public String toString()
	{
		String out = "\n";
		
		for (int inventoryCount = 0; inventoryCount < inventory.length; inventoryCount++)
		{
			out += (inventoryCount + 1) + ". " + this.inventory[inventoryCount] + "\n";
		}
		
		return out;
	}
	
	// Gets product that corresponds to user selection, as long as criteria is met, otherwise null is returned
	public Product getProduct(int correspondingNumberProduct)
	{
		if (correspondingNumberProduct >= 1 && correspondingNumberProduct <= nProduct)
		{
			return inventory[correspondingNumberProduct-1];
		}
		
		return null;
	}
}
