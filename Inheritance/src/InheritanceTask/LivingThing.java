package InheritanceTask;

public class LivingThing extends Thing{

    public LivingThing() {
        System.out.println("Creating LivingThing");
    }

    @Override
    public void move(){
        super.move();
    }
}
