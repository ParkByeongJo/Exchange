import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//�Է� �ޱ� ���� ���� ����
	    int ten_won;//10�� ¥�� ��ȭ ����
		int fifty_won;//50�� ¥�� ��ȭ ����
		int one_hundred_won;//100�� ¥�� ��ȭ ����
		int five_hundred_won;//500�� ¥�� ��ȭ ����
		int sum;//���� �Ѿ� ����
		int dollar;//�޷� �׼��� ��Ÿ���� ����
		int extra_won;//���� ��ȭ�� ��Ÿ���� ����
		final int EXCHANGE_LATE=1060;//ȯ�� ������ ���α׷� ������ ����� ����(�޷��� 1060��)
		
		System.out.println("500�� ���� �Է�:");//500�� ¥�� ��ȭ ���� �Է�
		five_hundred_won=input.nextInt();
		System.out.println("100�� ���� �Է�:");//100�� ¥�� ��ȭ ���� �Է�
		one_hundred_won=input.nextInt();
		System.out.println("50�� ���� �Է�:");//50�� ¥�� ��ȭ ���� �Է�
		fifty_won=input.nextInt();
		System.out.println("10�� ���� �Է�:");//10�� ¥�� ��ȭ ���� �Է�
		ten_won=input.nextInt();
		
		sum=(five_hundred_won*500)+(one_hundred_won*100)+(fifty_won*50)+(ten_won*10);//���� �Ѿ��� ����ϴ� ����
		dollar=sum/EXCHANGE_LATE;//ȯ���Ͽ� ��� �Ǵ� �޷� �׼��� ����ϴ� ����
		extra_won=sum-(EXCHANGE_LATE*dollar);//�޷��� ȯ���ϰ� ���� �Ǵ� ��ȭ�� ����ϴ� ����
		
		System.out.println("���� �Ѿ� = "+sum);//���� �Ѿ� ���
		System.out.println("�޷� �׼� = "+dollar);//�޷� �׼� ���
		System.out.println("���� ��ȭ = "+extra_won);//���� ��ȭ ���
	}
}
