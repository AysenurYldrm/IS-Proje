
package com.company;

import java.util.ArrayList;

public class Colors {
    /**
     * Bu metod, tüm olası RGB renk kombinasyonlarını oluşturur ve bunları bir liste olarak döndürür.
     * Her bir renk (kırmızı, yeşil, mavi) için, 0'dan 255'e kadar olan değerler arasında
     * 51'lik artışlarla ilerler. Bu, standart RGB renklerinin basitleştirilmiş bir versiyonunu üretir. */
    public ArrayList<String> getAllColors() {
        ArrayList<String> colors = new ArrayList<>();
        for (int red = 0; red <= 255; red += 51) {
            for (int green = 0; green <= 255; green += 51) {
                for (int blue = 0; blue <= 255; blue += 51) {
                    colors.add("RGB(" + red + ", " + green + ", " + blue + ")");
                }
            }
        }
        return colors;
    }
}
