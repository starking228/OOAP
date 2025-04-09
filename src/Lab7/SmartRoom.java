package Lab7;

import java.util.*;

public class SmartRoom {
    public static void main(String[] args) {
        Device light = new Device("Light");
        Device boiler = new Device("Boiler");
        Device airConditioner = new Device("Air conditioning");

        SmartRoomController controller = new SmartRoomController();

        ArrayList<Device> devices = new ArrayList<>();
        devices.add(light);
        devices.add(boiler);
        devices.add(airConditioner);

        while (true) {
            System.out.println("""
                1. Choose device!
                2. Statuses of all Devices. 
                3. Cancel last command.
                4. Exit""");
            int choice = getChoice(4);
            if (choice == 4) { break; }
            if (choice == 1) {
                for (int index = 0; index < devices.size(); index++) {
                    System.out.println((index + 1) + ". " + devices.get(index).getName());
                }
                System.out.println("4. Cancel");
                int device = getChoice(devices.size() + 1);
                if (device != 4) {
                    System.out.println("""
                            1. Turn on
                            2. Turn off
                            3. Status
                            4. Cancel
                            """);
                    int action = getChoice(4);
                    if (action == 1) {
                        controller.executeCommand(new TurnOnCommand(devices.get(device - 1)));
                    }
                    else if (action == 2) {
                        controller.executeCommand(new TurnOffCommand(devices.get(device - 1)));
                    }
                    else if (action == 3) {
                        devices.get(device - 1).getStatus();
                    }
                }
            }
            else if (choice == 2) {
                for (Device current : devices) {
                     current.getStatus();
                }
            }
            else if (choice == 3) {
                controller.undoLastCommand();
            }
        }
    }

    private static int getChoice(int length) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, choose option");
            int choice = scanner.nextInt();
            if (choice < 1 || choice >  length) {
                System.out.println("Invalid number of option");
                return getChoice(length);
            }
            else return choice;
        } catch (Exception e) {
            System.out.println("Only numbers!");
            return getChoice(length);
        }
    }
}
