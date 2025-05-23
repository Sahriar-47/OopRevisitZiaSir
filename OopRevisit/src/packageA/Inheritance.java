package packageA;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

public class Inheritance {
    public static void main(String ch[])
    {
        MountainBike mb = new MountainBike(3, 100, 25);
        PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
        out.println(mb.toString());
        System.out.println(mb.toString());
    }
}