public class ChessBoard {

    static int SIZE = 8; // SIZE is 8 now, but your program should work if it changes.
    public static void main (String args[]) { 
	for(int row=0;row<SIZE;row++)//loop for row
	{ for(int col=0;col<SIZE;col++)//loop for column
		if(row==col)//checking all conditions for printing "B" or "W", with if-else statements
		{System.out.print(" W ");}
		else if((row%2==0)&&(col%2==0))
		{System.out.print(" W ");}
	    else if((row%2==0)&&(col%2!=0))
		{System.out.print(" B ");}
	    else if((row%2!=0)&&(col%2==0))
	    {System.out.print(" B ");}
	    else if ((row%2!=0)&&(col%2!=0))
		{System.out.print(" W ");}
	    System.out.println(" ");
	
	}
		
}
}