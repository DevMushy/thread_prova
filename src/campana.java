public class campana extends Thread{
    String suono;
    int volte;
    public campana (String suono, int volte){
        this.suono = suono;
        this.volte = volte;
    }
    public void run(){
        for (int i = 0; i < volte; i++) {
            System.out.println(" " + suono + " ");
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
