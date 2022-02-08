package assignment1;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
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
