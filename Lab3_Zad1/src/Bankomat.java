public class Bankomat {
// "Lab3. Zad.1 Wykorzystując odpowiedni wzorzec projektowy napisz
// aplikację obsługi konta bankowego,tak, aby można było wpłacać
// i wypłacać z konta w dowolnym bankomacie dla ustalonej kwoty
// debetu, wynoszącej 500 zł."

    private static volatile Bankomat bankomat;
    private static int accountBalance = 0;

    private Bankomat() {
    }

    public static Bankomat getInstance() {
        if (bankomat == null) {
            synchronized (Bankomat.class) {
                if (bankomat == null) {
                    bankomat = new Bankomat();
                }
            }
        }
        return bankomat;
    }

    protected int withdraw(int amount) {
        if (accountBalance - amount >= -500) {
            accountBalance -= amount;
        } else {
            System.out.println("Not possible to withdraw this amount:" + amount + ".");
        }
        return accountBalance;
    }

    protected int deposit(int amount) {
        accountBalance += amount;
        return accountBalance;
    }

    protected int getAccountBalance() {
        return accountBalance;
    }
}
