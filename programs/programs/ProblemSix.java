package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ProblemSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<8;i++) {
			int ele = sc.nextInt();
			stack.push(ele);
		}
		List<Integer> l= getList(stack);
		System.out.println(l);
	}
	
	public static List<Integer> getList(Stack stack){
		List<Integer> list = new ArrayList<>();
		int size = stack.size();
		for(int i=0;i<size/2;i++) {
			list.add((Integer) stack.pop());
		}
		List<Integer> tempList = new ArrayList<>();
		for(int i=size/2;i<size;i++) {
			tempList.add((Integer) stack.pop());
		}
		Collections.reverse(tempList);
		list.addAll(tempList);
		return list;
	}
	
	

}
