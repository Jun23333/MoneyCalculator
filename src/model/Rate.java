
package model;

import java.util.HashMap;
import java.util.Map;


public class Rate {
    private final Map<String ,Double> mapa = new HashMap<String ,Double>();
    
    public Rate() {
        mapa.put("USD", 1.00);
        mapa.put("EUR", 0.90);
        mapa.put("CNY", 7.00);
        mapa.put("JPY", 109.10);
        mapa.put("GBP", 0.77);
        mapa.put("RUB", 63.34);
        mapa.put("AUD", 1.49);
        mapa.put("CAD", 1.33);
    }
    
    public double getRate(String type) {
        return mapa.get(type);
    } 
}
