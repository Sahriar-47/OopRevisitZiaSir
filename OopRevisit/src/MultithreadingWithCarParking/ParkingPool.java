package MultithreadingWithCarParking;
import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {
    private final Queue<RegistrarParking> queue = new LinkedList<>();
    private final int capacity;

    public ParkingPool(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void addOrder(RegistrarParking order) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(order);
        System.out.println(order + " arrived at parking queue.");
        notifyAll();
    }

    public synchronized RegistrarParking getOrder() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        RegistrarParking order = queue.poll();
        notifyAll();
        return order;
    }
}
