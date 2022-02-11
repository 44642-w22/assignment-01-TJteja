package assignment1;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> p = new ArrayList<>();
		
		System.out.println("Enter no of strings");
		int size=sc.nextInt();
		for (int i=0;i<size;i++) {
			System.out.println("Enter the string at index "+i);
			p.add(sc.next());
		}	
		
		System.out.println("Output of (A2)" + prob4(p)); 
		
	}
	
public static ArrayList<String> prob4(ArrayList<String> p){
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		
		for (String i : p) {
			l.add(i.length());
						
		}
		
		int min=l.get(0);
		
		for (int i=0;i<l.size();i++) {
			
			for(int j=0;j<l.size();j++) {
			
			
			if (l.get(i)<l.get(j)) {
				
				String r = p.get(i);
				p.set(i,p.get(j));
				p.set(j,r);
				
				int t = l.get(i);
				l.set(i,l.get(j));
				l.set(j,t);
				
			}
			}
			
		}
		
		
		return p;
		
		
	}
}