

class Test{
    String name;
    int age;

    // Constructor with parameters
    Test(String name, int age) {
        this.name = name;
        this.age = age;

    }
     void display(){
        System.out.println(name);
        System.out.println(age);

    }
}




class ParameterConstructor {
    public static void main(String[] args) {
Test t=new Test("shivam kaushik",20);
t.display();






    }
        
    }