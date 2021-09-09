package chessboard;

import java.util.Scanner;

public class Chessboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if((a >= 8 && a <= 50) && (b >= 8 && b <= 50) ){ // 8이상 50이하 조건 
			char board [][] = new char[a][b]; // 사용자가 입력한 크기의 보드 배열 생성
			
			String s = sc.next();
			for(int i = 0; i < b;i++) {
				char c = s.charAt(i);
				board[0][i] = c;
				System.out.print(board[0][i] + "  ");
			}
			
			
			System.out.println(board[0][0]);
		}else {
			System.out.println("error");
		}
		
		
	
		
	}

}
