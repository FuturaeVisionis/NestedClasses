package local;

/**
 * Created by ronald on 05/11/16.
 * Check out the code below.
 * You have 2 methods within the class Alpha: printText & printNews.
 * printText contains the local class Beta and printNews contains the local class Creta.
 * But if you look closely the code differs slightly, although the initial outcome is the same;
 * <p>
 * The Beta object is created at the end and the Creta object is created at the start of the method.
 * Why? If you create the Beta method at the start, you won't be able the reach the local variables k and z.
 */
public class Alpha {
    int x = 10;
    static int y = 20;

    public void printText() {
        int k = 30;
        int z = 40;

        class Beta {
            public void printPage() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(k);
                System.out.println(z);
            }
        }

        Beta beta = new Beta();
        beta.printPage();
    }

    public void printNews() {

        Creta creta = new Creta();
        creta.printArticle();
    }

    class Creta {

        public void printArticle() {

            System.out.println("The Daily Telegraph.");

            class Epsilon {
                public void printBook() {
                    System.out.println("The lion feeds tonight.");
                }
            }
            Epsilon epsilon = new Epsilon();
            epsilon.printBook();

        }
    }
}

// Just as a extra note. Where you create your object, is where it get's printed! So, if you create your object directly
// beneath the method, then that's when en where it gets executed.
