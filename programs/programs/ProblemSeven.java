package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ProblemSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<3;i++) {
			int ele = sc.nextInt();
			q.add(ele);
		}

		int number = getDecimalNumber(q);
		System.out.println(number);
	}
	
	public static int getDecimalNumber(Queue q){
		int n=0;
		int size = q.size();
		size--;
		int base=2;
		while(!q.isEmpty()) {
			int ele = (int) q.poll();
			n= n+(ele*(int)Math.pow(base, size));
			size--;
		}
		return n;
	}
	
	

}
