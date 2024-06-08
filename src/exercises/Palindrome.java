package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Palindrome {
  public static void main (String args[]) {
	  int[] numbers = {1, 2, 3, 4, 5};
	  System.out.println(arraySum(numbers));
	  
	  int[] values = {-2, 0, 5, -10, 7,99,-1};
	  System.out.println(arraySum(values));
	  System.out.println(findMaxIndex(values));
	  System.out.println(findFirstIndex(values,5));
	  
	  int[] duplicates = {1, 2, 3, 77,  4, 5, 77, 5, 9, -1, 2, 2, 2, 2};
	  System.out.println(findDuplicates(duplicates));
	  
	  int [] sumArray= {5, 10, 15, 20};
	  System.out.println("the sum of the array is: " + calculateSum(sumArray));
	  
	  int[] array = {1,2,3,4,5,6,7,8};
	  System.out.println("The missing number is: " + returnMissingElement(array));

  }//main
  public static int arraySum(int[] arr) {
	  int sum=0;
	  for (int num: arr) {
		  sum+=num;
	  }
	  return sum;
  }
  
	    public static int findMaxIndex(int[] arr) {
	        int maxIndex=0;
	    	if (arr.length == 0) {
	            return -1;  // Array is empty
	        }
	        for ( int i=0; i<arr.length;i++) {
				if(arr[i]>arr[maxIndex]) {
					maxIndex=i;
				}
			}
	        return maxIndex;
	    }
	    
	    public static int countOccurrences(int[] arr, int target) {
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    public static int findFirstIndex(int[] arr, int target) {
	    	for (int i=0; i<arr.length;i++) {
	    		if (arr[i]==target)
	    			return i;
	    	}
	    	return -1;
	    }
	    
	    public static ArrayList<Integer> findDuplicates(int[] arr) {
	    	ArrayList<Integer> duplicates = new ArrayList<Integer>();
	    	HashSet<Integer> uniqueElements= new HashSet<Integer>();
	    	 HashSet<Integer> seenElements = new HashSet<Integer>();
	    	for (int element : arr) {
				
				if (uniqueElements.contains(element)){	
					if (!seenElements.contains(element)) {
		                duplicates.add(element);
		                seenElements.add(element);
		            }
				}else {
					uniqueElements.add(element);
				}
			}
	    	return duplicates;
	    }
	    
	    public static int calculateSum(int[] array) {
	        int sum=0;
	        
	        for (int i : array) {
				sum+=i;
			}
	        return sum;
	    }
	    
	    public static int returnMissingElementVer1(int[] array) {
	    	
	    	  if(array.length==0) {
	    		  System.out.println("no missing elements");	    		  
	    	  }
	    	  for (int i = 1; i < array.length; i++) {
	    	        if (array[i] != (array[i - 1]) + 1) {
	    	            return array[i - 1] + 1;
	    	        }
	    	    }
          
        return 0; 
	    }
	    
	    public static int returnMissingElement(int[] array) {
	        int n = array.length;
	        System.out.println("length "+n);
	        int totalSum = (n + 1) * (n + 2) / 2;
	        System.out.println(totalSum);

	        for (int i = 0; i < n; i++) {
	            totalSum -= array[i];
	            System.out.println("current "+totalSum);
	        }

	        return totalSum;
	    }

}
