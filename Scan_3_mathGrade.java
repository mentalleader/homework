package reminder;

import java.util.Scanner;

public class Scan_3_mathGrade {

	public static void main(String[] args) {
	// 5명의 수학점수를 입력 받아 총점과 평균을 구하라.
		System.out.println("5명의 수학점수를 입력하시오.");
		int[] math = new int[5];				// 수학점수 배열 5개의 math 배열을 만듬.
		Scanner sc = new Scanner(System.in);	
		int i, total=0, average;
		for (i=0; i<math.length; i++) {
			math[i] = sc.nextInt();
			total += math[i];
		}
		average = total / i;
		System.out.println("5명의 수학점수 총점은 " + total + "이고, 평균은 " + average + "입니다.");
		

	}

}
