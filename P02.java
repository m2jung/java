import java.util.Scanner;

public class P02 {

	public static void main(String[] args){
	
		Scanner scn = new Scanner(System.in);
		
		//double을 이용하여 세과목의 평균 점수는?
		
		System.out.print("국어 점수를 입력하시오 ");
		int a = scn.nextInt();
		System.out.print("수학 점수를 입력하시오 ");
		int b = scn.nextInt();
		System.out.print("영어 점수를 입력하시오 ");
		int c = scn.nextInt();
		
		double sum = (a+b+c);
		double average = sum / 3;
		
		System.out.println("당신의 점수 합계는 " + sum);
		System.out.println("당신의 평균 점수는 " + average + "입니다.");
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
