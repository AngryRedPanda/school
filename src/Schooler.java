
public class Schooler extends Man {
    private Mark Mark[];
    private int markCnt = 0;

    Schooler() {
        this.Mark = new Mark[MARK_CNT];
    }

    void addMark(String name, int value) {
        Mark newMark = new Mark(name, value);
        this.Mark[markCnt] = newMark;
        this.markCnt++;
    }

    double getAverageMark() {
        double averageMark = 0;
        for (int i = 0; i < this.markCnt; i++) {
            averageMark += this.Mark[i].value;
        }
        return averageMark;
    }

    double getAverageMarkByLesson(String lessonName) {
        double averageMark = 0, lessonCnt = 0;
        for (int i = 0; i < this.markCnt; i++) {
            if (this.Mark[i].lessonName.equals(lessonName)) {
                averageMark += this.Mark[i].value;
                lessonCnt++;
            }
        }
        return averageMark / lessonCnt;
    }


    private static final int MARK_CNT = 10;
}

/*
8) В классе Schooler добавить три поля: массив оценок, кол-во оценок и константу MARK_CNT, равную 10, отвечающую за максимальное кол-во оценок. Перегрузить конструктор, добавив выделение памяти для массива оценок длинны MARK_CNT

9) Добавить метод addMark, принимающий в качестве аргумента название урока и значение оценки. (Нужно создать новую оценку, добавить в массив Marks и увеличить кол-во оценок markCnt на 1)

10) Добавить метод getAverageMark(), который выдаёт среднюю оценку по всем предметам и getAverageMarkByLesson(), который выдаёт среднюю оценку по заданному названию предмета.

*/