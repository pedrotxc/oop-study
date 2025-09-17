package com.pteixeira.composicao.order.application;

import com.pteixeira.composicao.order.entities.Client;
import com.pteixeira.composicao.order.entities.Order;
import com.pteixeira.composicao.order.entities.OrderItem;
import com.pteixeira.composicao.order.entities.Product;
import com.pteixeira.composicao.order.entities.enums.OrderStatus;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static com.pteixeira.composicao.order.entities.Client.sdf;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            BigDecimal productPrice = sc.nextBigDecimal();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);
    }

}
