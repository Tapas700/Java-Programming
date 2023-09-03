import java.util.Arrays;

public class PeakNumber {

	boolean isPeak(int[] a,int s)
	{
		boolean[] left = new boolean[s];
		boolean[] right = new boolean[s];
		
		int max = a[0];
		left[0] = false; // Solve the cornor problem
		
		System.out.println("Grater than left elements are: ");

		//a loop to find those elements that are greater than elements that are left of it  
		for(int i = 1; i<s;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
				left[i] = true;
				
				System.out.println(a[i]+":"+left[i]);
			}
			else
			{
				left[i] = false;
				
				System.out.println(a[i]+":"+left[i]);
			}
			
		}
		
		int min = a[s-1];
		right[s-1] = false;
		
		System.out.println("Smaller than right elements are: ");
		// a loop to find those elements that are greater than elements that are right of it  
		for(int i = s-2;i>=0;i--)
		{
			if(a[i]<min)
			{
				min = a[i];
				right[i] = true;
				
				System.out.println(a[i]+":"+right[i]);
			}
			else
			{
				right[i] = false;
				
				System.out.println(a[i]+":"+right[i]);
			}
			
		}
		
		System.out.println("----------------------------------");
		for(int i = 0; i<s;i++)
		{
			if(left[i] && right[i])
			{
				System.out.println("The Element is: "+a[i]);
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		int[] arr = {56,6,2,7,52,9,65,8};
//		int[] arr = {1,2,3,4,5,6,7,8,9}; It will return all true & the number is the started loop number
		
		if(new PeakNumber().isPeak(arr,arr.length))
		{
			System.out.println("The arr[] array "+Arrays.toString(arr)+" has got a peak number.");
		}
		else
		{
			System.out.println("The arr[] array "+Arrays.toString(arr)+" has not got a peak number.");
		}
		
		int[] arr1 = {3, 4, 5, 1, 6, 10, 9, 7, 8};
		
		if(new PeakNumber().isPeak(arr1,arr1.length))
		{
			System.out.println("The arr[] array "+Arrays.toString(arr1)+" has got a peak number.");
		}
		else
		{
			System.out.println("The arr[] array "+Arrays.toString(arr1)+" has not got a peak number.");
		}
	}

}
