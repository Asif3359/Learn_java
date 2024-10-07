package Classes;

/**
    public class Son extends Father {

        public Son (int age , String name ) {
            super(age+10 , name);
            System.out.println("Name :"+name+" age :"+age);
        }
    }
 **/
public  class Son extends Father {
    public Son(int age, String sonName, String fatherName, String grandfatherName) {
        super(age + 25, fatherName, grandfatherName);
        System.out.println("Son's Name: " + sonName + ", Age: " + age);
    }
}
