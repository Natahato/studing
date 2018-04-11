package extend;

public class Kitty extends Animal  {

   Kitty (String name, String voice, int paws){
       super.name = name;
       super.voice = voice;
       super.paws = paws;
   }

    void getVoice() {
        System.out.println("Cat tell me Miav, miav");
    }
}
