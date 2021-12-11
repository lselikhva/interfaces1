package Beepers;

public interface Beeper {

    String makeSound();


    class MagicSound implements Beeper {
        @Override
        public String makeSound() {
            return "vbm.mb,.v";
        }
    }


     class Hang implements Beeper {
        @Override
        public String makeSound() {
            return "x - Files";
        }
    }
    class beepBeep implements Beeper{

        @Override
        public String makeSound() {
            return "бип-бип";
        }

    }

    public class buzzer implements Beeper {
        @Override
        public String makeSound() {
            return "Гууууууудддооокк";
        }
    }
}
