package ruffwork;

import java.util.Scanner;

public class InnerClass {
	
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	        //int N = scan.nextInt();
	        //scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	     /*   if (N%2==1){
	            System.out.println("Weird");
	        }else if ((N%2==0) || ((N>=2)&&(N<=5))){
	            System.out.println("Not Weird");
	        }else if ((N%2==0) || ((N>=6)&&(N<=20))){
	            System.out.println("Weird");
	        }else if((N%2==0) || (N>20)){
	            System.out.println("Not Weird");
	        }*/
	        
	       /* if ((N%2==1) || ((N%2==0) && ((N>=6)&&(N<=20)))){
	        	System.out.println("Weird");
	        }else {
	        	System.out.println("Not Weird");
	        }*/
	        
	   /*     int i = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();
	        String s = scan.nextLine();
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        */
	    	
	    	// Initialize sum and count of input elements 
	        int sum = 0, count = 0; 
	  
	        // Check if an int value is available 
	        while (scan.hasNextInt()) 
	        { 
	            // Read an int value 
	            int num = scan.nextInt(); 
	            sum += num; 
	            count++; 
	        } 
	        int mean = sum / count; 
	        System.out.println("Mean: " + mean); 
	    	
	        //scan.close();
	    }
	}


