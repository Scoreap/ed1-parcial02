package ed.lab;

import java.util.HashMap;

public class E02Logger {
    HashMap<String, Integer> mapa =  new HashMap<>();

    public E02Logger() {
        mapa = new HashMap<>();
    }


    public boolean shouldPrintMessage(int timestamp, String message) {
        //segundo intento :(

        if (!mapa.containsKey(message) || timestamp >= mapa.get(message) + 10) {
            mapa.put(message, timestamp);
            return true;
        } else {
            return false;
        }
    }

}
