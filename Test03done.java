package test;

import java.util.Scanner;

public class Test03done {

	public static void main(String[] args) {
		System.out.println("������ �Է����ּ���.");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a>=60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
		System.out.println("");
		
		int python = 60; 
		int java = 70;
		int android = 80;
		int C = 50;
		int cpp = 30;
		
		int sum = python + java + android + C + cpp;
		double average = sum/5;
		
		System.out.println("���߳��� ���� ���հ�� " + sum + " �Դϴ�. ����� " + average + "�Դϴ�.");	
	}

}
