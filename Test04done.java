package test;

import java.util.Scanner;

public class Test04done {

	public static void main(String[] args) {
		// ���簢����� ���Ǵ� ����*����*�����̴�. ���� ������ ���Ǵ� ���ΰ�?
		int l = 6;
		int w = 4;
		int h = 5;
		
		int V = l * w * h;
		
		System.out.println("���簢����� ���Ǵ� " + V + "�Դϴ�.");
		
		// �� ������ ����ڿ��� ����, ����, ���̸� �Է¹޾� ����� �� �ְ� �����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a*b*c;
		
		System.out.println("�Է� ���� ���� ���� ���簢������ ���Ǵ� " + d + " �Դϴ�.");
	}

}
