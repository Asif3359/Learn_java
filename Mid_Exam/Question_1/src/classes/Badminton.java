package classes;

public class Badminton extends Football {
    private  int score ;
    private  char grade;
    public Badminton(int score, char grade) {
        super(score, grade);
        this.score = score;
        this.grade = grade;
        System.out.println("Badminton class");
    }
}
