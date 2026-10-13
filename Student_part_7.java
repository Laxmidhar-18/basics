public class Student_part_7 {
        int rollNo;
        String name;
        int marks;

        Student_part_7(int rollNo, String name, int marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);

            if (marks >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        public static void main(String[] args) {
            Student_part_7 s1 = new Student_part_7(101, "Rahul", 85);
            Student_part_7 s2 = new Student_part_7(102, "Amit", 35);

            s1.display();
            System.out.println();

            s2.display();
        }
    }

