package methd;

import java.util.Scanner;

public class BankBook {

	
	/*
	 * 하나의 은행 계좌를 관리하는 BankBook class 를 정의하고, 
	 * BankBookManager class 에서 테스트 하세요
	 * - 이율 : 한번의 설정으로 모든 계좌의 이율 변경 가능
	 *   계좌번호 : 한번 설정 후 변경 불가
	 *   고객명, 잔액
	 * - 기능 : 입/출금, 통장 정보 확인, 이율 확인/변경 가능
	*/
	
	private String name; //고객명
	private final String num; //계좌번호
	private double inte;   //이율
	private int plu;    //입금
	private int min;    //출금 
	private int money;  //잔액
	
	
	
	//고객 정보 입력 
	public BankBook(String name,String num,double inte,int money){
		this.name = name;
		this.num = num;
		this.inte = inte;
		this.money = money;
	}
	
	
	//계좌 변경 안됨  
	
	public String getNum() {return num;}
	public void setNum (String num) {
		this.num = num;	
	}
	
	
	//이율 변경  
	public double getInte() {return inte;}
	public void setInte (double inte) {
		this.inte = inte;
	}
	

	// 출금
	public int getMin() {return min;}
	public void setMin (int min) {
		if(min>0) {
			this.plu = money;
		}else 
			System.out.println("금액을 다시 입력하세요.");		
	}
	
	// 입금  
	public int gePlu() {return plu;}
	public void setPlu (int plu) {
		if(plu>0) {
			this.plu = money;
		}else 
			System.out.println("금액을 다시 입력하세요.");
		}
	 
	
	
	//통장 정보 
	void info() {
		System.out.println("==통 장 정 보 ==");
		System.out.println("고객명  : " + name);
		System.out.println("계좌번호 : " + num);
		System.out.println("이율    : " + inte + "%");
		System.out.println("잔액    : " + money + "");
		
	}

	
	
}
