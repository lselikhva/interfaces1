import Beepers.Beeper;

public class beepBeep implements Beeper {
    @Override
    public String makeSound() {
        return "бип-бип";
    }
}
