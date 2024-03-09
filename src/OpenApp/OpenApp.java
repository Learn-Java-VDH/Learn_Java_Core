package OpenApp;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
public class OpenApp {
	 public static void main(String[] args) {
	        // Replace "path/to/application.exe" with the actual path to the application
	        File file = new File("C:/WINDOWS/system32/cmd.exe");

	        try {
	            Desktop.getDesktop().open(file);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
