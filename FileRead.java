import java.io.*;

public class FileRead
{
    public static void main(String args[])
    {
        for(int i=0;i<=1000000000;i++){
 	try{
		File file = new File("binarylogs","sangeetha.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "", oldtext = "";
		while((line = reader.readLine()) != null){
			oldtext += line + "\r\n";
                        System.out.println(oldtext);
		}
	}catch (IOException ioe){
		ioe.printStackTrace();
	}
        }
    }

    public void Test{
    }
}
