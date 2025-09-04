package VivekSirJava;


public class SingleTon {
    public static void main(String[] args) {
          Car c1=Car.createObject("thar","mahindera","petrol");
         Car c2=Car.createObject("honda","suzuki","diesel");
        Car c3=Car.createObject("maruti","honda","petrol");
        System.out.println(c1.name);
         System.out.println(c2.name);
          System.out.println(c3.name);

        
    }
}
  
    
    

class Car{
     static Car obj=null;
    String name;
    String brand;
    String _Fueltype;
  private   Car( String name,String brand1,String Fueltype){
        this.name=name;
        brand=brand1;
        _Fueltype=Fueltype;
    }
    static Car createObject(String name,String brand1,String Fueltype){
      if(obj==null){
        obj=new Car(name,brand1, Fueltype);
      }
      return obj;
      

    }
    //new car

}
