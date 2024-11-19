package pcg;

import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Statement> getGrade() {
        return grade;
    }

    public void setGrade(List<Statement> grade) {
        this.grade = grade;
    }

    public Student(String name, String group, int course, List<Statement> grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
        setAverageScore(averageScore);
    }

    private  String name;
    private  String group;
    private  int course;
    private List<Statement> grade;

    public float getAverageScore() {

        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        int sum=0;
        for (Statement statement : grade) {
            sum += statement.getMark();
        }
        this.averageScore = (float) sum /grade.size();
    }

    private float averageScore;
}
