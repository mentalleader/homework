package reminder;

import java.util.Arrays;
import java.util.Scanner;

public class Scan_1_5IntPl {

	public static void main(String[] args) {
	// 사용자에게 5개의 숫자를 입력받아 배열에 담아서 출력하시오.
		int[] five = new int[5];				// 5개의 배열 five를 만듬.
		Scanner sc = new Scanner(System.in);	// 입력받는 스캐너 타입 sc.
		int i;
		for (i=0; i<five.length; i++) {			// 5개의 배열을 반복하는데
			five[i] = sc.nextInt();				// i번째 입력받음.
		}
		System.out.print("입력한 5개 숫자의 배열은 " + Arrays.toString(five) + "입니다.");	// Arrays.toString 메소드를 통해 출력하기
		
	}

}
