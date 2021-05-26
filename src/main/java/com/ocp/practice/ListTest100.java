package com.ocp.practice;

import com.ocp.OrderLnAddInfo;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class ListTest100 {

    public static void main(String[] args) {

        Supplier<OrderLnAddInfo> orderSupplier = OrderLnAddInfo::new;

        OrderLnAddInfo ord1 = orderSupplier.get();
        ord1.setColName("1");
        ord1.setColValue("val1");

        //System.out.println(ord1);

        OrderLnAddInfo ord2 = orderSupplier.get();
        ord2.setColName("2");
        ord2.setColValue("val2");

        OrderLnAddInfo ord3 = orderSupplier.get();
        ord3.setColName("3");
        ord3.setColValue("val3");

        OrderLnAddInfo ord4 = orderSupplier.get();
        ord4.setColName("4");
        ord4.setColValue("val4");

        OrderLnAddInfo ord5 = orderSupplier.get();
        ord5.setColName("4");
        ord5.setColValue("val5");

        List<OrderLnAddInfo> orderLnAddInfoList = new ArrayList<>();

        orderLnAddInfoList.add(ord1);
        orderLnAddInfoList.add(ord5);
        orderLnAddInfoList.add(ord2);
        orderLnAddInfoList.add(ord3);
        orderLnAddInfoList.add(ord4);

        orderLnAddInfoList = new ArrayList<>();
        //orderLnAddInfoList=null;
        OrderLnAddInfo ord11 = null;
        orderLnAddInfoList.add(ord11);

        /*if(CollectionUtils.isNotEmpty(orderLnAddInfoList))
        for(OrderLnAddInfo orderLnAddInfo : orderLnAddInfoList){
            //this will throw NPE if any item is null
            System.out.println(orderLnAddInfo.getColName());
        }

        if(CollectionUtils.isNotEmpty(orderLnAddInfoList)){
            orderLnAddInfoList.stream()
                    .filter(Objects::nonNull)
                    .forEach(System.out::println);
        }*/
    }
}
