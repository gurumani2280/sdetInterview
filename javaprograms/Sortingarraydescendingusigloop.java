package javaprograms;

public class Sortingarraydescendingusigloop {
	public static void main(String[] args) {
	       int arr[] = {65,12,89,76,54};
	       int temp = 0;
	       System.out.println("Original Array");
	       for(int i =0 ; i < arr.length; i++)
	       System.out.println(arr[i]);
	       
	       for(int i =0 ; i < arr.length; i++)
	       for(int j =i+1; j < arr.length; j++)
	       {
	           if(arr[j] > arr[i]) // change in the symbol
	           {
	               temp = arr[i];
	               arr[i]= arr[j];
	               arr[j] = temp;
	           }
	       }
	       System.out.println("Sorted Array");
	        for(int i =0 ; i < arr.length; i++)
	       System.out.println(arr[i]);
	    }
	}


