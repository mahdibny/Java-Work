public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        //System.out.println(mat3d);
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));
        //System.out.println("After sorting the 3rd matrix we get");
        //sort(mat3d[2]);
        //show(mat3d);
    }
    
    public static int[][][] buildMat3d(){ 
    int[][][] ragged = new int[3][][];

    
    for(int x = 0; x<3; x++){
        for(int s = 3; s<3+2*x; s++){
            for(int j = 0; j<s+3+1; j++){
            
                ragged = new int[3][s][j];
            }
        }
    }
            
        for(int i = 0; i<ragged.length; i++){
            for(int j = 0; j<ragged[i].length; j++){
                for(int k = 0; k<ragged[i][j].length; k++){
                ragged[i][j][k] = (int)(Math.random()*99);
                }
            }
        }
        
        return ragged;
    }
    public static void show(int[][][] ragged){
        for(int i = 0; i<ragged.length; i++){
            for(int j = 0; j<(3+2*i); j++){
                for(int k = 0; k<(i+j+1); k++){
                System.out.print(ragged[i][j][k] + " ");
                }
            System.out.println();
            }
        System.out.println();
        } 
    }
    