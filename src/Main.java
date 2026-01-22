

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int bonusUp = 1000;
        int rublesForHundred = 1;
        int bonus = 0;
        if (amount > bonusUp) {
            bonus = amount / 100;
        }
        int finalBalance = balance + amount + bonus;
        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
