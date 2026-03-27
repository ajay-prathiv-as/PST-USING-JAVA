import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(new Student(sc.next(), sc.nextInt()));

        Collections.sort(list, (a, b) -> {
            if (a.marks != b.marks) return b.marks - a.marks;
            return a.name.compareTo(b.name);
        });

        for (Student s : list)
            System.out.println(s.name + " " + s.marks);

        sc.close();
    }
}
