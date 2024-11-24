package BikeTask;

public class Bike {
    private boolean ignition;
    private int speed;
    private int gear;

    public Bike(boolean ignition,int speed,int gear){
        this.ignition = false;
        this.speed = 0;
        this.gear = 0;
    }

    public void turnOn() {
        this.ignition = true;
    }

    public boolean isTurnedOn() {
        return this.ignition;
    }

    public void accelerate(int currentSpeed) {
        validateAcceleration(currentSpeed);
        this.speed = this.gear + currentSpeed;
    }
    public int getAccelerate() {
        return this.speed;
    }

    public void decelerate(int currentSpeed) {
        validateAcceleration(currentSpeed);
        this.speed = currentSpeed - this.gear;
    }


    private void validateAcceleration(int currentSpeed) {
        if(currentSpeed >= 21 && currentSpeed <= 30) {
            this.gear = 2;
        }
        else if(currentSpeed >= 31 && currentSpeed <= 40) {
            this.gear = 3;
        }
        else if(currentSpeed > 40){
            this.gear = 4;
        }
        else this.gear = 1;
    }
}
