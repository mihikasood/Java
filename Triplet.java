public class Triplet
{
	public static void main(String[] args)
	{
		int a, b, c;
		int aprod=1;
		int bprod=1;
		int cprod=1;
		
		
		

		for (a = 1; a < 1000; a++)
		{  aprod=a*a;//squaring a
			for (b = a; b < 1000; b++)
			{ bprod=b*b;//squaring b
				for (c = b; c <1000;c++)
				{ cprod=c*c;//squaring c
					if((a<b)&&(a<c)&&(b<c))//checking all conditions for a pythagorean triplet
						{
							if (a+b+c==1000)
							{
								if ((aprod + bprod == cprod))
								{					
								System.out.println(a + "is the value of a");
								System.out.println(b + "is the value of b");
								System.out.println(c + "is thevalue of c");
						
								}
							}
						}
				}
			}
		}
}
}