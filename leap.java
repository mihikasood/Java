public class Leap {
    static int START_YEAR = 1600, END_YEAR = 2016; // these should be changeable to any positive integer
    public static void main (String args[]) {
	int flag=0;	
		for(int n=START_YEAR; n<=END_YEAR; n++)
		{
		if ((n%4==0) && (n%100!=0))
			{System.out.println(n+" is a leap year");}
		else if ((n % 4 == 0) && (n % 100 == 0) && (n % 400 == 0))
		{ System.out.println(n+" is a leap year");}
	    else 
		{System.out.println(n + " is not a leap year");}
        
		}
}
}