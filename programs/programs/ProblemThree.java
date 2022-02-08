package programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> l1= new ArrayList<>();
		for(int i=0;i<3;i++) {
			int no = sc.nextInt();
			l1.add(no);
		}
		
		int ele = getMaximumNumber(l1);
		System.out.println(ele);
	}
	
	public static int getMaximumNumber(List<Integer> l1){
		int maxNumber= Integer.MIN_VALUE;
		for(int i=0;i<l1.size();i++) {
			maxNumber = Math.max(maxNumber, l1.get(i));
		}
		return maxNumber;
	}
	
	

}
