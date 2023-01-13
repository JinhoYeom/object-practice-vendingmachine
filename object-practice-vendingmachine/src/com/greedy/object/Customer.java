package com.greedy.object;

import java.util.Scanner;

public class Customer {

	Scanner sc = new Scanner(System.in);



	private Drink drink = new Drink();
	private Wallet wallet = new Wallet();
	private int nowMoney = 0;


	public void needmoney() {
		int need = 0;
		nowMoney += wallet.needMoney(need);
	}

	public void showMon() {
		System.out.println("진구가 가진 돈은 : " + nowMoney + "원 입니다.");
		wallet.showMoney();
	}

	public void  showMenu() {
		drink.showDrink();
	}

	public void chooseDrink() {
		int price = drink.wantDrink(nowMoney);
		if(price == 0) {
			return;
		}
		nowMoney = nowMoney - price;
		System.out.println("자판기에 " + price + "원을 냅니다.");
		if(nowMoney > 0) {
			System.out.println("잔돈은" + nowMoney + "원 입니다.");
		}

	}

	public void shoppingList() {
		drink.drinkList();
	}
}


