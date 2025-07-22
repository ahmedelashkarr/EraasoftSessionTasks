package TheFirstWeek;

import java.util.Scanner;

public class SessionOneTask {
    public static void run(){
        Scanner inp = new Scanner(System.in);
        //A
        /*
        String str = inp.nextLine();
        System.out.println("Hello, ".concat(str));
        */

        //B
        /*String str = inp.nextLine();
        Arrays.stream(str.split(" ")).forEach(System.out::println);*/

        //C
        /*double x = inp.nextDouble() , y = inp.nextDouble() ;
        System.out.printf("%.0f + %.0f = %.0f\n" , x , y , x + y);
        System.out.printf("%.0f * %.0f = %.0f\n" , x , y , x * y);
        System.out.printf("%.0f - %.0f = %.0f" , x , y , x - y);*/

        //D
        /*long a = inp.nextLong() , b = inp.nextLong() , c = inp.nextLong() , d = inp.nextLong() ;
        System.out.printf("Difference = %d%n" ,(a * b) - (c*d) );*/

        //E
        /*double x = inp.nextDouble();
        System.out.printf("%.9f" , (3.141592653 * Math.pow(x , 2)));*/

        //F
        /*long x = inp.nextLong(), y = inp.nextLong();
        System.out.println( x % 10 + y % 10);*/

        //G
        /*long x = inp.nextInt() ;
        System.out.println((x * (x +1)) / 2);*/

        //H
        /*int x = inp.nextInt(), y = inp.nextInt();
        System.out.printf("floor %d / %d = %.0f\n" , x , y , Math.floor((double) x / y));
        System.out.printf("ceil %d / %d = %.0f\n" ,x ,y , Math.ceil((double) x/y) );
        System.out.printf("round %d / %d = %d" ,x ,y , Math.round((double) x / y));*/

        //I
        /*int a = inp.nextInt(), b = inp.nextInt();
        System.out.println(a >= b ? "Yes" : "No");*/

        //J
        /*long a = inp.nextLong(), b = inp.nextLong();
        System.out.println((a % b == 0 || b % a == 0) ? "Multiples" : "No Multiples");*/

        //K
        /*long a = inp.nextLong(), b = inp.nextLong(), c = inp.nextLong(),
                min = Math.min(a, Math.min(b, c)), max = Math.max(a, Math.max(b, c));
        System.out.printf("%d %d" , min, max) ;*/

        //L
        /*String name1 = inp.nextLine() , name2 = inp.nextLine();
        name1 = name1.split(" ")[1];
        name2 = name2.split(" ")[1];
        System.out.println(name1.equals(name2) ? "ARE Brothers" : "NOT");*/

        //M
        /*String x = inp.next();
        int ascii = x.hashCode();
        if (ascii > 47 && ascii < 58) System.out.println("IS DIGIT");
        else if (ascii > 64 && ascii < 91) System.out.println("ALPHA\n".concat("IS CAPITAL"));
        else if (ascii > 96 && ascii < 123) System.out.println("ALPHA\n".concat("IS SMALL"));*/

        //N
        /*String string = inp.next();
        System.out.println(string.hashCode() > 64 && string.hashCode() < 91 ? string.toLowerCase() : string.toUpperCase());*/
    }

}
