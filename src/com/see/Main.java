package com.see;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		//Arrays
		System.out.println("--------------Arrays------------");
		
		String[] nameofarray = {"Student1", "Student2", "Student3", "Student4"};
		//System.out.println(nameofarray.length);
		//System.out.println(nameofarray[1]);
		//System.out.println(nameofarray[2]);
		nameofarray[2] = "Student5";		
		//System.out.println(nameofarray[2]);
		
		/*for(int i = 0; i < nameofarray.length; i++) {
			System.out.println(nameofarray[i]);
		}*/
	
		for(String i: nameofarray) {
			//System.out.println(i);
		}
		int x = 0;
		int y = 0;
		/*
		while (x < 30) {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.print("|");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(x);
			y = x;
			
			if(y > 3) {
				break;
			}else {
				x++;
				continue;
			}			
			

		
			
		}
	*/
		
		/*
		 * 1 = sunday
		 * 2 = monday 
		 * 3 = tuesday
		 * 4 = wedneday
		 */
		System.out.println("--------------Switches------------");
		int u = 1;
		/*
		if(u == 0) {
			System.out.println("SUNDAY");
		}else if(u == 1) {
			System.out.println("MONDAY");
		}else if(u == 2) {
			System.out.println("Tuesday");
		}else if(u == 3) {
			System.out.println("Wed");
		}
		*/
		String ansgiven = "dd";
		switch (ansgiven) {
		case "a":
			System.out.println("a");
			break;
		case "b":
			System.out.println("b");
			break;
		case "c":
			System.out.println("c");
			break;
		case "d":
			System.out.println("d");
			break;
		default:
			System.out.println("Not an option");
		}
		
		
		
		/*
		 * 15 Ques randomly in array
		 * ans array
		 * 
		 * what is the national animal of India? a
		 * What is the national bird of India? c
		 * Sorry game over
		 * 
		 * Arrays
		 * Switches
		 * Variables
		 * Classes & Objects
		 * Inheritance
		 * Loops for/While
		 * 
		 */
		
	}

}
