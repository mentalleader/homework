package test;

import java.util.Scanner;

public class Test06done {

	public static void main(String[] args) {
		// ������� ������ 3, ���� 7�� ����� ���Ǵ�? (��, ��� 3.14f)
		int r=3;
		int h=7;
		float PI=3.14f;
		float v= PI*r*r*h;
		
		System.out.println("���Ǵ� " + v + "�Դϴ�.");
		
		
		// �� ������ ����ڿ��� �������� ���̸� �Է¹޴� ������� �ٲٽÿ�.
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int h1 = sc.nextInt();
		
		float v2= PI*r1*r1*h1;
		
		System.out.println("�Է��Ͻ� ���� ���Ǵ� " + v2 + "�Դϴ�.");

	}

}
