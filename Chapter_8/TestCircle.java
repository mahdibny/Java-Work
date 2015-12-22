//package one;


public class TestCircle{
	public static void main (String [] args){
	CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(5.0);
	System.out.println("The area of my circle of radius " + myCircle.getRadius() +" is" + myCircle.getArea() + " and the circumference is " + myCircle.getCircumference());

	System.out.println("The number of objects created is " +CircleWithPrivateDataFields.getNumberOfObjects());
 	
 	CircleWithPrivateDataFields myCircle2=new CircleWithPrivateDataFields(10.0);
 	System.out.println("The radius of the circle "+ myCircle2.getRadius());
 	
 	int number=myCircle2.getNumberOfObjects();
 	System.out.println("The number of objects " + number );
 	
 	myCircle2.setRadius(0);
 	System.out.println("The new radius " + myCircle2.getRadius());
	}
}