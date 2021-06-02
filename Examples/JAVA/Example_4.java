public class Main {
    String stringA = "Test";
    Object objectA = new A();
    Object object;

    public void testBreakpointCondition() {
        objectB = objectA;
        if (objectA.equels(objectB)) {
            System.out.ptintln("objectA = " + objectA);
            System.out.ptintln("StringA = " + StringA);
        }
    }

    public static void main(String[] args){
        new ConditionSample().testBreakpointCondiyion();
    }
}