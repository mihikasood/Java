public class Matrix1 {

    static int MATRIX_SIZE = 4; // MATRIX_SIZE is 4 now, but your program should work for any size from 1 to 30.
    public static void main (String args[]) { 
    	Matrix matrix = new Matrix();
    	int N = matrix.MATRIX_SIZE;
    	int[][] table = new int[N][N];
    	int constant = 0, col = 0, row = 0;

    	for (int i=1;i < N*N;i++){
    		for (constant=0;constant<N*N;constant++){
    		for (row=0;row<N;row++){
    			for (col=0;col<N;col++){
    				if (col+row == constant){
    				table[col][row]=i;
    				i++;
    				}
    			}
    		}
    		}
    	}
		
col = 0;
    	row = 0;
    	
    			for (row=0;row<N;row++){
    				for (col=0;col<N;col++){
    				int numberOfZeroes=0;
    				numberOfZeroes=countZeroes(table[col][row]);
    				for(int k=0;k<numberOfZeroes;k++){
    					System.out.print("0");
    				}
    				System.out.print(table[col][row]);
    				System.out.print(" ");
    			}
    			System.out.println();
    		}
    }
    public static int countZeroes(int number){
    	if(number<10){
    		return 2;
    	}
    	if(number<100){
    		return 1;
    	}
    	if(number<1000){
    		return 0;
    	}
		else{
    		return 4;
    	}
    }
}