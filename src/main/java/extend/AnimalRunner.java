package extend;

public class AnimalRunner {
    public static void main(String[] args) {

        Frog frog = new Frog("Queen", "Quo", 4);

        Kitty kitty = new Kitty("Bagira", "Miav, miav", 4);

        frog.printAnimal();
        frog.getVoice();
        frog.ahead(3);
        frog.back(2);
        frog.paws = 2;
        frog.printAnimal();

        kitty.printAnimal();
        kitty.getVoice();

    }

}
