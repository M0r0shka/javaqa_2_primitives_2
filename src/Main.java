public class Main {
    public static void main(String[] args) {

        int account = 100;
        int amount = 2300;
        int bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
        }
        account = account + amount + bonus;
        System.out.println("Итоговый счёт: " + account);
        System.out.println("Бонус: " + bonus);
    }
}