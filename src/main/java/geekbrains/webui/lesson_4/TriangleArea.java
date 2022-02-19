package geekbrains.webui.lesson_4;
import java.util.Scanner;

//public class TriangleArea {
//    private int a;
//    private int b;
//    private int c;
//  Реализация через инпут
//
//    public static void main(String[] args) {
//        triangleArea();
//    }
//    public static void triangleArea()
//    {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Input side A: ");
//        int a = sc.nextInt();
//        System.out.println("Input side B: ");
//        int b = sc.nextInt();
//        System.out.println("Input side C: ");
//        int c = sc.nextInt();
//        int p = (a+b+c)/2;
//        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        System.out.println("area A = " + a + "\narea B = " + b + "\narea C = " + c);
//        System.out.printf("Area of a triangle = " + "%.2f", + s);
//        sc.close();
//    }
//}

//public class TriangleArea {
//    public static void main(String[] args) {
//        triangleArea();
//    }
//    public static void triangleArea()
//    {
//        int a = 2, b = 2, c = 1, p = (a+b+c)/2;
//        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        if (a + b > c && a + c > b && b + c > a)
//            System.out.println("\nТреугольник существует.");
//        else
//            System.out.println("Треугольник не существует.");
//
//        System.out.println("area A = " + a + "\narea B = " + b + "\narea C = " + c);
//        System.out.printf("Area of a triangle = " + "%.0f", + s);
//    }
//}

    public class TriangleArea {

        public int triangleArea ( int a, int b, int c) throws MyException {
            if (a < 0 || b < 0 || c < 0) throw new MyException("Число < 0");
            if (a + b <= c || a + c <= b || b + c <= a) throw new MyException ("Треугольник не существует");
            int result = (a + b + c) / 2;
            return result;
        }
    }
