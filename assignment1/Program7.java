package assignment1;
import java.util.*;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		System.out.println("Enter number of Binary numbers:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
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
