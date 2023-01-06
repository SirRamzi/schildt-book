package data_input_output.comp_files;

import java.io.FileInputStream;
import java.io.IOException;

abstract public class CompFiles {
    // String file1 = "D:\\Education\\Java\\first_app\\src\\Part10\\file1.java";
    // String file2 = "D:\\Education\\Java\\first_app\\src\\Part10\\file2.java";

    public static void Comp(String file1, String file2) {
        int i = 0, j = 0;
        int marker = 0;
        try (FileInputStream f1 = new FileInputStream(file1);
                FileInputStream f2 = new FileInputStream(file2)) {
            do {
                i = f1.read();
                j = f2.read();
                if (i >= 'a' && i <= 'z') { // Приведение к верхнему регистру
                    i -= 32; // Для исключения учета регистра
                }
                if (j >= 'a' && j <= 'z') {
                    j -= 32;
                }
                marker++;
                if (i != j)
                    break;
            } while (i != -1 && j != -1);
            if (i != j) {
                System.out.println("Файлы не одинаковые, расхождение на символе " + marker);
            } else {
                System.out.println("Файлы одинаковые");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файлов " + e);
        }
    }
}
