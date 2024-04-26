package service;

import model.Customer;
import repo.CourierServiceRepo;

import java.util.Scanner;

public class CreateOrderService implements CourierServiceRepo {
    public void senderDetails(){

        Scanner scanner = new Scanner(System.in);
        Customer sender = new Customer();

            System.out.println("Данные отправителя:");
            System.out.println("Введите город: ");
            String senderCity = scanner.nextLine();
            System.out.println("Введите улицу: ");
            String senderStreet = scanner.nextLine();
            System.out.println("Введите номер квартиры: ");
            int senderApartNum = scanner.nextInt();
            System.out.println("Ведите этаж: ");
            int senderFloor = scanner.nextInt();
            System.out.println("Введите номер телефона: ");
            String senderPhoneNum = scanner.next();
            scanner.nextLine();
            System.out.println("Введите Ф.И.О: ");
            String senderName = scanner.next();
            scanner.nextLine();

            listOfSender.add(senderCity);
            listOfSender.add(senderStreet);
            listOfSender.add(String.valueOf(senderApartNum));
            listOfSender.add(String.valueOf(senderFloor));
            listOfSender.add(senderPhoneNum);
            listOfSender.add(senderName);

    }

    public void addresseeDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данные получателя:");
        System.out.println("Введите город: ");
        String addresseeCity = scanner.nextLine();
        System.out.println("Введите улицу: ");
        String addresseeStreet = scanner.nextLine();
        System.out.println("Введите номер квартиры: ");
        int addresseeApartNum = scanner.nextInt();
        System.out.println("Ведите этаж: ");
        int addresseeFloor = scanner.nextInt();
        System.out.println("Введите номер телефона: ");
        String addresseePhoneNum = scanner.nextLine();
        System.out.println("Введите Ф.И.О: ");
        String addresseeName = scanner.nextLine();

        listOfAddressee.add(addresseeCity);
        listOfAddressee.add(addresseeStreet);
        listOfAddressee.add(String.valueOf(addresseeApartNum));
        listOfAddressee.add(String.valueOf(addresseeFloor));
        listOfAddressee.add(addresseePhoneNum);
        listOfAddressee.add(addresseeName);
    }
    public void orderDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данные посылки: ");
        System.out.println("Введите желаемое время доставки(дд.мм.гг): ");
        String desiredDeliveryTime = scanner.nextLine();
        System.out.println("Введите размеры посылки(Длина, Ширина, Выысота): ");
        String parcelDimensions = scanner.nextLine();
        System.out.println("Введите вес посылки: ");
        double parcelWeight = scanner.nextInt();

        listOfOrder.add(desiredDeliveryTime);
        listOfOrder.add(parcelDimensions);
        listOfOrder.add(String.valueOf(parcelWeight));

    }
}
