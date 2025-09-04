
class Student {

    private String name;
    private int age;

    public void setDetails(String x, int y) {
        this.name = x;
        System.out.println(x);
        this.age = y;
        System.out.println(y);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //public void display() {
    //  System.out.println("Name: " + name + ", Age: " + age);


///}
}






public class Encapsulation1 {

    public static void main(String[] args) {
        Student s = new Student();// object creation
        s.setDetails("shivam kaushik", 20);
        s.setDetails("jahanvi", 18);
        //student.display();

        // Accessing private fields directly would cause an error
        // System.out.println(student.name); // This line would not compile
        // System.out.println(student.age);  // This line would not compile
    }
}
