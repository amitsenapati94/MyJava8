package com.ocp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function1 {

    public static void main(String[] args) {

       // Function<String, Integer> func = t -> OrderLnAddInfo.setColName(t);

        Map<String,String> map = new HashMap<>();
        map.put("1","val1");
        map.put("2","val2");

        /*List<OrderLnAddInfo> clonedList = map.entrySet().stream()
                .map(OrderLnAddInfo::new)
                .map(o -> {
                    o.s("someLifeCycle");
                    return o;
                })
                .collect(Collectors.toList());
        }*/

    }
}
