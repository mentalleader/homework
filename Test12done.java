package test;

import java.util.Scanner;

public class Test12done {

	public static void main(String[] args) {
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("�г��� �Է��Ͻÿ�.");
		grade = sc.nextLine();
		int z = grade;
		
		switch(grade) {
		case 1:
			System.out.println("1�г� �Դϴ�.");
			break;
		case 2:
			System.out.println("2�г� �Դϴ�.");
			break;
		case 3:
			System.out.println("3�г� �Դϴ�.");
			break;
		case 4: 
			System.out.println("4�г� �Դϴ�.");
			break;
		default:
			System.out.println("�г��� �� �� �Է��Ͽ����ϴ�.");
			break;

		}

	}
