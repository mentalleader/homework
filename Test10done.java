package test;

import java.util.Scanner;

public class Test10done {

	public static void main(String[] args) {
		// ���� gender�� ���� '2'�Ǵ�'4'��� "����", '1'�Ǵ�'3'�̶�� "����"�� ����Ͻÿ�.
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ���. ex) 012345-7890123");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();  // ����ڿ��� String�� ���� �Է¹��� �Լ� nextLine()�� ȣ���� String�� ���� ��´�.
		char gender = str.charAt(7); // ���� �� �� 7��° index�� char�� �ϳ��� �����ؼ� charŸ���� ������ ����ش�.
		System.out.println(gender);  // ����� ���� ����Ѵ�.
		
		if (gender == '2'|| gender == '4') {
			System.out.println("����� �����Դϴ�.");
		} else if (gender == '1' || gender == '3') {
			System.out.println("����� �����Դϴ�.");
		}
		sc.close();
	}

}
