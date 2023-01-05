package methd;

public class BankBookManager {

	public static void main(String[] args) {
		
		
		//통장정보 
		BankBook atm = new BankBook("유미정","123-456-789",5.5,5000);
		atm.info();
		
		
		System.out.println();
		
		//이율변경
		atm.setInte(3.3);
		atm.info();
		
		System.out.println();
		
		//계좌 변경 안됨 
//		atm.setNum("333-333-333");
//		atm.info();
		
		//입금 
		atm.setMin(50000);
		atm.info();
		
		
		
		
		
		
		
		
		
	
	}

}
