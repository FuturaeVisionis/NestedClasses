package staticNested;

/**
 * Created by ronald on 05/11/16.
 */
public class Outer {

    public static class Nested{

        public void FirstGear(){
            System.out.println("Put car in first gear.");
        }
        public void SecondGear(){
            System.out.println("Put car in second gear.");
        }
        public static class DoubleNested extends Nested{
            protected void Reverse(){
                System.out.println("Put car in reverse gear.");
            }
        }
    }
}
