import Beepers.Beeper;
import Beepers.Horn;
import Engines.Engine;
import Engines.EngineV12;
import Engines.EngineV6;



public class Main {
    public static void main(String[] args) {
// создадим машину
       Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();

        Lambo lambo = new Lambo(horn,engineV12);



        Beeper magicSound = new Beeper.MagicSound();
        Engine engineV6 = new EngineV6();

        Priora priora = new Priora(magicSound,engineV6);
//      д/з
        Beeper hang = new Beeper.Hang();
        Engine weightlessness = new weightlessness();
        UFO ufo = new UFO(hang,weightlessness);

        Beeper beepBeep = new Beeper.beepBeep();
        Engine MM3 = new MM3();
        Bus bus = new Bus(beepBeep,MM3);

        Beeper buzzer = new Beeper.buzzer();
        Engine Perkins = new Perkins();
        Truck truck = new Truck(buzzer,Perkins);

        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.getCost());

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.downShifting());
//      Д/з
        System.out.println(ufo.beeper.makeSound());
        System.out.println(ufo.engine.getSpeed());
        System.out.println(ufo.fly());

        System.out.println(bus.beeper.makeSound());
        System.out.println(bus.engine.getSpeed());
        System.out.println(bus.bigSchoolBus());

        System.out.println(truck.beeper.makeSound());
        System.out.println(truck.engine.getSpeed());
        System.out.println(truck.cargoPlatform());



    }
}
