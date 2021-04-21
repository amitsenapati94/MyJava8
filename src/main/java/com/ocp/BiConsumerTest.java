package main.java.com.ocp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    Map<String, Integer> map = new HashMap<>();
    BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

    public static void main(String[] args) {

        BiConsumerTest BiConsumerTest = new BiConsumerTest();
        BiConsumer<String, String> bc = (x, y) -> { System.out.println(x + y);};
        bc.accept("5", "2");

    }

    /*public void test() {
        List<String> list = Arrays.asList("abc","xyz","abc");

        list.stream().map(b2).collect(Collectors.toList());
    }*/

  /*  public static void acceptAllEmployee(List<Person> plist, Consumer<P> con) {
        for(Person p : plist) {
            //con.accept(p);
        }
    }*/
}
