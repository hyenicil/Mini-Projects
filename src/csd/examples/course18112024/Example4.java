package csd.examples.course18112024;

public class Example4 {

    public static void run() {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {

            System.out.print("Tohum değeri giriniz: ");
            long seed = sc.nextLong();

            java.util.Random random = new java.util.Random(seed);

            for(int i =0; i<10; i++)
                System.out.printf("%02d", random.nextInt(100));

            System.out.println();

            random.setSeed(System.nanoTime());

            for (int i =0; i<10; i++)
                System.out.printf("%02d", random.nextInt(100));

            System.out.println();

            if(seed == 0)
                break;
        }
    }
}
//Tohum değeri giriniz: 12
//66125633241150159621
//27408437102883540322