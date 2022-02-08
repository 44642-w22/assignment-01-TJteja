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

public class ProblemTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Deque<Character> q = new ArrayDeque<>();
		for(int i=0;i<5;i++) {
			char c = sc.next().charAt(0);
			q.add(c);
		}
		
		List<Integer> a = new ArrayList<>();
		for(int i=0;i<3;i++) {
			int ele = sc.nextInt();
			a.add(ele);
		}
		
		String res = getDeque(q,a);
		System.out.println(res);
	}
	
	public static String getDeque(Deque<Character> q,List<Integer> a){
		char ele = '$';
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==0) {;
				
				if(ele!='$')
				q.addFirst(ele);
			}
			if(a.get(i)==1 && !q.isEmpty())
			ele = q.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			sb.append(q.poll());
		}
		return sb.toString();
	}
	
	

}
