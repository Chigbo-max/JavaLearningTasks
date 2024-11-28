package InheritanceTask;

public class Amphibian extends Vertebrate{

    public Amphibian(){
        System.out.println("Inside Amphibian");

    }

    @Override
    public void name(String name){
        printFirstName(name);
    }

    private void printFirstName(String firstName){
        System.out.println(firstName);
    }
}
