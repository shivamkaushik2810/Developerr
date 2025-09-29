public class DemoClasses {
    public void printData() {
        System.out.println("this is the outer class");
    }
   
    // this is the first type of class (static nested class)
    public static class DemoClasses2 {
        public void printData() {
            System.out.println("this is the first inner demoClasses2");
        }
    }

    // this is the second type of class (member inner class)
    public class DemoClasses3 {
        public void printData() {
            System.out.println("this is the second inner demoClasses3");
        }
    }

    // this is the third type of class (local class inside a method)
    void createClass() {
        // local class
        class DemoClasses4 {
            void printData() {
                System.out.println("this is the third inner demoClasses4");
            }
        }

        // instantiate the local class so it's used
        new DemoClasses4().printData();
    }
}

    