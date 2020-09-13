package pizzeria;

import people.Bartender;
import people.Cook;
import people.Pizzaiolo;
import people.Waiter;
import product.Drink;
import product.Game;
import product.Pizza;
import product.Salad;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class OrderService {
    public int sum;
    Waiter waiter = new Waiter("Josh");

    Pizza pizza = new Pizza();
    Drink drink = new Drink();
    Salad salad = new Salad();
    Game game = new Game();

    public void orderAcceptance(){
        Scanner console = new Scanner(System.in);
        System.out.println("Waiter " + waiter.nameOfWaiter + ", enter an order");

        System.out.print("Pizza: ");

        pizza.nameOfPizza = console.nextLine();

        while (true) {
            try {
                System.out.print("Diameter: ");
                pizza.diameterOfPizza = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect diameter of pizza!");
            }
        }

        while (true) {
            try {
                System.out.print("Price: ");
                pizza.priceOfPizza = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect price of pizza!");
            }
        }

        System.out.print("Drink: ");

        drink.nameOfDrink = console.nextLine();

        while (true) {
            try {
                System.out.print("Volume: ");
                drink.volumeOfDrink = Double.parseDouble(console.nextLine().trim().replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect volume of drink!");
            }
        }

        while (true) {
            try {
                System.out.print("Price: ");
                drink.priceOfDrink = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect price of drink!");
            }
        }


        System.out.print("Salad: ");

        salad.nameOfSalad = console.nextLine();

        while (true) {
            try {
                System.out.print("Weight: ");
                salad.weightOfSalad = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect weight of salad!");
            }
        }

        while (true) {
            try {
                System.out.print("Price: ");
                salad.priceOfSalad = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect price of salad!");
            }
        }


        System.out.print("Game: ");

        game.nameOfGame = console.nextLine();

        while (true) {
            try {
                System.out.print("Level: ");
                game.levelOfGame = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect level of game!");
            }
        }

        while (true) {
            try {
                System.out.print("Number: ");
                game.numberOfPlayers = Integer.parseInt(console.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Incorrect number of players!");
            }
        }


        System.out.print("Waiter " + waiter.nameOfWaiter + ", enter number of Table ");

        int numberOfTable = console.nextInt();

        if (numberOfTable >= 1 && numberOfTable <= 10) {
            System.out.println("Table №" + numberOfTable);
        } else {
            System.out.println("There is no such table number");
        }

        sum = drink.priceOfDrink + pizza.priceOfPizza + salad.priceOfSalad;
    }

    @Override
    public String toString() {
        return "\n pizza " + pizza.nameOfPizza + " " + pizza.diameterOfPizza + "⌀ " + pizza.priceOfPizza +
                "₴ \n drink " + drink.nameOfDrink + " " + drink.volumeOfDrink + "l " + drink.priceOfDrink + "₴" +
                "\n salad " + salad.nameOfSalad + " " + salad.weightOfSalad + "g " + salad.priceOfSalad + "₴ \n game " +
                game.nameOfGame + " " + game.levelOfGame + " level " + game.numberOfPlayers + " players\n" +
                "Sum: " + sum + "₴";
    }


    public void orderPreparation() {
        Pizzaiolo pizzaiolo = new Pizzaiolo("Brandon");
        System.out.println("Pizzaiolo " + pizzaiolo.getNameOfPizzaiolo() + " is cooking a pizza now");

        Bartender bartender = new Bartender("Linda");
        System.out.println("\nBartender " + bartender.nameOfBartender + " is cooking a drink now");

        Cook cook = new Cook("Andrew");
        System.out.println("\nCook " + cook.nameOfCook + " is cooking a salad now");

        System.out.println("\nWaiter " + waiter.nameOfWaiter + " is preparing a game now");
    }

}

