public class Main {
    public static void main(String[] args) {

        // Задание 1 и 2
        System.out.println("Задание 1 и 2");
        int clientOS = 1;
        int year = 2010;
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

   }
}