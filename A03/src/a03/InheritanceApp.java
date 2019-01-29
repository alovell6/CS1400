package a03;
/*
 * Aaron Lovell
 * CSIS 1410
 * A03
 */

public class InheritanceApp {

	/**
	 * Main method runs the program,
	 * creates the objects from the classes that are made up of shapes
	 * then prints them
	 * there is also a for loop here
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		Square mySquare = new Square(4);
		Rectangle myRectangle = new Rectangle(5 ,4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		Circle myCircle = new Circle(4);
		Rectangle rectangle2 = mySquare;
		
		System.out.println(myRectangle);
			System.out.println("Length: " + myRectangle.getLength());
			System.out.println("Width: " + myRectangle.getWidth());
			System.out.println();
			
		System.out.println(mySquare);
			System.out.println("Side: " + mySquare.getSide());
			System.out.println();
			
		System.out.println(myIsoscelesRightTriangle.toString());
			System.out.println("Leg: " + myIsoscelesRightTriangle.getLeg());
			System.out.println("Hypotenuse: " + myIsoscelesRightTriangle.hypotenuse());
			System.out.println();
			
		System.out.println(myCircle);
			System.out.println("Diameter: " + myCircle.diameter());
			System.out.println("Circumfrence: " + myCircle.circumference());
			System.out.println("Radius: " + myCircle.getRadius());
			System.out.println();
			
		System.out.println("rectangle2: ");
			System.out.println("-----------");
			System.out.println(rectangle2);
			System.out.println("Length: " + rectangle2.getLength());
			System.out.println("Width: " + rectangle2.getWidth());
			System.out.println();
		
		System.out.println("Recantagle Array: ");
			System.out.println("----------------");
			Rectangle[] rectangles = {rectangle2, mySquare, myRectangle};
			for(Rectangle el : rectangles)
			{
				System.out.println(el);
				System.out.println("Length: " + rectangle2.getLength());
				System.out.println("Width: " + rectangle2.getWidth());
				System.out.println();
			}

	}

}
