package test;

import java.util.Scanner;

public class Test06done {

	public static void main(String[] args) {
		// 원기둥의 반지금 3, 높이 7인 경우의 부피는? (단, π는 3.14f)
		int r=3;
		int h=7;
		float PI=3.14f;
		float v= PI*r*r*h;
		
		System.out.println("부피는 " + v + "입니다.");
		
		
		// 위 문제를 사용자에게 반지름과 높이를 입력받는 방식으로 바꾸시오.
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int h1 = sc.nextInt();
		
		float v2= PI*r1*r1*h1;
		
		System.out.println("입력하신 값의 부피는 " + v2 + "입니다.");

	}

}
