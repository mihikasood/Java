public class Permutations{

    static int N = 4; // N is 4 now, but your program should work for any positive N, including 1.
    public static void main (String args[]) { 
    int[] num= new int[100];
	int s=N;
	for(int i=0;i<N;i++)// loop for saving all numbers less than N into an array
	{ int k=s-1;
     num[i]=k;
	 System.out.println(num[i]);
	 s=N-1;
	 
    }
	int perm1=PrintPerm(num,0);
	}
	
	
	
	
	public static int PrintPerm(int[] num, int currentFocus)

{

   if (currentFocus == num.length-1)

      {

        System.out.println(num);//print out 1 if N=1

        return 0;

      }

   PrintPerm(num, currentFocus+1);

   for(int j=currentFocus+1;j<num.length;j++)//loop for finding all permutations of given array

   {

     int temp= num[currentFocus];

     num[currentFocus]=num[j];

     num[j]=temp;
	 
	 System.out.println(num);

     PrintPerm(num, currentFocus+1);
	 
	 

   }
   return 0;
} 
}




    

    

