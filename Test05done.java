package test;

import java.util.Scanner;

public class Test05done {

	public static void main(String[] args) {
		// 정수를 입력 받아, 절대값을 표시해주는 프로그램을 작성하라(삼항연산자를 사용하시오).
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = (a>=0) ? a : -a;
		System.out.println(b);
				
		
		// int x=2; 에서 x의 값이 짝수인지 홀수인지 판단하는 프로그램을 작성하시오.
		int x=2;
		int y=x%2;
		String z= (y==0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("x값 2는 " + z);
		
		
		// 위의 짝홀 구분 프로그램을 사용자에게 값을 입력받는 방식으로 변경하시오.
		Scanner sc2 = new Scanner(System.in);
		int m = sc2.nextInt();
		
		int n=m%2;
		String p = n==0 ? "입력하신 수는 짝수입니다." : "입력하신 수는 홀수입니다.";
		System.out.println(p);
	}

}
