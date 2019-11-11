public class Tandem extends Bicycle{

    private int seats;

    public Tandem(String cadenz, String speed, String gear) {
        super(cadenz, speed, gear);
    }

    @Override
    public String getSpeed() {
        return super.getSpeed() + "km/h";
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
