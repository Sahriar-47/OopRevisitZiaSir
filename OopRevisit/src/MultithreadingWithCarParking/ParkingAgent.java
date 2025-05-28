package MultithreadingWithCarParking;
public class ParkingAgent extends Thread {
    private final ParkingPool pool;
    private final int agentId;

    public ParkingAgent(ParkingPool pool, int agentId) {
        this.pool = pool;
        this.agentId = agentId;
    }

    @Override
    public void run() {
        try {
            while (true) {
                RegistrarParking order = pool.getOrder();
                System.out.println("Agent#" + agentId + " is parking " + order);
                Thread.sleep(1000);  // Simulate time taken to park
                System.out.println("Agent#" + agentId + " parked " + order);
            }
        } catch (InterruptedException e) {
            System.out.println("Agent#" + agentId + " stopped.");
        }
    }
}
