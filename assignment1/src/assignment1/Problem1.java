package assignment1;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1= new LinkedList<>();
		System.out.println("Enter number of elements:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
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