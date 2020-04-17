// CMSC203 CRN 30504
// Author Susan Searles
// Date: March 31, 2020

//import java.io.*;
//import java.util.*;

/**
 * Represents a Plot object
 * @author msear_000
 *
 */
public class Plot {

	// Declare and instantiate the FIELDS.
	private int	x;
	private int y;
	private int width;
	private int depth;
	
	// Create CONSTRUCTORS.
	
	/**
	 * Default constructor for plot.
	 */
	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	/**
	 * Copy constructor for plot.
	 * @ param p
	 */
	public Plot(Plot p)
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	/**
	 * parametrized Plot
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	// METHODS
	/**
	 * Determines if this plot overlaps the parameter
	 * @param p
	 * @return overlaps boolean
	 */
	public boolean overlaps(Plot p)
	{

		if (x >= p.x + p.width)
			return false;
		if (p.x >= x + width)
			return false;
		if (y >= p.y + p.depth)
			return false;
		if (p.y >= y + depth)
			return false;
		return true;

	}
	
	/**
	 * Determines if this plot encompasses the parameter
	 * @param p
	 * @return encompasses boolean
	 */
	public boolean encompasses(Plot p)
	{
	if ((p.y>=y)&&((p.y+p.depth)<=(y+depth))&&((p.x>=x)&&((p.x+p.width)<=(x+width))))
	{
		return true;
	}
	else
	{
		return false;
	}

	}
	
	/**
	 * getter for x-value
	 * @return x-value
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * setter for x-value
	 * @param x
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	
	/**
	 * getter for y-value
	 * @return y-value
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * setter for y-value
	 * @param y
	 */
	public void setY(int y)
	{
		this.y = y;
	}	
	
	/**
	 * getter for width
	 * @return width
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * setter for width
	 * @param width
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	 * getter for depth
	 * @return depth
	 */
	public int getDepth()
	{
		return depth;
	}
	
	/**
	 * setter for depth
	 * @param depth
	 */
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	@Override
	/**
	 * Prints out the name, city, owner, and rent amount
	 * for a property
	 */
	public String toString()
	{
		return "Upper left: (" + x + ", " + y + "); Width: " + width +
				" Depth: " + depth;
	}
}
