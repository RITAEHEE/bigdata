package Quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ��(n1)�� �Է��ϼ���.");
		int n1 = scanner.nextInt();
		System.out.println("�ι�° ��(n2)�� �Է��ϼ���.");
		int n2 = scanner.nextInt();
//		String result = (n1 == n2) ? "O" : "X" ;
//		System.out.println("�� ���� ��ġ�ұ��?" +result);
		String result = (n1>n2) ? "O" : "X" ;
		System.out.println("ù ��° ���� �� Ŭ���?" +result);
		scanner.close();
	}
}
