
public class TestStringBuilder {
    public static void main (String [] args){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder(10); //gives s2 a capacity of 10
        s1.append("Welcome");
        System.out.println(s1);
        
        char [] ch1= {'a','b','c','d','e','f','g','h','i','k'};
        s2.append(ch1);
        // appends a array of characters 
        System.out.println(s2);
        
        char [] ch2= {'a','b','c','d','e','f','g','h','i','k'};
        StringBuilder s3 = new StringBuilder(10);
        s3.append(ch2,3,7);
        System.out.println(s3);
        // appends a certain index of values to the string
        
        s3.append(1000);
        System.out.println(s3);
                   
        System.out.println(s3.toString());
        //  toString transforms the StringBuilder to a string
        
        System.out.println(s3.capacity());
        // give the capacity of the string
        
        System.out.println(s3.length());
        // give the length of the string
        
        s3.trimToSize();
        // trims the array to size
        System.out.println(s3.length());
        
    }
}