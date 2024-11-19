package pcg;

public class Statement {
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Statement(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    private  String subject;
    private int mark;
}
