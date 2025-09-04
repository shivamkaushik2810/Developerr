abstract class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
    abstract void sound(); // Abstract method, no body
}
  class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

  class Abstraction{
    public static void main(String[] args) {
        //Animal a=new Animal();
        Dog d=new Dog();
        d.eat(); // Calling the non-abstract method
        d.sound(); // Calling the abstract method implemented in Dog class
        // Animal a = new Animal(); // This line would cause an error because Animal is abstract
        Animal a=new Dog();
        a.eat();


        
    }
}