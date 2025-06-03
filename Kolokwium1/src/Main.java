import application.Application;
import factories.DesktopFactory;
import factories.MobileFactory;
import factories.PlatformFactory;
import factories.WebFactory;
import notification_decorators.IntegracjaZSystememKalendarza;
import users.Admin;
import users.Guest;
import users.NormalUser;
import users.User;

public class Main {

    private static Application configureApplication(String platformName, User user) {
        Application app;
        PlatformFactory factory;
//        User user = new Admin();
//        String platformName = "mobile";
        if(platformName.contains("mobile")) {
            factory = new MobileFactory();
        } else if (platformName.contains("desktop")) {
            factory = new DesktopFactory();
        } else {
            factory = new WebFactory();
        }
        app = new Application(factory, user);
        return app;

    }
    public static void main(String[] args) {
        System.out.println("Kolokwium 1 Grupa A Zadanie 2 w66049");

        System.out.println("Wybrane wzorce: Abstract Factory & Decorator");

        /*
        * PLATFORMY:
        *   1) przeglądarka internetowa,
        *   2) system mobilny,
        *   3) aplikacja desktopowa.
        *
        * CECHY PLATFORMY:
        *   1) stylu,
        *   2) formatu,
        *   3) sposobu prezentacji powiadomień.
        *
        * RODZAJ UŻYTKOWNIKA:
        *   1) administrator,
        *   2) zwykły użytkownik,
        *   3) gość.
        *
        * Powiadomienia dostostowane do PLATFORMY i UŻYTKOWNIKA
        *   1) krótkie komunikaty push w aplikacji mobilnej dla użytkownika-gościa,
        *   2) szczegółowe, czy też interaktywne powiadomienia z przyciskiem akcji dla administratora w wersji desktopowej.
        *
        * CECHY POWIADOMIEŃ
        *   1) treść główna,
        *   2) zestaw opcjonalnych rozszerzeń:
        *       a) dołączone dane,
        *       b) znacznik ważności (important, regular, not important),
        *       c) mechanizm potwierdzenia (true, false),
        *       d) automatyczne ukrywanie po czasie (5s),
        *       e) integracja z systemem kalendarza.
        * */

        Application app = configureApplication("mobile", new NormalUser());
        app.invokeMethods();

        Application app2 = configureApplication("web", new Guest());
        app2.invokeMethods();

        Application app3 = configureApplication("desktop", new Admin());
        app3.invokeMethods();

        app3.setNotification(new IntegracjaZSystememKalendarza(app3.getNotification()));
        System.out.println(app3.getNotification().customNotify());

    }
}