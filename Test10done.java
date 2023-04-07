package test;

import java.util.Scanner;

public class Test10done {

	public static void main(String[] args) {
		// 변수 gender의 값이 '2'또는'4'라면 "여자", '1'또는'3'이라면 "남자"를 출력하시오.
		
		System.out.println("주민번호를 입력하세요. ex) 012345-7890123");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();  // 사용자에게 String의 값을 입력받은 함수 nextLine()을 호출해 String의 값을 얻는다.
		char gender = str.charAt(7); // 받은 값 중 7번째 index의 char값 하나만 추출해서 char타입의 변수에 담아준다.
		System.out.println(gender);  // 추출된 값을 출력한다.
		
		if (gender == '2'|| gender == '4') {
			System.out.println("당신은 여자입니다.");
		} else if (gender == '1' || gender == '3') {
			System.out.println("당신은 남자입니다.");
		}
		sc.close();
	}

}
