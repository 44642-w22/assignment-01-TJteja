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

public class ProblemEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new ArrayDeque<>();
		for(int i=0;i<4;i++) {
			int ele = sc.nextInt();
			q.add(ele);
		}
		List<Integer> l = getEvenOdd(q);
		System.out.println(l);
	}
	
	public static List<Integer> getEvenOdd(Queue<Integer> q){
		Queue<Integer> evenList = new LinkedList<>();
		Queue<Integer> oddList = new LinkedList<>();
		while(!q.isEmpty()) {
			int ele = q.poll();
			if(ele%2==0) {
				evenList.add(ele);
			}else {
				oddList.add(ele);
			}
		
		}
	    List<Integer> list = new ArrayList<>();
	    while(!evenList.isEmpty() || !oddList.isEmpty()) {
	    	if(!evenList.isEmpty()) {
	    		list.add(evenList.poll());
	    	}
	    	if(!oddList.isEmpty()) {
	    		list.add(oddList.poll());
	    	}
	    }
		return list;
	}
	
	

}
