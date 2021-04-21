package main.java.com.immutable;

import java.util.HashSet;

public class StringHolderClient {

    public static void main(String[] args) {
        StringHolder sh = new StringHolder("blert");

        HashSet h = new HashSet();
        h.add(sh);
        sh.setString("moo");
        System.out.println(h.contains(sh));
        System.out.println(h.size());
        System.out.println(h.iterator().next());
    }
}
