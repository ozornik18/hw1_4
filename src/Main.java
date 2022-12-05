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
        switch (year) {
            case 1904:
            case 1908:
            case 1912:
            case 1916:
            case 1920:
            case 1924:
            case 1928:
            case 1932:
            case 1936:
            case 1940:
            case 1944:
            case 1948:
            case 1952:
            case 1956:
            case 1960:
            case 1964:
            case 1968:
            case 1972:
            case 1976:
            case 1980:
            case 1984:
            case 1988:
            case 1992:
            case 1996:
            case 2000:
            case 2004:
            case 2008:
            case 2012:
            case 2016:
            case 2020:
            case 2024:
            case 2028:
            case 2032:
            System.out.println("Год является високосным");
            break;
            default:
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