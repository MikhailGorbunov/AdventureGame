package Location;


public class Dungen{

    private int numberOfNights;
    private Room room;
    private static final Random PRNG = new Random();
    public Dungen(int numberOfNights, Room room) {
        this.numberOfNights = numberOfNights;
        this.room = room;
    }

//    public static Room randomDirection()  {
//        Room[] directions = values();
//        return directions[PRNG.nextInt(directions.length)];
//    }

}