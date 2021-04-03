package ctci.ch1;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {

        Permutation permutation = new Permutation();

        String input1 = "god";
        String input2 = "abc";
        //String input2 = "dog";


        //System.out.println(permutation.sort(input1).equals(permutation.sort(input2)));
        //System.out.println(permutation.calculate(input1)== (permutation.calculate(input2)));
        permutation.calculate2(input1,input2);

    }

    public String sort(String input) {

        char[] inputChars = input.toCharArray();
        Arrays.sort(inputChars);
        return new String(inputChars);

    }

    public int calculate(String input){
        int total = 0;

        for(int i=0;i<input.length();i++){
            int val = input.charAt(i);
            total = total +val;
        }
        return total;
    }

    public void calculate2(String input1,String input2){

        int[] letters = new int[128];

        for(int i=0;i<input1.length();i++){
           letters[input1.charAt(i)]++;
        }
    }
}
