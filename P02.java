import java.util.Scanner;

public class P02 {
	
	public static void main(String [] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("ID를 입력하세요  ");
		String id = scanner.next();
		
		System.out.print("PW를 입력하세요  ");
		int pw = scanner.nextInt();
		
		System.out.print("mail 주소를 입력하세요 ");
		String mail = scanner.next();
		
		System.out.println();
		
		System.out.println("당신의 ID는 " + id + "@" + mail);
		System.out.print("비밀번호는 " + pw + " 맞습니까?");
		
		System.out.println();
		
		String a = scanner.next();
		
		System.out.println("축하합니다! 가입이 완료 됐습니다!");
		
		
	}

}
