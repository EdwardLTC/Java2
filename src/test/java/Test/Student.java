package Test;

public class Student {
    private String FullName;
    private float Score;

    public Student(String FullName, float Score) {
        this.FullName = FullName;
        this.Score = Score;
    }
    
    public String getFullName() {
        return this.FullName;
    }
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public float getScore() {
    	return this.Score;
    }
    public void setScore(float Score) {
    	this.Score = Score;
    }



}
