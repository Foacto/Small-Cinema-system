/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vvt
 */
public class FilmRoomFlyweight {
    private static final Map<String, ChairType> cache = new HashMap<>();
    
    public static ChairType getChairType(String type, String status, String des) {
        String ts = type + " " + status;
        if(cache.get(ts) == null)
            cache.put(ts, new ChairType(type, status, des));
        
        return cache.get(ts);
    }
}
