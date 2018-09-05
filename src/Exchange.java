import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//입력 받기 위한 변수 선언
	        int ten_won;//10원 짜리 한화 변수
		int fifty_won;//50원 짜리 한화 변수
		int one_hundred_won;//100원 짜리 한화 변수
		int five_hundred_won;//500원 짜리 한화 변수
		int sum;//저금 총액 변수
		int dollar;//달러 액수를 나타내는 변수
		int extra_won;//남은 한화를 나타내는 변수
		final int EXCHANGE_LATE=1060;//환율 변수를 프로그램 내에서 상수로 선언(달러당 1060원)
		
		System.out.println("500원 개수 입력:");//500원 짜리 한화 갯수 입력
		five_hundred_won=input.nextInt();
		System.out.println("100원 개수 입력:");//100원 짜리 한화 갯수 입력
		one_hundred_won=input.nextInt();
		System.out.println("50원 개수 입력:");//50원 짜리 한화 갯수 입력
		fifty_won=input.nextInt();
		System.out.println("10원 개수 입력:");//10원 짜리 한화 갯수 입력
		ten_won=input.nextInt();
		
		sum=(five_hundred_won*500)+(one_hundred_won*100)+(fifty_won*50)+(ten_won*10);//저금 총액을 계산하는 과정
		dollar=sum/EXCHANGE_LATE;//환전하여 얻게 되는 달러 액수를 계산하는 과정
		extra_won=sum-(EXCHANGE_LATE*dollar);//달러로 환전하고 남게 되는 한화를 계산하는 과정
		
		System.out.println("저금 총액 = "+sum);//저금 총액 출력
		System.out.println("달러 액수 = "+dollar);//달러 액수 출력
		System.out.println("남은 한화 = "+extra_won);//남은 한화 출력
	}
}
