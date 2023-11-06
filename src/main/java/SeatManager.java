import java.util.PriorityQueue;

public class SeatManager {
    private PriorityQueue<Integer> availableSeats = new PriorityQueue<>();

    public SeatManager(int n) {
        for (int i = 1; i <=n ; i++) {
            availableSeats.add(i);
        }
    }

    public int reserve() {
        return availableSeats.poll();
    }

    public void unreserve(int seatNumber) {
        availableSeats.offer(seatNumber);
    }
}

