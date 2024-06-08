package leetcode.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author mtzto
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 */
 

public class AddTwoNumbers {
	public static void main(String[] args) {
		LinkedList<Integer> list1= new LinkedList<>();
		list1.add(2);
		list1.add(4);
		list1.add(3);
		
		LinkedList<Integer> list2= new LinkedList<>();
		list2.add(5);
		list2.add(6);
		list2.add(4);
		
		addTwoNumbers(list1, list2);
		
	}
	
	
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		Iterator<Integer> iterator = l1.descendingIterator();
		Iterator<Integer> iterator2 = l2.descendingIterator();
		StringBuilder l1number= new StringBuilder();
		StringBuilder l2number= new StringBuilder();
		while (iterator.hasNext() && iterator2.hasNext()) {
			l1number.append(iterator.next().toString());
			l2number.append(iterator2.next().toString());
		}
       int sum= Integer.parseInt(l1number.toString()) + Integer.parseInt(l2number.toString());
       String sumString= String.valueOf(sum);
       LinkedList<Integer> result= new LinkedList<>();
       for(int i=(sumString.length())-1; i>=0; i--) {
    	   result.add(Character.getNumericValue(sumString.charAt(i)));
       }
		return result;
	}
}
