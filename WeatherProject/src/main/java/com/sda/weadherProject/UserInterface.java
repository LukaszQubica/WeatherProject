package com.sda.weadherProject;

import java.util.Scanner;

public class UserInterface {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("aplikacja jest uruchomiona");
            System.out.println("Co chcesz zrobić ?");
            System.out.println("Dodaj lokację - wybierz 1");
            System.out.println("Wyjście - wybierz 2");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addLocation();
                    break;
                case 2:
                    return;

            }
        }
    }

    public void addLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta: ");
        String cityName = scanner.nextLine();
        System.out.println("Podaj region: ");
        String region = scanner.nextLine();
        System.out.println("Podaj nazwę kraju: ");
        String country = scanner.nextLine();
        System.out.println("Podaj długość geograficzną: ");
        Double latitude = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną: ");
        Double longitude = scanner.nextDouble();

    }

}

