package assignment1;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem6 {

	public static ArrayList<Integer> problem06(Stack S){
        ArrayList<Integer> arraylist=new ArrayList<>();
        int k=S.size();
        
        while(!S.empty()){
            if(S.size()>(k/2)){
                arraylist.add((int)S.pop());
                
            }
            else{
                arraylist.add((int)(S.firstElement()));
                S.remove(0);
              
                
            }            
        }
        return arraylist;
    }
    public static void main(String[] args) {
        Stack stack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements you want to add? ");
        int k=sc.nextInt();                
        for(int i=0;i<k;i++){  
            System.out.print("Enter the Element no "+(i+1) + "");
            stack.push(sc.nextInt());
        }                
        System.out.println(problem06(stack));
    }
    
}