package csd.examples.course18112024;

public class Example1 {
    public static void run() {

        java.util.Random random =  new java.util.Random();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 0 ; i< 11; i++)
            System.out.printf("%d", random.nextInt(1,11));


        System.out.println();

    }
}
