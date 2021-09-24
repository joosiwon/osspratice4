package project4;

import java.util.Scanner;

public class Rectangel {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	
	public static void main(String[] args) {
		Rectangel rect = new Rectangel();
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		sc.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
