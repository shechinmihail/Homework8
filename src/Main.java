import java.time.LocalDate;

public class Main {

    public static void task1_pritnyear (int yearNumber){
        if(yearNumber % 4 == 0 && yearNumber % 100 != 0 || yearNumber % 400 == 0){
            System.out.println(yearNumber + " високосный год");
        } else {
            System.out.println(yearNumber + " не високосный год");
        }

    }
    public static void task2_definitionClientOS (int year, int versionOS){
    int currentYear = LocalDate.now().getYear();
    int clientDevice = versionOS;
    int IOS = 0;
    int Android = 1;
    int clientDeviceYear = year;
    if (clientDevice == Android){
        System.out.print("На Android установите ");
    } else if (clientDevice == IOS) {
        System.out.print("На IOS установите ");
    }
    if (clientDeviceYear <currentYear) {
        System.out.println("lite-версию");
    } else {
        System.out.println("обычную версию");
    }

    }
    public static void tazk3_deliverysDays (int distance){
        int deliveryDistance = distance;
        int deliveryDays = 1;
        int start = 20;
        int interval = 40;
        if (deliveryDistance<=start) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance-start)/(double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void main(String[] args) {
    task1();
    task2();
    task3();

    }
    public static void task1 () {

        task1_pritnyear(2016);
        System.out.println(" ");
        }

    public static void task2 (){

        task2_definitionClientOS(2012,0);
        System.out.println(" ");
        }

    public static void task3 (){

        tazk3_deliverysDays(25);

    }
    }



