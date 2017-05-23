package staticNested;

/**
 * Created by ronald on 05/11/16.
 * In Java nested classes are considered members of their endorsing class.Thus, a nested class can be declared
 * public, private, package (default) or protected. THEREFORE NESTED CLASSES IN JAVA CAN ALSO BE INHERITED BY SUBCLASSES.
 */
public class Execute {

    static int first = 1;
    static int second = 2;

    public static void main(String[] args) {

        if (second > first) {

            Outer.Nested instance = new Outer.Nested();
            instance.FirstGear();
        }
        if (second < 3) {

            Outer.Nested instance = new Outer.Nested();
            instance.SecondGear();
        }
        if (first > 0) {

            Outer.Nested.DoubleNested instance = new Outer.Nested.DoubleNested();
            instance.Reverse();
            instance.FirstGear(); // you can extend nested classes.
            instance.SecondGear(); // you can extend nested classes.
        }
    }
}
