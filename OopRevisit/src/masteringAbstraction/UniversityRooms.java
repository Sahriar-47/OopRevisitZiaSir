package masteringAbstraction;

abstract class Room {
    String roomNumber;
    Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    void open() {
        System.out.println("Room " + roomNumber + " is now open.");
    }
    void close() {
        System.out.println("Room " + roomNumber + " is now closed.");
    }
    abstract void use();
}

interface Projectable {
    void projectContent();
}

interface Computable {
    void useComputers();
}
class LabRoom extends Room implements Computable {
    LabRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    void use() {
        useComputers();
    }

    @Override
    public void useComputers() {
        System.out.println("Computers are being used in Lab " + roomNumber);
    }
}
class ClassRoom extends Room implements Projectable {
    ClassRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    void use() {
        projectContent();
    }

    @Override
    public void projectContent() {
        System.out.println("Projector is showing slides in Classroom " + roomNumber);
    }
}

public class UniversityRooms {
    public static void main(String[] args) {
        Room lab = new LabRoom("R-226");
        Room clsrom = new ClassRoom("R-207");

        lab.open();
        lab.close();
        lab.use();

        clsrom.open();
        clsrom.close();
        clsrom.use();
    }
}
