public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLETON - BANKOMAT");
        System.out.println("Lab3. Zad.1 Wykorzystując odpowiedni wzorzec projektowy napisz aplikację obsługi konta bankowego,\n" +
                "tak, aby można było wpłacać i wypłacać z konta w dowolnym bankomacie dla ustalonej kwoty\n" +
                "debetu, wynoszącej 500 zł.");

        Bankomat bankomat = Bankomat.getInstance();
        System.out.println("balance:" + bankomat.getAccountBalance());
        bankomat.deposit(1000);
        System.out.println("balance:" + bankomat.getAccountBalance());
        bankomat.withdraw(300);
        System.out.println("balance:" + bankomat.getAccountBalance());
        bankomat.withdraw(2000);
        System.out.println("balance:" + bankomat.getAccountBalance());


    }
}