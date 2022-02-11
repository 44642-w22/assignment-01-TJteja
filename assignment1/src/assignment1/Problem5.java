package assignment1;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem5 {
	public static boolean patternMatch(String s1) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;

			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Give input: ");
		String s = sc.nextLine();
		System.out.println("The output is: " + patternMatch(s));
	}

}