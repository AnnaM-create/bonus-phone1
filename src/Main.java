import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int Balance = 100;
        int Amount = 1100;
        int bonusUp = 1000;
        int rublesForHundred = 1;
        int bonus = 0;
        if (Amount > bonusUp) {
            bonus = Amount / 100;
        }
        int finalBalance = Balance + Amount + bonus;
        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}