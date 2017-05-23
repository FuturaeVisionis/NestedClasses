package inner;

/**
 * Created by ronald on 05/11/16.
 * Non static classes are associated with an instance of the endorsing class. THUS, YOU MUST FIRST CREATE AB INSTANCE
 * OF THE ENCLOSING CLASS TO CREATE AN INSTANCE OF AN INNER CLASS.
 */
public class Run {
    public static void main(String[] args) {

        Outer outer = new Outer(); // CREATING AN INSTANCE OF THE OUTER CLASS.
        Outer.Inner inner = outer.new Inner(); // CREATING AN INSTANCE IF THE INNER CLASS.
        inner.minutes();

        // the stuff below is the same as the above!! It's just written differently.
        Outer.Inner inner2 = new Outer().new Inner();
        inner2.minutes();

        System.out.println();

        Outer outer1 = new Outer();
        Outer.Inner.Center inner4 = outer1.new Inner().new Center();
        inner4.seconds();

        Outer.Inner.Center inner3 = new Outer().new Inner().new Center();
        inner3.seconds();

        System.out.println();

        Outer.Inner.Center.Atom inner5 = new Outer().new Inner().new Center().new Atom();
        inner5.lunchTime();

    }
}
