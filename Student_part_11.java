public class Student_part_11 {
        String name;
        String subject;

        Student_part_11(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Subject: " + subject);
        }

        public static void main(String[] args) {
            Student_part_11 s1 = new Student_part_11("Rahul", "Java");
            Student_part_11 s2 = new Student_part_11("Amit", "Python");

            s1.display();
            System.out.println();
            s2.display();
        }
    }
