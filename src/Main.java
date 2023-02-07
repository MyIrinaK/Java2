public class Main {
    public static void main(String[] args) {System.out.println("Приложение, выводящее итоговый счёт и количество бонусных рублей");
        int score = 100;// начальные данные
        int deposit = 1100; //сумма пополнения счета

        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;//формула подсчета бонусных рублей за каждые доп внесенные 100р на счет.
        } else {
            bonus = 0;
        }
        int balance = score + deposit + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");

    }
}