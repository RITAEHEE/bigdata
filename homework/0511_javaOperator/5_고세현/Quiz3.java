package Quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("두 수를 입력하세요");
		double su1 = scanner.nextDouble(); 
		double su2 = scanner.nextDouble();
		if (su1==su2) {
			System.out.println("O");
		} else if(su1>su2) {
			System.out.println("X 첫번째 수가 더 큽니다");			
		} else {
			System.out.println("X 두번째 수가 더 큽니다");	
		}
		
		scanner.close();
	}
}
