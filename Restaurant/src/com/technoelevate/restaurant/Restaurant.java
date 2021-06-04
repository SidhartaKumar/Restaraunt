package com.technoelevate.restaurant;

import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
	       String[] items= {"2 Chicken Krispy Burger","Mixed Zinger Double","PopCorn Rice Bowl","Chicken and Fries Bucket",
	    		   "4pcs Hot and Crispy","Large Popcorn","Medium Popcorn","6pcs Boneless Strip","1pcs Hot and Crispy",
	    		   "Ultimate Saving Bucket"}; 
	       int price []= {199,150,200,250,199,120,100,200,80,599} ;
	       int total =0;

	      
	      System.out.println("Welcome to KFC ");
	      System.out.println("---------------------------");
	      
	      System.out.println("Menu:");

	      for (int i = 0; i < price.length; i++) {
			System.out.println(i+". "+items[i]+":"+" Rs:"+price[i]);
			
		}
	      
	      System.out.println("_______________________________________");

	      System.out.println("Enter Respective Serieal Number to Select the Item");
	      Scanner sc = new Scanner(System.in);
	      int order[] = new int[10];
	      for (int i = 0; i < order.length; i++) {
	    	  order[i]=-1;
	      }
	      for (int i = 0; i < order.length; i++) {
	    	
	    	  System.out.println("Select Item Below");
	    	 int select=sc.nextInt();
			
			if(select<0|| select>10) {
				System.out.println("Incorrect Serial Number please select between 0-9");
				System.out.println("Please select item from menu");
				break;
			}
			order[i]=select;
			System.out.println("Add More items press Y for yes  or N for no");
			String flag = sc.next();
		
			
			if(flag.matches("N")) {
				System.out.println("Thanks For Ordering with us: ");
				i=11;
			}
		}
	     
	      
	      for (int i = 0; i < order.length; i++) {
	    	 
	    	if(order[i]>=0)
			total=total+price[order[i]];
	    	
			
		}
	      System.out.println(total+" Is Your Total Amount");
	      
	     
	      
	      
	      
		}

}
