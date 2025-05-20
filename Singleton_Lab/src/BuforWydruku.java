public class BuforWydruku {

    private static volatile BuforWydruku bufor; // volatile kolejka FIFO
    private static int licz;

    private BuforWydruku() {  
    }
    
    public static BuforWydruku getSpooler() {
        if (bufor == null) {
            synchronized (BuforWydruku.class) { // Wprowadza warunek, że nie może wiele wątków na raz. Zsynchronizowany dostęp, jeśli jakiś wątek nie skończył drukwoania albo jakiegoś procesu to czeka.
                if (bufor == null) {
                    bufor = new BuforWydruku();
                }
            }
        }
        return bufor;
    }

    protected void print(String s) {
        int lokalnaLicz = ++licz;
        System.out.println(s + " na drukarce " + lokalnaLicz);
    }
}