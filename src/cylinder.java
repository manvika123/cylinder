import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class cylinder {
    static double pi= 3.142;

    public static void main(String[] args) {
        double radius, length;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        length = sc.nextDouble();
         double area, volume;
          area= radius *radius * pi;
          volume = area * length;

        System.out.println("Area of cylinder" +area);
        System.out.println("Volume of cylinder" +volume);

    }
}
