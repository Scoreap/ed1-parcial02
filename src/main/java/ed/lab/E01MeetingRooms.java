package ed.lab;

import java.util.List;
import java.util.PriorityQueue;

public class E01MeetingRooms {
    PriorityQueue<Integer> meetingRooms = new PriorityQueue<>((a,b)->a-b);
    public int minMeetingRooms(List<MeetingInterval> meetingIntervals) {
        //ordenar
        meetingIntervals.sort((a, b) -> a.startTime() - b.startTime());
        for (MeetingInterval interval : meetingIntervals) {
            if (!meetingRooms.isEmpty() && meetingRooms.peek() <= interval.startTime()) {
                meetingRooms.poll();
            }
            meetingRooms.offer(interval.endTime());
        }
        int result = meetingRooms.size();
        return result;
    }

}
