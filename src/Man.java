
public class Man {
    private String name;
    private String second_name;
    private int age;

// Main constructors

    Man() {

    }

    Man(String name, String second_name, int age) {
        this.name = name;
        this.second_name = second_name;
        this.age = age;
    }

// Getters and Setters

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getFullName() {
        return this.name + " " + this.second_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String a) {
        String sArr[] = a.split(" ");
        this.name = sArr[0];
        this.second_name = sArr[1];
    }

    String displayUsers(Man man[]) {
        StringBuilder sb = new StringBuilder();
        for (Man b : man
                ) {
            sb.append(b.toString() + "\n");
        }
        return sb.toString();
    }

// toString

    public String toString() {
        return this.name + " " + this.second_name + ": " + age;
    }

// Statics

    static int getAverageAge(Man man[]) {
        int averageAge = 0;
        for (Man b : man
                ) {
            averageAge += b.age;
        }
        return averageAge / man.length;
    }
}

/*
19) Добавить в класс Man статический метод getAverageAge, принимающий в качестве аргумента массив класса Man, выводящий средний возраст всех людей

20) Добавить метод в класс Man displayUsers(), принимающий в качестве аргумента массив класса Man и выводящий в консоль построчно текстовые представления объектов(toString)
*/