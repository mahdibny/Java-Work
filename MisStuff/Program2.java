public class Program2{

public static void main (String args[]){
	int i=1, val=3;
	for (i=3;i>0;i--){
		val+=Y(val);
	}
	System.out.println("val: " + val);
}

public static int Y (int k){
	int j= X(k);
	return j;
}

public static int X (int k){
	int j=k+2;
	return j;
} 

}
