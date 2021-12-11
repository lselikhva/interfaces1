import Beepers.Beeper;
import Engines.Engine;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }
    String getCost(){
        return"оч много";
    }
}
