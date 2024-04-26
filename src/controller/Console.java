package controller;

import repo.CourierServiceRepo;
import service.CreateOrderService;

import java.util.Scanner;


public class Console implements CourierServiceRepo {
    public void startProgram(){
        CreateOrderService createOrderService = new CreateOrderService();
        while (true){
            System.out.println("Выберите действие: ");
            System.out.println("1 Создание заказа");
            System.out.println("2 Отображение всех заказов");
            System.out.println("Выберите действие: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            int orderNum = 0;
            switch (choice){
                case 1 : createOrderService.senderDetails();
                        createOrderService.addresseeDetails();
                        createOrderService.orderDetails();
                    break;
                case 2:
                    System.out.println("Заказ № " + ++orderNum);
                    System.out.println(listOfSender);
                    System.out.println(listOfAddressee);
                    System.out.println(listOfOrder);
            }
        }
    }
}
