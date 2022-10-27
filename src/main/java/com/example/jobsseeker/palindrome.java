package com.example.jobsseeker;

public class palindrome {


		  public static void main(String[] args) {

		    String str = "Radar", reverseStr = "";
		    
		    int strLength = str.length();
		    

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome");
		    }
		    else {
		      System.out.println(str + " it is not a Palindrome");
		    }
		  }
	
}
