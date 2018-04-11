import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void testOfMy(){

        printAnimalVoice("frog");
    }

    private void printAnimalVoice(String animalType) {

        if (animalType == "cat"){
            System.out.println("myau myau");
        }else if (animalType == "dog"){
            System.out.println("gow gow");
        }else System.out.println("I do not know what animal voice");
        }
    }
