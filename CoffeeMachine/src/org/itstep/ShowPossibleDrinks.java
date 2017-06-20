package org.itstep;

import java.util.*;

public class ShowPossibleDrinks {

	public static void main(String[] args) {
		int inputMoney = 100;

		DrinksManager dm = new DrinksManager();
		dm.setDrinks();

		ArrayList<Drink> possibleDrinks = dm.getPossibleDrinks(inputMoney);
		if (!possibleDrinks.isEmpty()) {
			System.out.println("You input " + inputMoney);
			System.out.println("===========");
			for (Drink drink : possibleDrinks) {
				System.out.println("You can Choose drink " + drink.getName() + " and Your back is "
						+ (inputMoney - drink.getPrice()));

			}
		}

		else {
			String minDrink = "";
			int minCost = Integer.MAX_VALUE;
			for (Drink drink : Drinks.getAllDrinks()) {
				if (minCost > drink.getPrice()) {
					minCost = drink.getPrice();
					minDrink = drink.getName();
					

				}
			}
			
			System.out.println("You input " + inputMoney);
			System.out.println("===========");
			System.out.println("If you want Coffee, you must input " + (minCost - inputMoney) +"yet!");
			System.out.println("You can buy at least "+ minDrink+ " than...");
		}
	}
}
