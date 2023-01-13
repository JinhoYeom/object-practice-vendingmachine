package com.greedy.object;

import java.util.Scanner;

public class Drink {
	
	Scanner sc = new Scanner(System.in);
	
	String[] menu = new String[] {"1.콜라(1500원)", "2.밀크티(2500원)", "3.사이다(1500원)", "4.초록매실(2000원)", "5.초코우유(1000원)", "6.딸기우유(1000원)", "7.바나나우유(1500원)", "8.포카리스웨트(3000원)", "9.파워에이드(2500원)"};
	String[] shopping = new String[] {"콜라", "밀크티", "사이다", "초록매실", "초코우유", "딸기우유", "바나나우유", "포카리스웨트", "파워에이드"};
	
	private String buyDrinkList = "";
	
	public void showDrink() {
		System.out.println("======== 자판기 메뉴 ========");
		for (int i = 0; i <= 4; i++) {
			System.out.print(menu[i] + " ");
		}
		System.out.println();
		for (int i = 5; i < menu.length; i++) {
			System.out.print(menu[i] + " ");
		}
		System.out.println();
	}
	
	public int wantDrink(int nowMoney) {
		System.out.print("원하는 음료의 번호를 입력하세요(0번을 누르면 취소합니다.) : ");
		int wDrink = sc.nextInt();
		int price = 0;
		switch(wDrink) {
		case 0 :
			System.out.println("구매를 취소합니다.");
			return 0;
		case 1 :
			price = 1500;
			break;
		case 2 :
			price = 2500;
			break;
		case 3 :
			price = 1500;
			break;
		case 4 :
			price = 2000;
			break;
		case 5 :
			price = 1000;
			break;
		case 6 :
			price = 1000;
			break;
		case 7 :
			price = 1500;
			break;
		case 8 :
			price = 3000;
			break;
		case 9 :
			price = 2500;
			break;
}
		if(price == 0) {
			System.out.println("해당하는 음료가 없습니다. 메뉴를 다시 확인하세요.");
			return price;
		}
		if(nowMoney < price) {
			System.out.println("현재 " + (price - nowMoney) + "원 만큼의 돈이 없습니다.");
			System.out.println("지갑에서 돈을 가져오세요.");
			return 0;
		}
		System.out.println(shopping[wDrink-1] + "을 구매했습니다.");
		buyDrinkList += shopping[wDrink-1] + " ";
		return price;
	}
	
	public void drinkList() {
		if(buyDrinkList == "") {
			System.out.println("아직 구매한 음료수가 없습니다.");
			return;
		}
		System.out.println("지금까지 구입한 음료수는 " + buyDrinkList + "입니다.");
		return;
	}
	}


