import java.time.LocalDate;

public class Main {

    private static void task1PritnYear(int yearNumber) {
        if (yearNumber % 4 == 0 && yearNumber % 100 != 0 || yearNumber % 400 == 0) {
            System.out.println(yearNumber + " високосный год");
        } else {
            System.out.println(yearNumber + " не високосный год");
        }

    }

    private static void task2DefinitionClientOS(int year, int versionOS) {
        int currentYear = LocalDate.now().getYear();
        int clientDevice = versionOS;
        int ios = 0;
        int android = 1;
        int clientDeviceYear = year;
        if (clientDevice == android) {
            System.out.print("На Android установите ");
        } else if (clientDevice == ios) {
            System.out.print("На IOS установите ");
        }
        if (clientDeviceYear < currentYear) {
            System.out.println("lite-версию");
        } else {
            System.out.println("обычную версию");
        }

    }

    private static int task3DeliverysDays(int deliveryDistance) {
        int distance = deliveryDistance;
        int deliveryDays = 1;
        int start = 20;
        int interval = 40;
        if (deliveryDistance <= start) {
            return 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - start) / (double) interval);
            return deliveryDays;
        }


    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {

        task1PritnYear(2022);
        System.out.println();
    }

    public static void task2() {

        task2DefinitionClientOS(2015, 0);
        System.out.println();
    }

    public static void task3() {

        int deliveryDistance = 95;
        int deliveryDays = task3DeliverysDays(deliveryDistance);
        System.out.println(deliveryDays);


    }
}



