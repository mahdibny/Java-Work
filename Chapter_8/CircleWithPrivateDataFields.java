//package one;

public class CircleWithPrivateDataFields{
	private double radius =1;             //date fields that are legit
	private static int numberOfObjects =0;//static variable 
	// static variables are shared amoung all of the class

	public CircleWithPrivateDataFields(){
		numberOfObjects++;
	}

	public CircleWithPrivateDataFields(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double newRadius){
		//radius = (newRadius>=10 & newRadius<=50)  ? newRadius:1;
		if ( newRadius>=10 && newRadius<=50){
			radius=newRadius;
		}
		else {
			radius=1;
			System.out.println("error");
		}
		//radius = (newRadius>=10 & newRadius<=50)  ? newRadius:1;
		// This statement lets us know that if the number is less than 10 we
		// will set the value of the radius to 1
	}
	
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}

	public double getCircumference(){
		return 2*Math.PI*radius;
	}
	
}
