// CMSC203 CRN 30504
// Author Susan Searles
// Date: March 31, 2020
/**
 * Represents a Property object
 * @author msear_000
 *
 */
public class Property {
	// Declare and instantiate fields.
	private	String	city;
	private	String	owner;
	private	String	propertyName;
	private	double	rentAmount;
	private	Plot	plot;
	
	// Constructors
	
	/**
	 * default no-arg constructor
	 */
	public Property()
	{
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0.0;
		plot = new Plot();
	}
	
	/**
	 * copy constructor
	 * Creates a new object using the information
	 * of the object passed to it.
	 * @param p
	 */
	public Property(Property p)
	{
		propertyName = p.propertyName;
		city = 	p.city;
		rentAmount = p.rentAmount;
		owner =	p.owner;
		plot = new Plot(p.plot);
	}
	
	/** 
	 * parameterized constructor with no plot information 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}
	
    /**
     * parameterized constructor
     * @param propertyName
     * @param city
     * @param rentAmount
     * @param owner
     * @param x
     * @param y
     * @param width
     * @param depth
     */
	public Property(String propertyName, String city, double rentAmount, String owner, 
			int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	
	// METHODS
	/**
	 * propertyName getter
	 * @return propertyName
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
	
	/**
	 * propertyName setter
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	
	/**
	 * city getter
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * city setter
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * Gets Plot
	 * @return plot
	 */
	public Plot getPlot()
	{
		return plot;
	}
	
	/**
	 * setter for Plot values
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public void setPlot(int x, int y, int width, int depth)
	{
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * getter for rentAmount
	 * @return rentAmount
	 */
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	/**
	 * setter for rentAmount
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	
	/**
	 * getter for owner
	 * @return owner
	 */
	public String getOwner()
	{
		return owner;
	}
	
	/**
	 * setter for owner
	 * @param owner
	 */
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	/**
	 * string for property summary
	 */
	@Override
	public String toString()
	{
		return "Property Name: " + getPropertyName() + "\nLocated in " + getCity() +
				"\nBelonging to " + getOwner() + "\nRent Amount: $" + getRentAmount(); 
	}
}
