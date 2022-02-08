package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> l1= new ArrayList<>();
		for(int i=0;i<3;i++) {
			String s = sc.next();
			l1.add(s);
		}
		
		List<String> l2 = getSortedStrings(l1);
		System.out.println(l2);
	}
	
	public static List<String> getSortedStrings(List<String> l1){
		List<String> l2 = new ArrayList<>();
		for(int i=0;i<l1.size();i++) {
			l2.add(l1.get(i));
		}
		Collections.sort(l2,(a,b)->a.length()-b.length());
		return l2;
	}
	
	

}
