package main.java.com.ch1;

public class UniqueChar {

    public static void main(String[] args) {

        UniqueChar uniqueChar= new UniqueChar();
        System.out.println(uniqueChar.isUniqueChars("tatwe"));
    }

    boolean isUniqueChars(String str){

        boolean[] chars = new boolean[128];
        int c = str.charAt(1);
        System.out.println("character: "+c);

        for(int i =0; i< str.length();i++) {
            int val = str.charAt(i);
            if(chars[val]){
                return false;
            }
            chars[val]=true;
        }
        return true;
    }
}
