package Quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� :");
		int ins = scanner.nextInt();
		String result = (ins%2)==0 ? "¦��" : "Ȧ��";
			System.out.println("�Է��Ͻ� ���� "+ result + " �Դϴ�.");
		
		scanner.close();
				
}
}
