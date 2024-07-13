package csd.examples;

public class Example2 {

    public static void run() {
        java.util.Random random = new java.util.Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);


        System.out.print("Tohum değerini giriniz:");
        long seed = sc.nextLong();


        for (int i = 0; i < 10; i++)
            System.out.printf("%02d", random.nextInt(100));

        System.out.println();

        random.setSeed(seed);

        for (int i = 0; i < 10; i++)
            System.out.printf("%02d", random.nextInt(100));

        System.out.println();

    }
}

//tohum degeri 12
//97137495267012789138
//66125633241150159621
