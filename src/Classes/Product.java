/***

 * 

 * Emily Wauters

 * 21141140

 * COMP503

 * Assessment A

 * 
 **/

package Classes;

public class Product 
{
	// Private instance variables
	private String modelName;
	private String manufacturerName;
	private double retailPrice;
	private double reliabilityRating;
	private int amountOfConsumers;
	
	// Constructors, with defaults included
	public Product (String modelName, String manufacturerName, double retailPrice)
	{
		this.modelName = modelName;
		this.manufacturerName = manufacturerName;
		this.retailPrice = retailPrice;
		this.reliabilityRating = 0.0;
		this.amountOfConsumers = 0;
	}
	
	public Product (String modelName, String manufacturerName)
	{
		this.modelName = modelName;
		this.manufacturerName = manufacturerName;
		this.retailPrice = 0.0;
		this.reliabilityRating = 0.0;
		this.amountOfConsumers = 0;
	}
	
	// Get method for modelName
	public String getModelName()
	{
		return modelName;
	}
	
	// Get method for manufacturerName
	public String getManufacturerName()
	{
		return manufacturerName;
	}
	
	// Get and Set methods for retailPrice
	public double getRetailPrice()
	{
		return retailPrice;
	}
	
	public void setRetailPrice()
	{
		this.retailPrice = retailPrice;
	}
	
	// Get method for reliabilityRating
	public double getReliabilityRating()
	{
		return reliabilityRating;
	}
	
	// Get method for amountOfConsumers
	public int getAmountOfConsumers()
	{
		return amountOfConsumers;
	}
	
	// toString method that provides description of the product
	@Override
	public String toString()
	{
		return modelName + ", " + manufacturerName + ", $" + retailPrice +
				", " + reliabilityRating + " (based on "+ amountOfConsumers + " customer ratings)";
	}
	
	// Rate Reliability method to determine new average of the reliability ratings by all customers who rated a product
	public void rateReliability(double customerProductReliability)
	{
		// retrieve old amount of consumers and old reliability rating score
		int oldAmountOfConsumers = this.amountOfConsumers;
		double oldReliabilityRating = this.reliabilityRating;
		
		//increments amountOfConsumers by 1
		amountOfConsumers++; 	
		
		// reliabiliyRating average is updated to include the customer's rating 
		reliabilityRating = ((oldReliabilityRating * oldAmountOfConsumers + customerProductReliability) / amountOfConsumers); 
	}
}
