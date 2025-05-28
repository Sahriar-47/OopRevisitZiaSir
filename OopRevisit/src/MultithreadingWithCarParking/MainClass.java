package MultithreadingWithCarParking;
public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        ParkingPool pool = new ParkingPool(5); // Max 5 cars in queue

        // Start 3 parking agents
        for (int i = 1; i <= 3; i++) {
            new ParkingAgent(pool, i).start();
        }

        // Simulate 10 cars arriving
        for (int i = 1; i <= 10; i++) {
            RegistrarParking order = new RegistrarParking(i);
            pool.addOrder(order);
            Thread.sleep(500); // delay between arrivals
        }
    }
}

