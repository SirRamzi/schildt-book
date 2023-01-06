package data_input_output.help;

import java.io.BufferedReader;
import java.io.FileReader;

public class Help {
    String helpfile;

    public Help(String helpfile) {
        this.helpfile = helpfile;
    }
    
    public boolean info(String tag) {
        int ch;
        String title, info;
        try (BufferedReader helpReader = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = helpReader.read();
                if (ch == '#') {
                    title = helpReader.readLine();
                    if (title.compareTo(tag) == 0 ) {
                        info = helpReader.readLine();
                        while (info != null && info.compareTo("") != 0) {
                            System.out.println(info);
                            info = helpReader.readLine();
                        }
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (Exception e) {
            System.out.println("Ошибка открытия файла");
            return false;
        }
        return false;
    }
}
