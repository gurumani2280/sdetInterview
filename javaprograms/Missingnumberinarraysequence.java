package javaprograms;

public class Missingnumberinarraysequence 
{
		public static void main(String[] args) 
		{
			int a[] = {1,2,3,4,5,6};
			int sum = 0;
			for(int i = 0 ; i < a.length; i++)
			{
				sum = sum + a[i];
			}
			System.out.println("value of sum is " + sum);
			int sum1 = 0;
			for(int j = 1; j <= a[a.length-1]; j++)
			{
				sum1 = sum1 + j;
			}
			System.out.println("value of sum1 is " + sum1);
			System.out.println("missing number in the array is " + (sum1-sum));
		}
}
