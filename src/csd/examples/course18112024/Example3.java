package csd.examples.course18112024;

public class Example3 {

    public static void run() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Tohum değerini giriniz:");
        long seed = scanner.nextLong();

        java.util.Random rand = new java.util.Random(seed);

        for (int i = 0; i < 10; i++)
            System.out.printf("%02d", rand.nextInt(100));

        System.out.println();

        rand.setSeed(System.nanoTime());

        for(int i = 0; i < 10; i++)
            System.out.printf("%02d", rand.nextInt(100));

        System.out.println();
    }
}
//Tohum: 12
//66125633241150159621
//96897850037689253027
