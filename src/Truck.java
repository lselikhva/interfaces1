import Beepers.Beeper;
import Engines.Engine;

public class Truck extends Car{
    public Truck(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }
    String cargoPlatform(){
        return "платформа для груза";

    }
}
