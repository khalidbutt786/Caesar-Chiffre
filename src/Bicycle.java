public class Bicycle {

    private String cadenz;
    private String speed;
    private String gear;

    public Bicycle(String cadenz, String speed, String gear) {
        this.cadenz = cadenz;
        this.speed = speed;
        this.gear = gear;
    }

    public String getCadenz() {
        return cadenz;
    }

    public void setCadenz(String cadenz) {
        this.cadenz = cadenz;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }
}
