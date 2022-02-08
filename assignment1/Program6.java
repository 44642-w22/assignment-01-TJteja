package assignment1;
import java.util.*;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		System.out.println("Enter number of elements:");
		int s1=sc.nextInt();
		for(int i=0;i<s1;i++) {
			int ele = sc.nextInt();
			stack.push(ele);
		}
		List<Integer> l= getList(stack);
		System.out.println(l);

	}
	public static List<Integer> getList(Stack stack){
		List<Integer> list = new ArrayList<>();
		int size = stack.size();
		for(int i=0;i<size/2;i++) {
			list.add((Integer) stack.pop());
		}
		List<Integer> tempList = new ArrayList<>();
		for(int i=size/2;i<size;i++) {
			tempList.add((Integer) stack.pop());
		}
		Collections.reverse(tempList);
		list.addAll(tempList);
		return list;
	}

}
