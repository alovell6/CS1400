package a03;
/*
 * Aaron Lovell
 * CSIS 1410
 * A03
 */

public class IsoscelesRightTriangle 
{
	private final int leg;
	
	/**
	 * Creates a Isosceles Right Triangle with the size of one of the legs of the triangle
	 * @param l
	 */
	
	IsoscelesRightTriangle(int l)
	{
		leg = l;
	}
	
	/**
	 * returns the hypotenuse of the Isosceles Right Triangle and rounds to the nearest tenths place.
	 * @return
	 */
	
	public double hypotenuse()
	{
		return (double) Math.round(Math.sqrt(Math.pow(leg, 2) + Math.pow(leg, 2)) * 10) / 10;
	}

	/**
	 * returns leg size as an int
	 * @return
	 */
	
	public int getLeg() {
		return leg;
	}
	/**
	 * Overrides the ToString to print IsoscelesRightTriangle(leg)
	 */
	
	@Override
	public String toString()
	{
		
		return "IsoscelesRightTriangle(" + leg + ")";
		//IsoscelesRightTriangle(leg) e.g. IsoscelesRightTriangle(5)
	}
}
