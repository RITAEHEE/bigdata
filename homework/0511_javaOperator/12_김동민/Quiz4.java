package Quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("���� ������ �Է��ϼ���");
		int kor = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int eng = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int mat = scanner.nextInt();
		int sum = kor + eng + mat;
		double ave = (kor+eng+mat)/3;
		System.out.println("���� : " +kor+"\t"+"���� : "+eng+"\t"+"���� : "+mat);
		System.out.printf("�հ� ���� : %d"+"\n"+"��� ���� : %.2f"+"\t" ,sum, ave);
		scanner.close();
		
	}

}
