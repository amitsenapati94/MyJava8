package main.java.com.fpij;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class YahooFinance {

    public static BigDecimal getPrice(final String ticker) {

        Map<String,BigDecimal> map = new HashMap<>();

        map.put("AMD",new BigDecimal(1000));
        map.put("HPQ",new BigDecimal(450));
        map.put("IBM",new BigDecimal(450));


        return map.get(ticker);
    }
}
