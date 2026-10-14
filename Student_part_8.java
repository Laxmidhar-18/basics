public class Student_part_8 {
        int rollNo;
        String name;
        double marks;

        Student_part_8(int rollNo, String name, double marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }

        public static void main(String[] args) {
            Student_part_8 s1 = new Student_part_8(101, "Rahul", 85.5);
            Student_part_8 s2 = new Student_part_8(102, "Amit", 90.5);

            s1.display();
            s2.display();
        }
    }

