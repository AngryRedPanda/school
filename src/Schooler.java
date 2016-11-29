
public class Schooler extends Man {
    private int marks[];
    private int markCount;

    Schooler (){
        this.marks = new int[MARK_CNT];
    }

    void addMark(String Subject, int mark) {
        this.marks[this.markCount] = mark;
        this.markCount++;
    }

    private static final int MARK_CNT = 10;
}

