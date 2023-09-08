import java.util.*;

public class LCM {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n1= 72, n2 = 120, lcm1 = 1,gcd=1;
		
		for(int i = 1; i <= n1 && i <= n2; ++i) {

			if(n1 % i == 0 && n2 % i == 0)
				
		        gcd = i;
		    }

		    System.out.printf("The GCD of %d and %d is %d.", n1, n2, gcd);
		    System.out.println();
		    
		    int lcm = (n1 * n2) / gcd;
		    
		    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
		    System.out.println();
		
		    System.out.println("Give The Number");
		   int n3 = s.nextInt();
		   
		   System.out.println("Give The Number");
		   int n4 = s.nextInt();
		   
		   lcm1 = (n3>n4)?n3:n4;
		   
		   while(true) {
			      if( lcm1 % n3 == 0 && lcm1 % n4 == 0 ) 
			      {
			        System.out.printf("The LCM of %d and %d is %d.", n3, n4, lcm1);
			        break;
			      }
			      ++lcm1;
			    }
		   
		   System.out.println("Give The Number");
		   int n5 = s.nextInt();
		   
		   System.out.println("Give The Number");
		   int n6 = s.nextInt();
		   
		   int lcm2 = (n5>n6) ? n5:n6;
		   
		   while(true)
			{
				if(lcm2%n5==0&&lcm2%n6==0)
				{
					System.out.println("LCM of "+n5+" and "+n6+" is "+lcm2);
					break;
				}
				++lcm2;
			}
			
	}

}
