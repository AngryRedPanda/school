
public class Main {
    public static void main(String[]args) {

        Schooler test1 = new Schooler("Michael", "Johnson", 18);
        test1.addMark("Math", 1);
        test1.addMark("Russian", 2);
        test1.addMark("Math", 3);
        System.out.print(test1.toString());
    }
}
