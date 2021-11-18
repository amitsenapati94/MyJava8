package com.poly;

import java.util.HashMap;
import java.util.Map;

public class SearchClient {

    public static void main(String[] args) {

        Map<String,Searcher> map = new HashMap<>();
        map.put("1",new Search1());
        map.put("2",new Search2());

        map.get("1").search("query");


    }
}
