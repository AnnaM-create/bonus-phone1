import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int bonusup = 1000;
        int rublesforhundred = 1;
        int bonus = 0;
        if (amount > bonusup) {
            bonus = amount / 100;
        }
        int finalbalance = balance + amount + bonus;
        System.out.println("Итоговый счёт: " + finalbalance);
        System.out.println("Бонус: " + bonus);
    }
}