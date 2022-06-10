package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean flag = true;
		
		while(flag) {
			System.out.println("====  학생관리 프로그램 입니다.  ====");
			System.out.println("1.학생 등록");
			System.out.println("2.학생 검색");
			System.out.println("3.학생 삭제");
			System.out.println("4.학생 수정");
			System.out.println("5.모든 학생 출력");
			System.out.println("6.종료");
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
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("번호를 다시 입력해주세요.");
			}
		}

	}

}