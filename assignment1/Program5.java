package assignment1;
import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean isBalanced= isBalancedExpression(s);
		System.out.println(isBalanced);
	}
	public static boolean isBalancedExpression(String s){
		 Stack<Character> st = new Stack<>();
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            char topEle = st.isEmpty()?'#':st.peek();
	            if(c==')'){
	                if(topEle == '(')
	                    st.pop();
	                else
	                return false;
	            }
	             else if(c==']'){
	                if(topEle == '[')
	                    st.pop();
	                 else
	                return false;
	            }
	             else if(c=='}'){
	                if(topEle == '{')
	                    st.pop();
	                 else
	                return false;
	            }
	            else
	                st.push(c);
	            
	        }
	        return st.isEmpty();
	}

}
