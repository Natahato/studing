package extend;

abstract class Animal {

    String name;
    String voice;
    int paws;

    Animal(String name, String voice, int paws) {
        this.name = name;
        this.voice = voice;
        this.paws = paws;
    }

    Animal() {
    }

    public void printAnimal() {
        System.out.println(name);
        System.out.println(voice);
        System.out.println(paws);
    }

//    Overload

// public void printAnimal(String a) {
//        System.out.println(name);
//        System.out.println(voice);
//        System.out.println(paws);
//    }

    abstract void getVoice();


}
