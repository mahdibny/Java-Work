//package one;

public class TestCircle{
	public static void main (String [] args){
	CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(5.0);
	System.out.println("The area of my circle of radius " + myCircle.getRadius() +" is" + myCircle.getArea() + " and the circumference is " + myCircle.getCircumference());

	System.out.println("The numbe of objects created is " +CircleWithPrivateDataFields.getNumberOfObjects());
 
	}
	
	
}