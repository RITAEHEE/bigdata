package Quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("����, ����, ���� ������ ���� �Է��ϼ���"); 
		double kor = scanner.nextDouble(); 
		double eng = scanner.nextDouble(); 
		double math = scanner.nextDouble(); 
		
		double sum = kor+eng+math; 
		double avg = (kor+eng+math)/3; 
		
		System.out.printf("������  %.0f��, ����� %.2f �� �Դϴ�.",sum,avg);
		
		scanner.close(); 
	}
}
