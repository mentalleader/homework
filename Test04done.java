package test;

import java.util.Scanner;

public class Test04done {

	public static void main(String[] args) {
		// 직사각기둥의 부피는 가로*세로*높이이다. 다음 도형의 부피는 얼마인가?
		int l = 6;
		int w = 4;
		int h = 5;
		
		int V = l * w * h;
		
		System.out.println("정사각기둥의 부피는 " + V + "입니다.");
		
		// 위 문제를 사용자에게 가로, 세로, 높이를 입력받아 출력할 수 있게 수정하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a*b*c;
		
		System.out.println("입력 받은 값에 의한 정사각기중의 부피는 " + d + " 입니다.");
	}

}
