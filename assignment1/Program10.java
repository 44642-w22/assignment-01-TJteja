package assignment1;
import java.util.*;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Character> q = new ArrayDeque<>();
		System.out.println("Enter number of characters:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
			char c = sc.next().charAt(0);
			q.add(c);
		}
		
		List<Integer> a = new ArrayList<>();
		System.out.println("Enter number of operations:");
		int s2=sc.nextInt();
		for(int i=0;i<s2;i++) {
			int ele = sc.nextInt();
			a.add(ele);
		}
		
		String res = getDeque(q,a);
		System.out.println(res);

	}
	public static String getDeque(Deque<Character> q,List<Integer> a){
		char ele = '$';
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==0) {;
				
				if(ele!='$')
				q.addFirst(ele);
			}
			if(a.get(i)==1 && !q.isEmpty())
			ele = q.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			sb.append(q.poll());
		}
		return sb.toString();
	}

}
