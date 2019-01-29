package a03;
/*
 * Aaron Lovell
 * CSIS 1410
 * A03
 */

public class Square extends Rectangle
{

	/**
	 * Creates a Square using the length of one of the sides of said square
	 * @param side
	 */
	
	public Square(int side) 
	{
		super(side, side);
	}
	/**
	 * returns side length of a square
	 * @return
	 */
	
	public int getSide() 
	{
		return getLength();
	}
	/**
	 * Overrides the ToString to print a Square(side)
	 */
	
	@Override
	public String toString()
	{
		return "Square(" + getSide() + ")";
	}
	//Square(side) e.g. Square(4)
}
