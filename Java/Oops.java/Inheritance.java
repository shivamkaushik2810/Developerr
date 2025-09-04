class College{
    String name;
    int age;
    public void sec(){
        System.out.println("this is ypur sectoin");
    }

}
class Student extends College{
    String course;
    int year;
     public void sec(){
        System.out.println("this is your section in student class");
        System.out.println("student name is "+name);
    }
    

    }


class Inheritance{
    public static void main(String[] args) {
        College c=new College();
        
        
        Student s=new Student();
        
        s.sec();
        College c1=new Student();
        c1.sec();
        

        
    }
}