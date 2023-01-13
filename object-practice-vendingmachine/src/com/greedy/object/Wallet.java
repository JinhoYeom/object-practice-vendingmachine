package com.greedy.object;

import java.util.Scanner;

public class Wallet {
	
	Scanner sc = new Scanner(System.in);
	private int mon = 5000;

	public void showMoney()	{
		if(mon == 0){
			System.out.println("현재 지갑에 남은 금액이 없습니다.");
			return;
		}
		System.out.println("현재 지갑에 남은 금액은 " + mon + "원 입니다.");

	}
	public int needMoney(int need) {
		if(mon == 0){
			System.out.println("지갑에 더 이상 남은 돈이 없습니다.");
			return 0;
		}
		System.out.print("지갑에서 얼마를 꺼낼까요?(0번을 누르면 취소합니다.) : ");
		need = sc.nextInt();
		if(need == 0) {
			System.out.println("지갑에서 돈 가져오기를 취소합니다.");
			return 0;
		}
		if(need < 0) {
			System.out.println("정확한 금액을 입력해주세요.");
			return 0;
		} else if(need > mon) {
			System.out.println("지갑에 " + need + "만큼의 돈이 없습니다.");
			return 0;
		}
		mon = mon - need;
		System.out.println("지갑에서 " + need + "원을 꺼냈습니다.");
		System.out.println("지갑에 남은 잔액은" + mon + "원입니다.");
		return need;
	}

}
