package reminder;

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
		
		//변수 8,9번째 자리 값에 따라, 각 출생지역에 맞는 값을 출력하시오.
		String temp = str.substring(8,10);
		int sido = Integer.parseInt(temp);
		
		if (sido==00||sido==01||sido==02||sido==03||sido==04||sido==05||sido==06||sido==07) {
			System.out.println("당신은 서울 출생입니다.");
		} else if (sido==10||sido==11||sido==12) {			// 08과 09값에서 에러발생함.
			System.out.println("당신은 부산 출생입니다.");
		} else if (sido==13||sido==14||sido==15) {
			System.out.println("당신은 인천 출생입니다.");
		} else if (sido==16||sido==17||sido==18||sido==19||sido==20||sido==21||sido==22||sido==23||sido==24||sido==25) {
			System.out.println("당신은 경기도 출생입니다.");
		} else if (sido==26||sido==27||sido==28||sido==29||sido==30||sido==31||sido==32||sido==33||sido==34) {
			System.out.println("당신은 강원도 출생입니다.");
		} else if (sido==35||sido==36||sido==37||sido==38||sido==39) {
			System.out.println("당신은 충청북도 출생입니다.");
		} else if (sido==40||sido==41) {
			System.out.println("당신은 대전 출생입니다.");
		} else if (sido==42||sido==43||sido==45||sido==46||sido==47) {
			System.out.println("당신은 충청남도 출생입니다.");
		} else if (sido==44||sido==96) {
			System.out.println("당신은 세종시 출생입니다.");
		} else if (sido==48||sido==49||sido==50||sido==51||sido==52||sido==53||sido==54) {
			System.out.println("당신은 전라북도 출생입니다.");
		} else if (sido==55||sido==56||sido==57||sido==58||sido==59||sido==60||sido==61||sido==62||sido==63||sido==64) {
			System.out.println("당신은 전라남도 출생입니다.");
		} else if (sido==55||sido==56||sido==65||sido==66) {
			System.out.println("당신은 광주 출생입니다.");
		} else if (sido==67||sido==68||sido==69) {
			System.out.println("당신은 대구 출생입니다.");
		} else if (sido==70||sido==71||sido==72||sido==73||sido==74||sido==75||sido==76||sido==77||sido==78||sido==79||sido==80||sido==81) {
			System.out.println("당신은 경상북도 출생입니다.");
		} else if (sido==82||sido==83||sido==84||sido==86||sido==87||sido==88||sido==89||sido==90||sido==91) {
			System.out.println("당신은 경상남도 출생입니다.");
		} else if (sido==85||sido==90) {
			System.out.println("당신은 울산 출생입니다.");
		} else if (sido==92||sido==93||sido==94||sido==95) {
			System.out.println("당신은 제주도 출생입니다.");
		}
	}

}
