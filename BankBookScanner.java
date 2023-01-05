package methd;

import java.util.Scanner;

public class BankBookScanner {
	
	Scanner scanner = new Scanner(System.in);

	/*
	 * 하나의 은행 계좌를 관리하는 BankBook class 를 정의하고, 
	 * BankBookManager class 에서 테스트 하세요
	 * - 이율 : 한번의 설정으로 모든 계좌의 이율 변경 가능
	 *   계좌번호 : 한번 설정 후 변경 불가
	 *   고객명, 잔액
	 * - 기능 : 입/출금, 통장 정보 확인, 이율 확인/변경 가능
	*/
	
	
	private String name; //고객명 
	private final String acc; //계좌번호
	private int money; //잔액
	private double inte;  //이율 
	

	//생성자 
	public BankBookScanner (String name,String acc,double inte, int money){
		this.name = name;
		this.acc = acc;
		this.inte = 0;
		this.money = 0;

	}

	
	//이율 확인 
	void inteInfo() {
		System.out.println("이율: " + inte + "%");
	}
	
	//이율 변경  
		public double getInte() {return inte;}
		public void setInte (double inte) {
			this.inte = inte;
		}
	
	//잔액
		public int getMoney() {return money;}
		public void setMoney(int money) {
			this.money = money;
		}

	
	//출력
	void info() {
		System.out.println("-------통 장 정 보------");
		System.out.println("고객명  : " + name);
		System.out.println("계좌번호 : " + acc);
		System.out.println("이율    : " + inte + "%");
		System.out.println("잔액    : " + money + "");
		
	}
	
	
	
	}
	
	
	

	

