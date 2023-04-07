package test;

import java.util.Scanner;

public class Test11done {

	public static void main(String[] args) {
		int grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력하시오.");
		grade = sc.nextInt();
		
		switch(grade) {
		case 1:
			System.out.println("1학년 입니다.");
			break;
		case 2:
			System.out.println("2학년 입니다.");
			break;
		case 3:
			System.out.println("3학년 입니다.");
			break;
		case 4: 
			System.out.println("4학년 입니다.");
			break;
		default:
			System.out.println("학년을 잘 못 입력하였습니다.");
			break;
			
		}
	}

}
