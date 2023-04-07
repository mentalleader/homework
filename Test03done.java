package test;

import java.util.Scanner;

public class Test03done {

	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("");
		
		int python = 60; 
		int java = 70;
		int android = 80;
		int C = 50;
		int cpp = 30;
		
		int sum = python + java + android + C + cpp;
		double average = sum/5;
		
		System.out.println("나잘난의 성적 총합계는 " + sum + " 입니다. 평균은 " + average + "입니다.");	
	}

}
