
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

// toString

    public String toString() {
        return this.name + " " + this.second_name + ":" + age;
    }
}
