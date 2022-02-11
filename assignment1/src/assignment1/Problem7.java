package assignment1;
import java.util.*;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		System.out.println("How many Binary numbers do you want to add:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
			System.out.println("Enter the binary number: ");
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