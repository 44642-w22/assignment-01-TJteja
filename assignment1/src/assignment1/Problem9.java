package assignment1;
import java.util.*;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new ArrayDeque<>();
		System.out.println("Enter queue size:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
			System.out.println("Enter element:");
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