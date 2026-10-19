public class Student_part_10{
        String name;
        String course;
        String city;

        Student_part_10(String name, String course, String city) {
            this.name = name;
            this.course = course;
            this.city = city;
        }

        void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Course: " + course);
            System.out.println("City: " + city);
            System.out.println("Welcome, " + name + "!");
        }

        public static void main(String[] args) {
            Student_part_10 s1 = new Student_part_10("Laxmidhar", "Java", "Cuttack");
            Student_part_10 s2 = new Student_part_10("Biswal", "Python", "Bhubaneswar");

            s1.display();
            System.out.println();
            s2.display();
        }
    }
