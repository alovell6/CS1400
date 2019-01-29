package a03;
/*
 * Aaron Lovell
 * CSIS 1410
 * A03
 */

/**
 * @author Aaron Lovell
 */

public class Rectangle {
	private int length;
	private int width;

	/**
	 * This creates a rectangle
	 * 
	 * @param l
	 * @param w
	 */

	Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	/**
	 * getLength returns length side of a Rectangle
	 * 
	 * @return
	 */

	public int getLength() {
		return length;
	}

	/**
	 * getWidth returns width side of a Rectangle
	 * 
	 * @return
	 */

	public int getWidth() {
		return width;
	}

	/**
	 * ToString Overrides to print name(length x width) of a rectangle
	 */

	@Override
	public String toString() {
		return "Rectangle(" + length + "x" + width + ")";
		// Rectangle(lengthxwidth) e.g. Rectangle(5x4)
	}
}
