import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {

	String filename;
	PrintWriter writer;
	Date date;
	
	Logger() {
		filename = "logfile.txt";
		try {
			writer = new PrintWriter(new FileWriter(filename, true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		date = new Date();
		writer.println("\n\n==== LOG OPENED ====");
		writer.println("Opened on " + date.toString());
		writer.flush();
	}
	
	/*	
	Logger(String filename) {
		this.filename = filename;
		 
		try {
			new PrintWriter(new FileWriter(filename, true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		date = new Date();
	}
	*/
	void close() {
		writer.close();
	}
	
	void out(String output) {
		
		// If I'm feeling ambitious, I'll use some reflection to also print out the calling method.
		// Also, currently extra-long/multi-line output won't look nice.
		writer.print("[" + date.toString() + "] " + output);
		writer.flush();
	}
	
}
