public class Matrix{
	public static void main(String args[]){
		int mad3d[][][];
		mad3d=buildMat3d();
		show(mad3d);
		show2(mad3d);
	} 

	public static int[][][] buildMat3d(){
		int [][][] ragged= new int [3][][];
		for (int i=0;i<3;i++){
			int a=1;
			 for (int j=3;j<8;j+=2){
			 	for (int x=a;x<j;x++){
			 		ragged = new  int [3][j][x];
			 	}
			}
			a++;
		}
		
		for (int z=0;z<ragged.length;z++){
			for (int y=0; y<ragged[z].length;y++){
				for(int g=0;g<ragged[z][y].length;g++){
					ragged[z][y][g]=(int)(Math.random()*99);
				}	
			}
		} 
		
		return ragged;
	}
	
	public static void show( int [][][] array){
			for (int z=0;z<array.length;z++){
				for (int y=0; y<array[z].length;y++){
					for(int g=0;g<array[z][y].length;g++){
						System.out.print(array[z][y][g]+ " ");
				}	
				System.out.println();
			}
			System.out.println();
		} 
	}
	  public static void show2(int[][][] ragged){
        for(int i = 0; i<ragged.length; i++){
            for(int j = 0; j<(3+2*i); j++){
                for(int k = 0; k<(i*j+1); k++){
                System.out.print(ragged[i][j][k] + " ");
                }
            System.out.println();
            }
        System.out.println();
        } 
    }
	
	
}
	
	

