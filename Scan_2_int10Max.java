package reminder;

import java.util.Scanner;

public class Scan_2_int10Max {

	public static void main(String[] args) {
	// 정수 10개를 입력받아 가장 큰 값을 구하라.
		int[] max = new int[10];				// 10개의 배열을 가진 max 설정.
		Scanner sc = new Scanner(System.in);
		int i; 
		int big = max[0];						// 처음 big 값은 max[0]
		for (i=0; i<max.length; i++) {			
			max[i] = sc.nextInt();				// 정수 10개를 입력받음.
			if (max[i]>big) {					// i번째 값이 첫번째 값보다 크면
				big = max[i];					// 큰 값은 그 i번째 값이 되고
			} 									// 아니면 첫번째 값이 큰 값이다.
		}
		System.out.println(big);
		
		
	}

}
