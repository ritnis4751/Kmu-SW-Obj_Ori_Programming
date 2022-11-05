public class Student {
    private String name;
    private int score;
    
    public Student() {
    	name = "unknown";
    	score = 0;
    }
    
    public Student(String n, int s) {
        name = n;
        score = s;
    }
    
    public void setName(String n) {
    	name = n;
    }
    
    public void setScore(int s) {
    	score = s;
    }
    
    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }
}
