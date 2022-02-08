package programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> l1= new LinkedList<>();
		for(int i=0;i<3;i++) {
			int ele = sc.nextInt();
			l1.add(ele);
		}
		
		List<Integer> l2 = getPerfectNumbers(l1);
		System.out.println(l2);
	}
	
	public static List<Integer> getPerfectNumbers(List<Integer> l1){
		List<Integer> l2 = new LinkedList<>();
		for(int i=0;i<l1.size();i++) {
			int num = l1.get(i);
			int sum=0;
			for(int j=1; j<num; j++)
			{
				if(num%j == 0)
				{
					sum += j;
				}
			}
			if(sum==num) {
				l2.add(num);
			}

		}
		return l2;
	}
	
	

}
