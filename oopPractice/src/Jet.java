public class Jet extends Airplane {
    private final int MULTIPLIER = 2;

    public Jet(){
        super();
    }
    public void setSpeed(int speed){
        super.setSpeed(speed * MULTIPLIER);
    }
    public void accelerate(){
       super.setSpeed(getSpeed() * 2);
    }
}
