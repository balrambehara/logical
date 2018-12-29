package com.cb.logicals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EvenOddClass {
	
	private static Map<String,List<Integer>> evenOdd(int start , int end){
		Map<String , List<Integer>> result = null;
		List<Integer> even=null, odd=null;
		//create List object
		even = new ArrayList<>();
		odd = new ArrayList<>();
		//create Map object
		result  = new HashMap<>();
		for(int i =start;i<=end;i++) {
			
			if(i%2==0) {
				even.add(i);
			}else {
				odd.add(i);
			}//if-else
		}//for
		result.put("even", even);
		result.put("odd", odd);
		return result;
	}//evenOdd
	
	public static void main(String[] args) {
		int start=0,end=0;
		Scanner sc = null;
		Map<String, List<Integer>> result = null;
		
		System.out.println("::Welcome to Even Odd Application::");
		//create  a Scanner Object 
		sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:: ");
		start = sc.nextInt();
		
		System.out.println("Enter Second Number:: ");
		end = sc.nextInt();
		//create Map object
		result = new HashMap<>();
		
		result = EvenOddClass.evenOdd(start, end);
	
		//iterate the map object
		for(Map.Entry<String, List<Integer>> li:result.entrySet()) {
			System.out.println("\n-------*-------*-------*-------");
			System.out.println("All the "+li.getKey()+" Values are as follows:: \n");
			li.getValue().forEach(num-> System.out.print(num+" , "));
		}//for-each loop
		
		//by message
		System.out.println("\n\n::Thanks for using our application::\n Please Visit again :)");
	}//main()

}//class
