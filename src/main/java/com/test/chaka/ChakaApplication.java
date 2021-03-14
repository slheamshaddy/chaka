package com.test.chaka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ChakaApplication {

    
	public static void main(String[] args) {
		SpringApplication.run(ChakaApplication.class, args);		
		
		//Answer to question 1
		int no =getNoOfTimes(6);
		System.out.println("The Answer is "+ no);
	}
	
	
	
	
	
	//This method returns the number of times x can be reduced to 0 from either the leftmost
	//or rightmost array value otherwise it returns 0
	public static int getNoOfTimes(int x) {
		int numberOfTimes=0;
		int nums[] = {7,6,1,3,5,1,2,8,4,3,7,9,2,4,3,4,1,5,1,2,1};
		
		//Converted the arrays to ArrayList
		List <Integer>list = new ArrayList<Integer>();
		for(int text:nums) {
	         list.add(text);
	      }
	      System.out.println(list);
	      
	      
        //while x is greater than 0 run the loop
	      while(x>=0) {
	    	
	    	 //if the leftmost value is less than or equal to x or if the rightmost most
	    	 //value is less than or equal to x run the statement in this condition
	    	  if(list.get(0)<=x||list.get(list.size() - 1)<=x) {
	    		
	    		  //if the leftmost index value is less than or equal to x run the statement in
	    		  //in this condition 
	    	  if(list.get(0)<=x) {
	    		  //subtract the leftmost value from x
	    		 x = x - list.get(0); 
	    		 
	    		 //then remove the leftmost value
	    		 list.remove(0);
	    		
	    		 System.out.println(list);
	    		 
	    		 //add to the number of times this operation is carried out
	    		 numberOfTimes++;
	    	  }
	    	//if the rightmost index value is less than or equal to x run the statement in
    		  //in this condition
	    	  if(list.get(list.size() - 1)<=x){
	    		//subtract the rightmost value from x
	    		  x=x-list.get(list.size() - 1);
	    		  
	    		//then remove the rightmost value
	    		  list.remove(list.get(list.size() - 1));
	    		
	    		  System.out.println(list);
	    		//add to the number of times this operation is carried out
	    		  numberOfTimes++;
	    	  }
	    	  
	    	  }
	    	  //if both the leftmost index value and rightmost index value is greater than
	    	  //x and x hasn't been reduced to 0 yet then return -1
	    	  if(list.get(0)>x&&list.get(list.size() - 1)>x&&x!=0) {
	    		  numberOfTimes= -1;  
	    	  }
	    	  //if x has been reduced to 0 or it's not possible then break away from the loop
	    	  if(x==0|| numberOfTimes==-1)
	    		  break;
	      }
	      
	      return numberOfTimes;
	}

}
