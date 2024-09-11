package Lab1;

import java.util.Scanner;

public class Main {
    public static final String[] MENU = {"1. Create Cube",
            "2. Create Pyramid",
            "3. Create Parallelogram",
            "4. Exit"};

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            showMenu(MENU);
            int choice = getChoice(MENU);
            executeChoice(choice);
        }
    }

    private static void showMenu(String[] menu) {
        for (String line: menu) System.out.println(line);
    }

    private static int getChoice(String[] menu) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose option");
        int choice = scanner.nextInt();
        if (choice < 1 || choice >  menu.length) {
            System.out.println("Invalid number of option");
            return getChoice(menu);
        }
        else return choice;
    }

    private static void executeChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculable vcalc;
        switch (choice) {
            case 1 -> {
                System.out.print("Please input side length of cube:");
                vcalc = new Cube(scanner.nextDouble());
                System.out.println("Cube volume: " + vcalc.calculateVolume());
            }
            case 2 -> {
                System.out.print("Please input base area of pyramid:");
                double baseArea = scanner.nextDouble();
                System.out.print("Please input height of pyramid:");
                double height = scanner.nextDouble();
                vcalc = new Pyramid(baseArea, height);
                System.out.println("Pyramid volume: " + vcalc.calculateVolume());
            }
            case 3 -> {
                System.out.print("Please input base of parallelogram:");
                double base = scanner.nextDouble();
                System.out.print("Please input height of parallelogram:");
                double height = scanner.nextDouble();
                Parallelogram p = new Parallelogram(base, height);
                System.out.println(" info about " + p.getName() + ", base = " + p.getBase() + ", height = " + p.getHeight());
            }
            case 4 -> System.exit(0);
        }
    }
}

