package reminder;

import java.util.Arrays;
import java.util.Scanner;

public class Scan_4_scan {

	public static void main(String[] args) {
	//	1-10까지 저장된 배열 10개를 저장해두고, 검색할 숫자를 입력하여 찾아라.
		int[] ten = new int[10];				// 10개의 배열 공간 저장
		Scanner sc = new Scanner(System.in);
		int i;
		for (i=0; i<ten.length; i++) {
			ten[i] = i+1;
		}
		System.out.println(Arrays.toString(ten));	// 배열 인쇄
		ten[i] = sc.nextInt();						// 수 입력

	}

}
