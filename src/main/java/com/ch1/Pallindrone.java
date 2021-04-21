package main.java.com.ch1;

public class Pallindrone {

    public static void main(String[] args) {

        System.out.println(checkForPal("madam"));

    }

    public static boolean checkForPal(String input) {

        for (int i=0;i<input.length();i++){

            if(input.charAt(i) != input.charAt((input.length()-1)-i)){
                return false;
            }
        }
        return true;
    }
}
