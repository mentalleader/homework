package test;

import java.util.Scanner;

public class Test05done {

	public static void main(String[] args) {
		// ������ �Է� �޾�, ���밪�� ǥ�����ִ� ���α׷��� �ۼ��϶�(���׿����ڸ� ����Ͻÿ�).
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = (a>=0) ? a : -a;
		System.out.println(b);
				
		
		// int x=2; ���� x�� ���� ¦������ Ȧ������ �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int x=2;
		int y=x%2;
		String z= (y==0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println("x�� 2�� " + z);
		
		
		// ���� ¦Ȧ ���� ���α׷��� ����ڿ��� ���� �Է¹޴� ������� �����Ͻÿ�.
		Scanner sc2 = new Scanner(System.in);
		int m = sc2.nextInt();
		
		int n=m%2;
		String p = n==0 ? "�Է��Ͻ� ���� ¦���Դϴ�." : "�Է��Ͻ� ���� Ȧ���Դϴ�.";
		System.out.println(p);
	}

}
