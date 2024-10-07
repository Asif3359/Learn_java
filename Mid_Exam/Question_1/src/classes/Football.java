package classes;

public class Football extends Cricket {
    private int scor;
    private char grade;
    public Football(int scor, char grade) {
        super(0, scor, grade);
        this.scor = scor;
        this.grade = grade;
        System.out.println("In Football class");
    }
}
