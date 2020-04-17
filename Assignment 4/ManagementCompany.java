// CMSC203 CRN 30504
// Author Susan Searles
// Date: March 31, 2020
/**
 * Represents the management company object
 * @author msear_000
 *
 */
public class ManagementCompany {

    // Declare and instantiate the fields.	
	private String	name;
	private String	taxID;
	private double	mgmFeePer;
	private final	int	MAX_PROPERTY = 5;
	private final	int MGMT_WIDTH = 10;
	private final 	int MGMT_DEPTH = 10;
	private Property[] properties;
	private Plot	plot;
	private int		arrayIndex = 0;
	
	// CONSTRUCTORS
	/**
	 * no-arg constructor that creates a Management Company
	 * object using empty strings and the plot set to a plot 
	 * with default values 0, 0, 10, 10
	 */
	public ManagementCompany()
	{
		name = "";
		taxID = "";
		mgmFeePer = 0.0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * constructor that creates a management company using 
	 * passed information
	 * @param name
	 * @param taxID
	 * @param mgmFeePer
	 */
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;	
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	/**
	 * constructor that creates a management company using 
	 * passed information
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID, double mgmFee, 
			int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Copy Constructor that creates a Management Company object from
	 * another ManagementCompany object
	 * @param otherCompany
	 */
	public ManagementCompany(ManagementCompany otherCompany)
	{
		name = otherCompany.name;
		taxID = otherCompany.taxID;
		mgmFeePer = otherCompany.mgmFeePer;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(otherCompany.plot);
	}
	
	// METHODS
	
	/**
	 * Returns the MAX_PROPERTY constant that represents the
	 * size of the properties array.
	 * @return maximum number of properties
	 */
	public int getMAX_PROPERTY()
	{
		return MAX_PROPERTY;
	}
	
	/**
	 * Sets management company name
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns managementcompany name
	 * @return name of company
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the plot 
	 * @return plot
	 */
	public Plot getPlot()
	{
		return plot;
	}
	
	/**
	 * Sets the x, y, width and depth values
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public void setPlot(int x, int y, int width, int depth)
	{
		plot = new Plot(x, y, width, depth);
	}  
	
	/**
	 * Creates a property object and adds it to the "properties" array.
	 * @param property
	 * @return integer or property position
	 */   
	public int addProperty(Property property)
	{
	    if (arrayIndex >= MAX_PROPERTY)
	    {
	    	return -1;
		}
	    if (property == null)
	    {
	    	return -2;
	    }
	    if (!(plot.encompasses(property.getPlot())))
	    {
	    	return -3;
	    }
	 for(int i = 0; i < arrayIndex; i++)
	 {
		 if(properties[i].getPlot().overlaps(property.getPlot()))
		 {
			 return-4;
		 }
	 }
	properties[arrayIndex]= new Property(property);
	arrayIndex++;
	return arrayIndex-1;
	}

	/**
	 * Creates a property object and adds it to the properties
	 * array
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @return
	 */
	public int addProperty(String propertyName, String city, double rentAmount, String owner)
	{
		Property property = new Property(propertyName, city, rentAmount, owner);
		return addProperty(property);
	}

	/**
	 * Creates a property object and adds it to the properties array
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public int addProperty(String propertyName, String city, double rentAmount, String owner,int x, int y,
			int width, int depth)
	{
		Property property = new Property(propertyName, city, rentAmount, owner, x, y, width, depth);
		return addProperty(property);
	}

	/**
	 * This method accesses each Property object within the array properties
	 * and sums up property rents and returns the total amount
	 * @return total rent
	 */
	public double totalRent()
	{
		double totalRent = 0.0;
		for(int i = 0; i < arrayIndex; i++)
		{
			totalRent += properties[i].getRentAmount();
		}
		return totalRent;
	}
	
	/**
	 * This method finds a property within the properties array that has the 
	 * maximum rent amount.
	 * @return toString of property with highest rent
	 */
	public String maxRentProp()
	{
		double maxRent;
		String output = "";
		maxRent = properties[0].getRentAmount();
		
		for (int i = 0; i < arrayIndex; i++)
		{
				if (maxRent <= properties[i].getRentAmount());
				{
					maxRent =properties[i].getRentAmount();
					output = properties[i].toString();
				}
		}
		return output;
	
	}
	
	/**
	 * This method finds the index of the property with the 
	 * maximum rent amound and returns the index of that 
	 * property
	 * @return index
	 */
	public int maxRentPropertyIndex()
	{
		double maxRent;
		int index = 0;
		maxRent = properties[0].getRentAmount();
		for (int i = 1; i <= properties.length; i++)
		{
			if (maxRent < properties[i].getRentAmount())
			{
				maxRent = properties[i].getRentAmount();
				index = i;
			}
		}
		return index;
	}
	
	/**
	 * Displays the information of the property at index i
	 * @param i
	 * @return string of property at given index
	 */
	public String displayPropertyAtIndex(int i)
	{
		return properties[i].toString();
	}
	
	@Override
	/**
	 * Displays the information of all the properties in the properties array.
	 */
	public String toString()
	{
		String output = null;
		output += "List of the properties for: " + name + ", TaxID: " + taxID + "\n";
		output += "______________________________________________________________\n";
		for (int i = 0; i < arrayIndex; i++)
		{
			output += properties[i].toString() + "\n";
		}
		output += "______________________________________________________________\n";
		output += "Total management fee: " + totalRent()*mgmFeePer/100;
		return output;
		}
	
}
