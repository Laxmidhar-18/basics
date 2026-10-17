public class Student_part_9 {
        int rollNo;
        String name;
        int marks;

        Student_part_9(int rollNo, String name, int marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);

            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: Fail");
            }
        }

        public static void main(String[] args) {
            Student_part_9 s1 = new Student_part_9(101, "Rahul", 92);
            Student_part_9 s2 = new Student_part_9(102, "Amit", 78);

            s1.display();
            System.out.println();
            s2.display();
        }
    }

