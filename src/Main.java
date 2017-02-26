import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }



    public static int Challenge_3_Variable(){
        Random random = new Random();
        return random.nextInt((10 - 1) + 1) + 1;
    }
    public static int Challenge_2_Variable(){
        return 27;
    }
}
