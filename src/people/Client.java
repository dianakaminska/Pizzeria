package people;
import pizzeria.OrderService;
import java.util.Scanner;

public final class Client {
    String nameOfClient;


    public String eatAndDrink() {
        return "\nClient " + nameOfClient + " is eating and drinking now";
    }

    public String playGame() {
        return "Client " + nameOfClient + " is playing game now";
    }

    public void addClient() {
        OrderService orderService = new OrderService();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add Client: ");
        String addclient = scanner.nextLine();
        int numberOfOrder = 0;
        while (addclient.equals("yes")) {
            Client client1 = new Client();
            System.out.print("Name of client: ");
            client1.nameOfClient = scanner.nextLine();
            orderService.orderAcceptance();
            System.out.println(orderService.toString());
            numberOfOrder++;
            System.out.println("Order №" + numberOfOrder);
            System.out.println();

            System.out.println("Then our professionals will perform it at the highest level!\n");
            orderService.orderPreparation();

            System.out.println("\nAnd the client will enjoy quality service :)");
            System.out.println(client1.eatAndDrink());
            System.out.println(client1.playGame());
            System.out.println("\nAfter this, he will pay a check: " + orderService.sum + "₴");

            System.out.print("Add Client: ");
            addclient = scanner.nextLine();
        }
    }
}
