package assignment1;
import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1= new ArrayList<>();
		for(int i=0;i<4;i++) {
			int no = sc.nextInt();
			l1.add(no);
		}
		
		int ele = getMaximumNumber(l1);
		System.out.println(ele);
	}
	
	public static int getMaximumNumber(List<Integer> l1){
		int maxNumber= Integer.MIN_VALUE;
		for(int i=0;i<l1.size();i++) {
			maxNumber = Math.max(maxNumber, l1.get(i));
		}
		return maxNumber;

	}

}
