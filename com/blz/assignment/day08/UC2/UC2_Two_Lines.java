package com.blz.assignment.day08.UC2;

import java.util.Scanner;


public class UC2_Two_Lines extends L1{

	public static void main(String[] args) {
		Length obj = new UC2_Two_Lines();
		obj.isEqual();
	}

}

interface Length {
	public void isEqual();
}

class L1 implements Length{
	static final Scanner sc = new Scanner(System.in);
	static int x1, x2, y1, y2,x3,x4,y3,y4;
	static double dis1,dis2;

	public void isEqual() {
		userInput();

		dis1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		dis2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println("length of this point is:" + "(" + x1 + "," + y1 + ")," + ""
				+ "(" + x2 + "," + y2 + ")===>" + dis1);
		System.out.println("length of this point is:" + "(" + x3 + "," + y3 + ")," + ""
				+ "(" + x4 + "," + y4 + ")===>" + dis2);
	    if (dis1==dis2) {
      	  System.out.println("Two lines are equal");
        }
        else {
      	  System.out.println("Both lines are differnt");
        }
	}

	public void userInput() {
		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();
		System.out.println("enter x3point");
		
		x3 = sc.nextInt();
		
		System.out.println("enter y3 point");
		
		y3 = sc.nextInt();
		System.out.println("enter x4point");
		
		x4 = sc.nextInt();
		
		System.out.println("enter y4 point");
		
		y4 = sc.nextInt();
	}
	
}
