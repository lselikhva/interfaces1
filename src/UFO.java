import Beepers.Beeper;
import Engines.Engine;

public class UFO extends Car{
    public UFO(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }
    String fly(){
        return "полет";
    }

}
