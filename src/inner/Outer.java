package inner;

/**
 * Created by ronald on 05/11/16.
 */
public class Outer {
    public void hours() {
        System.out.println("One o clock.");
    }

    public class Inner {
        public void minutes() {
            System.out.println("Two minutes.");
        }

        public class Center {
            public void seconds() {
                System.out.println("Milliseconds are Mickey mouse seconds.");
            }

            public class Atom {
                public void lunchTime() {
                    System.out.println("The best time, is lunch time.");

                    Electron electron = new Electron(); // this is the special attention. See local classes
                    electron.breakfast();
                }


                // this guy is a local class (it lives within a method) and therefore needs special attention!
                class Electron {
                    public void breakfast() {
                        System.out.println("The most important meal of the day, is breakfast");
                    }
                }

            }
        }
    }
}

