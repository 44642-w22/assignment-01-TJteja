package programs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ProblemNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new ArrayDeque<>();
		for(int i=0;i<4;i++)
		{
			int ele = sc.nextInt();
			q.add(ele);
		}
		List<Integer> l = getAlternativeSeq(q);
		System.out.println(l);
	}
	
	public static List<Integer> getAlternativeSeq(Deque<Integer> q){
		List<Integer> list = new ArrayList<>();
		while(!q.isEmpty()) {
			list.add(q.pollLast());
			if(!q.isEmpty())
				list.add(q.pollFirst());
		
		}
		return list;
	}
	
	

}
