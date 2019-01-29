package a03;
/*
 * Aaron Lovell
 * CSIS 1410
 * A03
 */

public class Circle 
{
	private final int radius;
	/**
	 * Creates a Circle using the radius of said circle
	 * @param r
	 */
	
	Circle(int r)
	{
		radius = r;
	}
	/**
	 * returns a diameter of a Circle in the data type of an int
	 * @return
	 */
	
	public int diameter()
	{
		return 2*radius;
	}
	/**
	 * returns a circumference of a circle to the tenths places without rounding in the form of a double
	 * @return
	 */
	
	public double circumference()
	{
		return (Math.floor(2*Math.PI*radius * 1e1) / 1e1);
	}
	/**
	 * returns the radius of a circle
	 * @return
	 */
	
	public int getRadius() 
	{
		return radius;
	}
	/**
	 * Overrides the ToString to print the Circle(radius)
	 */
	
	@Override
	public String toString()
	{
		return "Circle(" + radius + ")";
	}
}
