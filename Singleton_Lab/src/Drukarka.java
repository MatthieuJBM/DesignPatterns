public class Drukarka {
	
    private Drukarka() {
        BuforWydruku spl = BuforWydruku.getSpooler();
        spl.print("Drukowanie danych");
    }
    
    public static void main(String argv[]) {
        new Drukarka();
        new Drukarka();
        new Drukarka();
        new Drukarka();
        new Drukarka();
    }
}