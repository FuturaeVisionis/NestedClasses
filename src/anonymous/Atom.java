package anonymous;

/**
 * Created by ronald on 05/11/16.
 */
abstract class Atom {

    abstract void proton();

    {
        Neutron neutron = new Neutron();
        neutron.energy();
    }

    class Neutron { // is what we call a local class, right?
        public void energy() {
            System.out.println("Neutrons create energy. ");
        }
    }
    //Neutron neutron = new Neutron();
    //neutron.energy();

    static class HydroPower { // this is what we call a inner class, right?
        public String turbine(String alpha) {
            System.out.println("Power derived from water is called: " + alpha + "power.");
            return alpha;
        }
    }
}
/*
You can't reach into HydroPower if it is not static. Reason for this that the abstract class Atom can not be instantiated.
 */
