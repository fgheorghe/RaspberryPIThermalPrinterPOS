// Provides USB thermal printer functionality.
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class USBThermalPrinter {
    public Boolean print(String devicePath, String text) {
    System.out.println(devicePath);
    System.out.println(text);
        try {
            File file = new File(devicePath);

            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(text);
            printWriter.close();
            return true;
        } catch (Exception ex) {
            // TODO: Handle exceptions.
            return false;
        }
    }
}