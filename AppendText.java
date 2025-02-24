import java.io.*;

class AppendText {
	public static void appendStrToFile(String fileName,String str)
	{		
		try 
        {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));            
            out.write(str);
			out.close();
		}
		catch (IOException e) 
        {
			System.out.println("exception occurred" + e);
		}
	}
		public static void main(String[]args) throws Exception
		{	
       		 String fileName = "TestingFile.txt";
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(fileName));			
			out.write("Text has added successfully\n");			
			out.close();
		}		
		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
		String str = "This is Satyam Jain";

		appendStrToFile(fileName, str);

		// Let us print modified file
		try {
			BufferedReader outputString = new BufferedReader(new FileReader("TestingFile.txt"));

			String mystring;

			// TIll there is content in string
			// condition holds true
			while ((mystring = outputString.readLine()) != null) {
				System.out.println(mystring);
			}
		}

		// Catch block to handle IO exceptions
		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}
