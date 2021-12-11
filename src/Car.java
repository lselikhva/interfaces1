import Beepers.Beeper;
import Engines.Engine;

public abstract class Car {

    Beeper beeper;
    Engine engine;

    public Car(Beeper beeper, Engine engine ){
        this.beeper = beeper;
        this.engine = engine;
    }

    }

