package main.java.com.recursive;

public class Recursion {

    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        System.out.println("\n\nRecursion Example Results");
        recursion.tri_recursion(6);
    }

    public int tri_recursion(int k) {
        int result;
        if (k > 0) {
            result = k + tri_recursion(k - 1);
            System.out.println(result);
        } else {
            result = 0;
            //System.out.println(result);
        }
        return result;
    }
}
