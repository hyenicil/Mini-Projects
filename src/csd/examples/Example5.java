package csd.examples;

public class Example5 {

    public static void run() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Tohum değerini giriniz:");
        long seed = scanner.nextLong();

        java.util.Random random = new java.util.Random();

        for(int i = 0; i<10; i++) {
            System.out.println("---------------------------------------------------------------");
            for (int k = 0; k < 10; k++)
                System.out.printf("%02d", random.nextInt(100));
            System.out.println();

            random.setSeed(seed);
            for (int k = 0; k < 10; k++)
                System.out.printf("%02d", random.nextInt(100));
            System.out.println();

            System.out.println("---------------------------------------------------------------");
        }

    }


}
//Tohum değerini giriniz:23
//---------------------------------------------------------------
//01298897309382320527
//27488347184390108195 ***