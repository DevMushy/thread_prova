public class App {
    public static void main(String[] args) throws Exception {
        campana c1 = new campana("ding", 7);
        campana c2 = new campana("dong", 7);
        campana c3 = new campana("dang", 7);

        c1.start();
        c2.start();
        c3.start();
    }
}
