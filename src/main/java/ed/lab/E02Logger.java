package ed.lab;

import java.util.HashMap;

public class E02Logger {

    public E02Logger() {
    }
    HashMap<String, Integer> mapa =  new HashMap<>();

    public boolean shouldPrintMessage(int timestamp, String message) {

        int prevTimeStamp = timestamp;
        int nextTimeStamp = 10;
        mapa.put(message, timestamp);
        while(mapa.get(message) != null){
            if(mapa.containsKey(message)){
                return false;
                //nextTimeStamp++;

            }
        }

        return true;
    }

}
