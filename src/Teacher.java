
public class Teacher extends Man {
    private Lesson Lessons[];
    private int lessonCnt;

    Teacher() {
        this.Lessons = new Lesson[MAC_LESSON_CNT];
    }

    void addLesson(Lesson a) {
        this.Lessons[lessonCnt] = a;
    }

    void addMarkToSchooler(Schooler a, Lesson b, int value) {
        a.addMark(b.name, value);
    }


    static final int MAC_LESSON_CNT = 10;
}

/*
11) В классе Teacher добавить три поля: массив уроков, кол-во уроков и константу MAC_LESSON_CNT, равную 10, отвечающую за максимальное число уроков. Перегрузить конструктор, добавив выделение памяти для массива уроков длинны MAC_LESSON_CNT.

12) Добавить в Teacher метод addLesson(), принимающий в качестве аргумента объект класса lesson.

13) Добавить в Teacher addMarkToStudent(), принимающий в качестве аргумента объект класса student, объект класса урок и значение оценки
*/
