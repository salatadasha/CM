package org.itstep;

import java.util.ArrayList;

public class DrinksManager {
	public void setDrinks() {
		Drink espresso = new Drink("espresso", 500);
		Drink americano = new Drink("americano", 700);
		Drink capuchino = new Drink("capuchino", 12000);
		Drink latte = new Drink("latte", 13000);
		Drink milkamericano = new Drink("milkamericano", 9000);

		Drinks.addDrink(espresso);
		Drinks.addDrink(americano);
		Drinks.addDrink(capuchino);
		Drinks.addDrink(latte);
		Drinks.addDrink(milkamericano);

	}

	public ArrayList<Drink> getPossibleDrinks(int inputMoney) {
		ArrayList<Drink> possibleDrinks = new ArrayList<>();
		for (Drink oneDrink : Drinks.getAllDrinks()) {
			if (inputMoney >= oneDrink.getPrice()) {
				possibleDrinks.add(oneDrink);

			}
		}
		return possibleDrinks;

	}
}
