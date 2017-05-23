package anonymous;

/**
 * Created by ronald on 05/11/16.
 * Remember, anonymous classes are short cut for overriding methods. It's a kind of polymorphism.
 */
public class BuildYourAtom {
    public static void main(String[] args) {

        Atom atom = new Atom() {
            @Override
            void proton() {
                System.out.println("Uranium has 42 protons.");
            }
        };
        atom.proton();

        Atom atom1 = new Atom() {
            @Override
            void proton() {
                System.out.println("Plutonium has 92 electrons.");
            }
        };
        atom1.proton();

    Atom.HydroPower hydroPower = new Atom.HydroPower();
        hydroPower.turbine("hydro ");
}}

// Now what's the deal with this anonymous class? Well, in all the other (nested) class examples like static, local or inner,
// the nested class was created outside main. Anonymous classes are erected within the main class!!