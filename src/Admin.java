
public class Admin extends Man {

    private Schooler Schoolers[];
    private Teacher Teachers[];
    private int schoolerCnt;
    private int teacherCnt;

    Admin() {
        this.Schoolers = new Schooler[MAX_SCHOOLER_CNT];
        this.Teachers = new Teacher[MAX_TEACHER_CNT];
    }


    void addSchooler(Schooler a) {
        this.Schoolers[this.schoolerCnt] = a;
        this.schoolerCnt++;
    }

    void addTeacher(Teacher a) {
        this.Teachers[this.teacherCnt] = a;
        this.teacherCnt++;
    }


    void addLessonToAllTeachers(String name, String date) {
        for (int i = 0; i < this.teacherCnt; i++) {
            this.Teachers[i].addLesson(new Lesson(name, date));
        }
    }

    static final int MAX_SCHOOLER_CNT = 20;
    static final int MAX_TEACHER_CNT = 20;

}

/*
14) В классе Admin добавить поля, соответствующие массиву учителей и учеников, добавить два поля, отвечающие за максимальное кол-во учеников и учителей.

15) Перегрузить конструктор, добавив в него выделение памяти для массивов.

16) написать метод добавления учителя, принимающего в качестве аргумента объект класса teacher,

17) написать метод добавления ученика, принимающего в качестве аргумента объект класса schooler

18) Метод добавления всем учителям урока, принимающего в качестве аргументов (название урока и дату)
 */
