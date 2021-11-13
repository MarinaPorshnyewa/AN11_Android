public class Main {
    public static void main(String[] args) {

        Greeter greeterEnglish = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello!");
            }
        };
        Greeter greeterRussian = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Привет!");
            }
        };
        Greeter greeterGerman = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Guten Tag!");
            }
        };
        Greeter greeterFrench = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Bonjour!");
            }
        };
        greeterEnglish.wish();
        greeterRussian.wish();
        greeterGerman.wish();
        greeterFrench.wish();
    }
}
