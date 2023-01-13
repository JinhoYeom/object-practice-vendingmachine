package com.greedy.object;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
//	1. 노진구는 돈이 없는 상태로 시작한다.
//	2. 지갑은 5,000원을 가진 상태로 시작한다.
//	3. 노진구는 자판기에 준비된 음료 리스트를 확인하고 구매할 음료를 고를 수 있다. 
//	4. 자판기에서 고른 음료의 금액 만큼 노진구가 지갑에서 돈을 가져간다.
//	5. 지갑에게 충분한 액수의 돈이 준비되어 있지 않으면 음료수를 살 수 없다.
//	6. 지갑 보유금이 음료수를 사기에 충분하다면 음료수를 살 수 있다.
//	7. 자판기는 충분한 돈이 입금되었는지 확인하고
//	8. 그만 구매한다. 프로그램을 종료한다.
//
//	노진구가 수신할 수 있는 메소드
//	1. 지갑에서 돈을 꺼내기 - 매개변수 
//	2. 자판기에 돈을 넣기 (금액 결정)
//	3. 자판기의 음료수 선택한다.
//	4. 그만 사라 프로그램 종료
//
//	지갑이 수신할 수 있는 메소드
//	1. 보유자금 (5000원) - 전역변수
//	2. 노진구에게 돈을 제공한다.
//	3. 현재 남은 돈을 제공한다.
//
//	자판기가 수신할 수 있는 메소드
//	1. 노진구에게 돈을 받기
//	2. 음료수 리스트 제공
//	3. 선택된 음료수 제공(받은 돈이 모자라면 음료수 제공하지 않기)
//
//	음료수 자판기 선택지
//	1. 콜라 (1500원)
//	2. 밀크티(2500원)
//	3. 사이다 (1500원)
//	4. 초록매실 (2000원)
//	5. 초코우유 (1000원)
//	6. 딸기우유 (1000원)
//	7. 바나나우유 (1500원)
//	8. 포카리스웨트(3000원)
//	9. 파워에이드(2500원)
	Customer jingu = new Customer();
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("======== 자판기에서 음료수 뽑기 ========");
		System.out.println("1. 현재 남은돈 확인");
		System.out.println("2. 지갑에서 돈 가져가기");
		System.out.println("3. 음료수 메뉴 확인");
		System.out.println("4. 음료수 고르기 ");
		System.out.println("5. 산 음료수 목록");
		System.out.println("9. 그만사기");
		System.out.print("행동 선택 : ");
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : jingu.showMon(); 
		         break;
		case 2 : jingu.needmoney(); 
				 break;
		case 3 : jingu.showMenu(); 
				 break;
		case 4 : jingu.chooseDrink(); 
				 break;
		case 5 : jingu.shoppingList();	
				 break;
		case 9 :System.out.println("구입을　종료하고　집으로 갑니다."); 
				return;
		default : System.out.println("잘못된 번호를 선택하셨습니다.");
				  break;
		}
	
}
}
}
