class Test{
    String name;
    int age;

//copy constructor
    // This constructor initializes the object with another object's values
    Test(Test t1){
        this.name=t1.name;
        this.age=t1.age;
        }
    Test(String s,int n){
        this.name=s;
        this.age=n;

    }
    public void display(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
     

}

class CopyConstructor {
    public static void main(String[] args) {
        Test t1=new Test("shivam",20);
       // t1.name="shivam";
        //t1.age=20;

        // Using the copy constructor to create a new object with the same values
        // as the existing object t1
        Test t2=new Test(t1);
        
        t2.display(); // This will display the values of t2, which are copied from t1

    }
    }