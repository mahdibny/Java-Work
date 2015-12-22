import java.lang.String;
public class TestString1{
    public static void main (String [] args){
        
        // The string class is immutable but the 
        // stringbuilder class is not 
        String s1=new String("Welcome to Java");
        String s2="Welcome to Java";
        String s3="welcome to java"; // lower case
        String s4="Welcome";
        String s5="Welcome to Java Today or is it";
        
        
        System.out.println(s1.equals(s2)); 
        // s1.equals(s2) will return either true or false
        
        System.out.println(s1.equalsIgnoreCase(s3));
        // ignores the case of the string
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        // returns greather than 0, equal to 0 or greater than 0
        // so if s1 is greater than s2 it will give a number greater than 0
        
        System.out.println(s1.compareToIgnoreCase(s3));
        // returns a number but ignores case
        
        System.out.println(s1.regionMatches(10,s2,2,3));
        // returns a boolean and you can add a statement to ignore case
        
        System.out.println(s1.startsWith("Wel"));
        // returns boolean to match prefix
        
        System.out.println(s1.endsWith("Java"));
        // returns boolean to match suffix
        
        System.out.println(s1.length());
        // returns the length of the string
        
        char c1=(s1.charAt(1));
        System.out.println(c1);
        // returns the character at the specific index
        
        System.out.println(s1.concat(s2));
        // concat two strings
        String s6= s1.concat(s2);
        System.out.println(s6);
        
        System.out.println(s6.toLowerCase());
        // converts to lower case
        
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
        
        boolean kanye="440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");
        System.out.println(kanye);
        // allows you to see matches
        
        
        String s7=String.valueOf(5.44);
        // Allows you to convert primative values to a string
        System.out.println(s7);
        /*       
        +valueOf(d: double): String
        +valueOf(f: float): String
        +valueOf(i: int): String
        +valueOf(l: long): String
        +valueOf(b: boolean): String
        */
        
        
    }
}