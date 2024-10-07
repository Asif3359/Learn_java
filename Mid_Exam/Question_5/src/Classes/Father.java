package Classes;

/**
     public class Father extends Grandfather{

         public Father(int age , String name) {
             super(age, name);
             System.out.println("Name :"+name+" age :"+age);
         }
     }
 **/
public  class Father extends Grandfather {

    public Father(int age, String fatherName, String grandfatherName) {
        super(age + 25, grandfatherName); // Passing modified age and different name to Grandfather's constructor
        System.out.println("Father's Name: " + fatherName + ", Age: " + age);
    }
}
