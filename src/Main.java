public class Main {
    public static void main(String[] args) {

        // Задание 1 и 2
        System.out.println("Задание 1 и 2");
        int clientOS = 1;
        int year = 2020;
        if (clientOS == 0)
            if (year <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1)
            if (year <= 2015){
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }else if (year > 2015){
                System.out.println("Установите версию приложения для android по ссылке");
            }
        // Задание 3
        System.out.println("Задание 3");
        int currentYear = 2014;
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("год не является високосным");
        }


        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 59; //км
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + day * 2);
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + day * 3);
        } else if (deliveryDistance < 140) {
            System.out.println("Потребуется дней: " + day * 4);
        } else if (deliveryDistance < 160) {
            System.out.println("Потребуется дней: " + day * 5);
        }

// Задание 5
        System.out.println("Задание 5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("такого месяца не существует");
        }




   }
}