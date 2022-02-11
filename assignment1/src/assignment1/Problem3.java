package assignment1;
import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem3 {


		
	  public static int minimumValue(ArrayList<Integer> A){        
	        if(A.isEmpty()){return Integer.MIN_VALUE;}
	        else{
	        int a=A.get(0);
	        for(int k : A){
	            if(k>a){a=k;}
	            
	            
	        }
	        return a;}
	        
	}

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	        Scanner sc=new Scanner(System.in);
	        ArrayList<Integer> an=new ArrayList<>();
	        System.out.print("How many elements do you want to add?: ");
	        int k=sc.nextInt();                
	        for(int i=0;i<k;i++){  
	            System.out.print("Enter the element: ");
	            an.add(sc.nextInt());
	        }        
	        
	        System.out.println(minimumValue(an));
	        
	    }
	    
	}