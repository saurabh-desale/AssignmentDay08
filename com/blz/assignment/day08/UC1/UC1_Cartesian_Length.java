package com.blz.assignment.day08.UC1;

import java.util.Scanner;

public class UC1_Cartesian_Length extends L1 {

	public static void main(String[] args) {
		Length obj = new UC1_Cartesian_Length();
		obj.lengthOfLine();
	}

}

interface Length {
	public double lengthOfLine();
}

class L1 implements Length{
	static final Scanner sc = new Scanner(System.in);
	static int x1, x2, y1, y2;
	static double dis;

	public double lengthOfLine() {
		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();

		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("length of this point is:" + "(" + x1 + "," + y1 + ")," + ""
				+ "(" + x2 + "," + y2 + ")===>" + dis);
		sc.close();
		return dis;		
	}
	
}