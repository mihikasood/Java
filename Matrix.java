public class Matrix {

    static int MATRIX_SIZE = 4; // MATRIX_SIZE is 4 now, but your program should work for any size from 1 to 30.
    public static void main (String args[]) { 
	int const1=0;
	int row=0; int col=0;
	int[][] table=new int[100][100];
	int k=0;
	int sqr=MATRIX_SIZE*MATRIX_SIZE;
	for(k=0;k<sqr;k++)//for value of 001,002 and so on in the table. all positions run on the field value. if the condition is satisfied. it is assigned and k is incremented
	{ for(const1=0;const1<2*MATRIX_SIZE;const1++){ //is the sum of diagonal.Need to run it here as const needs to be incremented
	for(row=0;row<MATRIX_SIZE;row++)
	{ for(col=0;col<MATRIX_SIZE;col++)
		{
			
				if(row+col==const1)//checking if row + col is equal to the diagonal sum , diagonal sum being const
				{
					k=table[row][col];
					k++;//double increment as when values are being checked, same value will be assigned again. 
				
				}
			}
		}
	}
	}	
	
	
	}
    }
