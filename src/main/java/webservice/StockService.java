package webservice;

import java.util.HashMap;

/**
 * <p/>
 * Author: Nabil Hassan<br/>
 * Date: 13/03/2017 21:04
 */
public class StockService {

    private HashMap map = new HashMap();

    public double getPrice(String symbol) {
        Double price = (Double) map.get(symbol);
        if (price != null) {
            return price.doubleValue();
        }
        return 42.00;
    }

    public void update(String symbol, double price) {
        map.put(symbol, new Double(price));
    }

}
