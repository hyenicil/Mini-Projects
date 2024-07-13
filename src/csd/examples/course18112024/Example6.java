package csd.examples.course18112024;

public class Example6 {

    public static void run() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input width, height, code and count:");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        long code = scanner.nextLong();
        int count = scanner.nextInt();
        java.util.Random random = new java.util.Random(code);
        //java.util.Random random = new java.util.Random();
        //random.setSeed(code);

        for(int i = 0; i<count; i++) {
            Point pixel = PointUtil.createRandomPoint(random, 0, width, 0, height);
            //.............

            pixel.print();
        }

    }
}
class PointUtil {

    public static Point createRandomPoint(java.util.Random r, int minX, int boundX, int minY, int boundY) {

        return new Point(r.nextInt(minX, boundX), r.nextInt(minY,boundY));
    }

}

class Point{

    public double  x, y;

    public Point(){

    }

    public Point(double a) {
        x = a;
    }

    public Point(double a, double b){
        x = a;
        y = b;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(Point other) {
        return distance(other.x, other.y);
    }

    public double distance(double a, double b) {

        return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
    }

    public void offset(double dxy) {
        offset(dxy, dxy);
    }

    public void offset(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void print() {
        System.out.printf("(%f,%f)%n", x,y);
    }

//Input width, height, code and count:1024 768 200 24
//(50,000000,541,000000)
//(469,000000,57,000000)
//(152,000000,555,000000)
//(692,000000,671,000000)
//(276,000000,82,000000)
//(406,000000,92,000000)
//(264,000000,339,000000)
//(519,000000,604,000000)
//(548,000000,708,000000)
//(254,000000,616,000000)
//(304,000000,460,000000)
//(322,000000,625,000000)
//(775,000000,379,000000)
//(520,000000,637,000000)
//(486,000000,196,000000)
//(993,000000,43,000000)
//(742,000000,536,000000)
//(978,000000,228,000000)
//(966,000000,159,000000)
//(196,000000,672,000000)
//(238,000000,277,000000)
//(798,000000,338,000000)
//(944,000000,64,000000)
//(688,000000,498,000000)




}