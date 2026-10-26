public class Student_part_13 {
        int rollNo;
        String name;
        int marks;

        Student_part_13(int rollNo, String name, int marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println();
        }

        public static void main(String[] args) {
            Student_part_13[] s = new Student_part_13[3];

            s[0] = new Student_part_13(101, "Rahul", 85);
            s[1] = new Student_part_13(102, "Amit", 90);
            s[2] = new Student_part_13(103, "Rohan", 78);

            for (int i = 0; i < s.length; i++) {
                s[i].display();
            }
        }
    }

