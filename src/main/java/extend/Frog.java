package extend;

public class Frog extends Animal implements MoveAnimal {


    Frog(String name, String voice, int paws) {
        super.name = name;
        this.paws = paws;
        super.voice = voice;
    }

    public void getVoice() {
        System.out.println("frog say Quo");
    }

    public void ahead(int steps) {
        System.out.println("Frog go ahead on " + steps + " steps");
    }

    public void back(int backSteps) {
        System.out.println("She go back on " + backSteps + "steps");
    }



    @Override
    public void printAnimal(){
        System.out.println("I will be");
    }
}
