package main.java.com.polezhaiev.homework14.coffee.order;

import java.io.File;
import java.util.*;

public class CoffeeOrderBoard{
    private Queue<Order> coffeeSet = new LinkedList<>();
    private int countOrder = 0;

    public void add(Order order){
        if(order.getNumber() >= 0){
            countOrder++;
            order.setNumber(countOrder);
        }

        coffeeSet.add(order);
    }

    public String deliver(){
        return coffeeSet.poll().toString();

    }

    public String deliverWithNumber(){
        if(coffeeSet.size() == 0 || coffeeSet == null){
            return "No orders!!!";
        }

        int i = 0;
        for (Order order: coffeeSet) {
            i++;
            if(i == coffeeSet.size()){
                Order order1 = order;
                coffeeSet.remove(order);
                return "Order " + order.getNumber() + ": " + order1;
            }
        }

        return null;
    }

    public String draw(){
        if(coffeeSet.size() == 0 || coffeeSet == null){
            return "No orders";
        }

        Order [] orders = new Order[coffeeSet.size()];

        int pos = 0;
        for (Order order: coffeeSet) {
            orders[pos] = order;
            pos++;
        }

        Arrays.sort(orders);

        StringBuilder builder = new StringBuilder();
        for (Order order: orders) {
            builder.append(order.getNumber()).append("| ").append(order.getName()).append("\n");
        }

        return builder.toString();
    }
}
