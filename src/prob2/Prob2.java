package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		int money;
		int gold = 50000;
		int change = 0;
		
		System.out.print("금액: ");
		Scanner scanner = new Scanner(System.in);
		money = scanner.nextInt();
	
		System.out.println("");
		
		while(money>0){
			int count = 0;
			while(money > gold){
				money = money - gold;
				count++;
				if(money==1){
					count += 1;
				}
			}
			System.out.println(gold + "원 : "+count+"개");
			
			if(change == 0){
				gold = gold/5;
				change = 1;
			} else{
				gold = gold/2;
				change = 0;
			}
		}

	}
}

