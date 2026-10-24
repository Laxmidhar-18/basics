
    import java.io.FileInputStream;
import java.io.IOException;
    public class Studenat_part_12 {

        public static void main(String[] args) {
            try {
                FileInputStream fin = new FileInputStream("student.txt");

                int i;
                while ((i = fin.read()) != -1) {
                    System.out.print((char) i);
                }

                fin.close();
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            }
        }
    }

