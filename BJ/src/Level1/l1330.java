package Level1;

import java.util.Scanner;

public class l1330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		// 한 줄 출력하는거 알기
		
//		if (A > B)
//			System.out.print(">");
//		else if (A < B)
//			System.out.print("<");
//		else
//			System.out.print("==");
		
		String result = (A>B) ? ">" : ((A<B)? "<" : "==");
		System.out.println(result);

	}

}
