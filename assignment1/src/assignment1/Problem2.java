package assignment1;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1= new LinkedList<>();
		System.out.println("Enter number of elements:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
			int ele = sc.nextInt();
			l1.add(ele);
		}
		System.out.print("k=");
		int k = sc.nextInt();
		List<List<Integer>> l2 = getPairSum(l1,k);
		System.out.println(l2);
	}
	
	public static List<List<Integer>> getPairSum(List<Integer> l1,int k){
		List<List<Integer>> l2 = new ArrayList<>();
		for(int i=0;i<l1.size()-1;i++) {
			
				if(l1.get(i)+l1.get(i+1)==k) {
					l2.add(new ArrayList<Integer>());
					l2.get(l2.size()-1).add(l1.get(i));
					l2.get(l2.size()-1).add(l1.get(i+1));
				}
			

		}
		return l2;

	}

}