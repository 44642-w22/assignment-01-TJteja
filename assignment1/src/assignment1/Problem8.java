package assignment1;
import java.util.*;

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new ArrayDeque<>();
		System.out.println("Enter size of deque: ");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++)
		{
			System.out.println("Enter element: ");
			int ele = sc.nextInt();
			q.add(ele);
		}
		List<Integer> l = getAlternativeSeq(q);
		System.out.println(l);

	}
	public static List<Integer> getAlternativeSeq(Deque<Integer> q){
		List<Integer> list = new ArrayList<>();
		while(!q.isEmpty()) {
			list.add(q.pollLast());
			if(!q.isEmpty())
				list.add(q.pollFirst());
		
		}
		return list;
	}

}