package main.java.com.polezhaiev.homework14.coffee.order;

import java.util.Objects;

public class Order implements Comparable<Order>{
    private int number;
    private String name;

    public Order(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(number, order.number) && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "Order {" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return number - o.number;
    }
}
