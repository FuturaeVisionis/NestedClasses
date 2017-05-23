package inner;

/**
 * Created by ronald on 29/04/2017.
 */
public class Fish {

    static String depth = "lot's of";

    void swim() {

        String depth = "hundreds of";

        class Shark {
            public void ocean() {
                System.out.println("Sharks like swimming " + Fish.depth + " meters down in the ocean.");
                //System.out.println("Sharks like swimming " + depth + " meters down in the ocean.");
            }

            class MountainLion {
                public String Rock(String a) {
                    System.out.println("Mountain Lions are also called: " + a);
                    return a;
                }
            }
        }
        Shark shark = new Shark();
        shark.ocean();

        //now follows a second inner class.
        Shark.MountainLion moutainLion = shark.new MountainLion();
        moutainLion.Rock("Rock Leopards");

    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim();
    }
}

