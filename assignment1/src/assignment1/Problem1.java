package assignment1;
import java.util.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		List<Integer> list1= new LinkedList<>();
		System.out.println("Enter size of the list:");
		int s1=obj.nextInt();
		for(int i=0;i<s1;i++) {
			System.out.println("Enter number: ");
			int ele = obj.nextInt();
			list1.add(ele);
		}
		
		List<Integer> list2 = getPerfectNumbers(list1);
		System.out.println(list2);
	}
	
	public static List<Integer> getPerfectNumbers(List<Integer> list1){
		List<Integer> list2 = new LinkedList<>();
		for(int i=0;i<list1.size();i++) {
			int num = list1.get(i);
			int sum=0;
			for(int j=1; j<num; j++)
			{
				if(num%j == 0)
				{
					sum += j;
				}
			}
			if(sum==num) {
				list2.add(num);
			}

		}
		return list2;

	}

}