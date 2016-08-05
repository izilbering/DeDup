package com.test;
import java.util.*;
public class DeDup {
    public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};  
  
 // Will keep original order   
 public static Integer[] RemoveDuplicates1(int[]arr) {
	   Set <Integer> noDuplicates =  new HashSet<Integer>();
	    
	      List<Integer> returnResults=new ArrayList<Integer>();
	      for (int nextInt : arr) {
	         if (!noDuplicates.contains(nextInt)) 
	         {  returnResults.add(nextInt);
	            
	            noDuplicates.add(nextInt);
	         }
	      }
	      return (Integer[])returnResults.toArray(new Integer[returnResults.size()]);
	   
 }
 
 // This method will return numbers in random order but code is shortest
 public static Integer[] RemoveDuplicates2(int[]arr) {
    Set <Integer>  returnResults =  new HashSet<Integer>();

    for (int nextInt : arr) 
        returnResults.add(nextInt);
    return (Integer[])returnResults.toArray(new Integer[returnResults.size()]);
 }

//Will keep original order  

 public static Integer[] RemoveDuplicates3(int[]arr) {
	  List<Integer>returnResults=new ArrayList<Integer>();	 
	 

	   for (int nextInt : arr)
		 if (!returnResults.contains(nextInt))
			 returnResults.add(nextInt);
		
	   return (Integer[])returnResults.toArray(new Integer[returnResults.size()]);
	 }
 
//Will keep original order 
 public static Integer[] RemoveDuplicates4(int[]arr) {
     Map <Integer,Integer> map=new HashMap();
     int i=0;
     for (int nextInt:arr)
      if (!map.containsKey(nextInt ))
       {   
 	      map.put(nextInt,i);
 	      i++;
       }
     Integer[] returnResults=new Integer[map.size()];
     for(int k:map.keySet())
 	  returnResults[map.get(k)]=k;
 	 return returnResults;
 } 

public static void main(String [] args) {
	 
	Integer[]results=RemoveDuplicates1(randomIntegers);
	System.out.println("RemoveDuplicates1 unique numbers="+results.length);
	for(int i: results)
		System.out.println(i+" ");
	 
   // Random order for this method
	
	Integer[] results2=RemoveDuplicates2(randomIntegers);
	System.out.println("RemoveDuplicates2 unique numbers="+results2.length);
	for(int i: results2) 
		System.out.println(i+" ");
	 
	
	 
	Integer[] results3=RemoveDuplicates3(randomIntegers);
	System.out.println("RemoveDuplicates3 unique numbers="+results3.length);
	for(int i: results3) 
		System.out.println(i+" ");
	
	 
	Integer[]results4=RemoveDuplicates4(randomIntegers);
	System.out.println("RemoveDuplicates4 unique numbers="+results4.length);
	
	for(int i: results4){
		// printing the contents of our array
		System.out.println(i+" ");
	}
	
}


}
