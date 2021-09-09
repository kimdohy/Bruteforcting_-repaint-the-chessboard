package chessboard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if((a >= 8 && a <= 50) && (b >= 8 && b <= 50)){ // 8이상 50이하 조건 
			char board [][] = new char[a][b]; // 사용자가 입력한 크기의 보드 배열 생성
			
			for(int i = 0;i<a;i++) {
				String s = sc.next();
				for(int j = 0;j<b;j++) {
					char c = s.charAt(j);
					board[i][j] = c;
				}
			}
			System.out.println(board[9][12]);
		}else {
			System.out.println("error");
		}
	}

}

