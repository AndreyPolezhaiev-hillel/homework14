package main.java.com.polezhaiev.homework14.coffee;

import main.java.com.polezhaiev.homework14.coffee.order.CoffeeOrderBoard;
import main.java.com.polezhaiev.homework14.coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Andrey");
        Order order2 = new Order("Kirill");
        Order order3 = new Order("Maks");
        Order order4 = new Order("Artem");
        Order order5 = new Order("Nikita");
        Order order6 = new Order("Vlad");
        Order order7 = new Order("Den");

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add(order1);
        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);
        coffeeOrderBoard.add(order4);
        coffeeOrderBoard.add(order5);
        coffeeOrderBoard.add(order6);
        coffeeOrderBoard.add(order7);

        System.out.println("Method deliver() - " + coffeeOrderBoard.deliver());
        System.out.println("=======================================================================");
        System.out.println();

        System.out.println("Method deliverWithNumber() - " + coffeeOrderBoard.deliverWithNumber());
        System.out.println("=======================================================================");
        System.out.println();

        System.out.println(coffeeOrderBoard.draw());
        System.out.println("=======================================================================");
        System.out.println();
    }
}
