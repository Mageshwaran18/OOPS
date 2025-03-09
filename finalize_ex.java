public class finalize_ex {

    @Override
    public void finalize() {
        System.out.println("Object is being destroyed!");
    }
    
    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++) {
            finalize_ex obj = new finalize_ex();
        }
        System.out.println("End of main");
    }
}