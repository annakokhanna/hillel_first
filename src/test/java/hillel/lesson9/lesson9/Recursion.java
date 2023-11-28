package hillel.lesson9.lesson9;

public class Recursion {

    public static void main(String[] args) {
        recursion(3);
    }

    public static void recursion(int n) {
        if (n == 0) return;

        System.out.println("+" + n);
        recursion(n - 1);
    }

//    @Test
//    public static void main(String[] args) {
//        System.out.println(factorial(5));
//    }
//
//        //5! = 5 * 4 * 3 * 2 * 1
//        //5! = 5 * 4!
//        //0! = 1
//
    //if fac(5) = 5 * fac(4) --> fac(4) = 4 * fac(3) --> fac(3) = 3 * fac(2) --> fac(2) = 2 * fac(1) --> fac(1) = 1
//    public static int factorial(int x) {
//        if ( x <=1 ) return 1;
//
//        return x * factorial(x-1);
//    }


}
