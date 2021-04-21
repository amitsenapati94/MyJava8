package main.java.com.ocp.lambda;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

public class LamdbaTest {

    int instanceNum = 10;

    public static void main(String[] args) {

        final int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
        //stringConverter.convert(2);     // 3

        System.out.println(stringConverter.convert(2));   // 123

        LamdbaTest lamdbaTest = new LamdbaTest();
        lamdbaTest.instanceMethod();
    }

    public void instanceMethod(){

        Converter<Integer, String> stringConverter2 =
                (from) -> String.valueOf(from + ++instanceNum);

        System.out.println(stringConverter2.convert(2));   // 123
        System.out.println("instanceNum:"+instanceNum);   // 123

        instanceNum = 20;

    }


}
