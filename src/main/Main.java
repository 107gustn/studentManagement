package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean flag = true;
		
		while(flag) {
			System.out.println("====  �л����� ���α׷� �Դϴ�.  ====");
			System.out.println("1.�л� ���");
			System.out.println("2.�л� �˻�");
			System.out.println("3.�л� ����");
			System.out.println("4.�л� ����");
			System.out.println("5.��� �л� ���");
			System.out.println("6.����");
			System.out.print(">>>> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				flag = false;
				break;
			default:
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
			}
		}

	}

}