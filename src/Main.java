import people.Cleaner;
import people.Client;
import pizzeria.Pizzeria;

public final class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria("Pizzeria Pixel", "Shopping center Gulliver, " +
                "7th floor",
                "Working time: 10:00-2:00");

        System.out.println(pizzeria.nameOfPizzeria + "\n" + pizzeria.addressOfPizzeria + "\n" + pizzeria.workingTime + "\n");

        System.out.println("This pizzeria is created for a comfortable stay with your favorite game, delicious " +
                "dishes and an incredible atmosphere.\nTo begin with, the waiter will accept the order from the client.\n");

        Client clients = new Client();
        clients.addClient();

        System.out.println("\nAt the end of the day cleaner will make everything great again.");

        Cleaner cleaner = new Cleaner("Bob");
        System.out.println(cleaner.cleaning());
    }


}


