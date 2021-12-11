import Beepers.Beeper;
import Engines.Engine;

public class Priora extends Car{
    public Priora(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }
    String downShifting (){
        return "занижена";
    }
}
