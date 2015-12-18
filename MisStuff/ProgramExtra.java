public class ProgramExtra{
	public static int B (int y){
		y+=5*(2-1);
		return y;
}
	public static void main (String arg[]){
		int foo=1;
		for (int i=0;i<3;i++){
			System.out.println("input: " + B(i));
		}
}
}
