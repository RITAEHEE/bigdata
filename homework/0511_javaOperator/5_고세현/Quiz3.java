package Quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("�� ���� �Է��ϼ���");
		double su1 = scanner.nextDouble(); 
		double su2 = scanner.nextDouble();
		if (su1==su2) {
			System.out.println("O");
		} else if(su1>su2) {
			System.out.println("X ù��° ���� �� Ů�ϴ�");			
		} else {
			System.out.println("X �ι�° ���� �� Ů�ϴ�");	
		}
		
		scanner.close();
	}
}
