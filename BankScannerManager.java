package methd;

import java.util.Scanner;

public class BankScannerManager {

	public static void main(String[] args) {
		
		
		int money = 0;
		int bolance = 10000;
		
	
		
		Scanner scanner = new Scanner(System.in);
		
		//사용중인 외부클래스 가져오기
		
		BankBookScanner atm = new BankBookScanner("유미정","123-456-789",5.5,50000);
		
		
		//기능 선택 출력 
		
		while(true) {
			System.out.println("========ATM========");
			System.out.println("입금/출금(1) 통장 정보 확인(2) 이율 확인/변경(3) ");
			int menu = scanner.nextInt();
		switch(menu) {
		case 1:
			System.out.println("금액을 입력하세요 (+,-) > ");
			int won = scanner.nextInt();
			if(won>0) { 
				bolance+=won;
				atm.setMoney(bolance);
				System.out.println("입금 완료 ");
			}else if(won<0) {
				bolance+=won;
				atm.setMoney(bolance);
				System.out.println("출금 완료 ");
			}
			break;
		
		case 2:
			atm.info();
			break;
			
		case 3:
			atm.inteInfo();
			System.out.println("이율 변경 입력 (0 : 종료 )> ");
			double change = scanner.nextDouble();
			if(change >0) {
				atm.setInte(change);
					System.out.println("이율 변경 완료 ");
					break;
				}else if(change == 0){
					break;
				}
			}
			

		}
		
		
		
		
	

	}

	}

