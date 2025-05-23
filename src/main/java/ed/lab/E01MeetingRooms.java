package ed.lab;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class E01MeetingRooms {

    public int minMeetingRooms(List<MeetingInterval> meetingIntervals) {
        //Guardar los valores de intervalos en una cola de prioridades para ordenarlos de menor a mayor
        Queue<Integer> meetingRooms = new PriorityQueue<>((a,b) -> a - b);
        Queue<Integer> OccupiedRooms = new PriorityQueue<>((a,b) -> a - b);
        int traslapes = 0;

        for(MeetingInterval meetingInterval : meetingIntervals){
            int first = meetingInterval.startTime();
            int last = meetingInterval.endTime();
            meetingRooms.offer(first);
            meetingRooms.offer(last);

            if(meetingRooms.poll() == first) {
                OccupiedRooms.add(first);
                traslapes++;
            }
            else if(meetingRooms.poll() == last) {
                OccupiedRooms.add(last);
                traslapes++;
            }
        }

        return traslapes;
    }

}
