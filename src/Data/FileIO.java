package Data;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Bank.*;

public class FileIO {
	
	public static Bank bank=null;

	public static void Read()
	{
		FileInputStream fileInput=null;
		ObjectInputStream objectStream=null;
		try {
			fileInput =new FileInputStream("data");
			objectStream = new ObjectInputStream(fileInput);
			FileIO.bank = (Bank)objectStream.readObject();
			}
			
		catch (Exception en) {
			FileIO.bank = new Bank();
				}
		
		finally{
			try{
				if(objectStream != null) objectStream.close();
				if(fileInput != null) fileInput.close();
			}
			catch (IOException en) {
			}
			
		}
	}
	
	public static void Write()
	{
		try {
				FileOutputStream fileOutput=new FileOutputStream("data");
				ObjectOutputStream out=new ObjectOutputStream(fileOutput);
				out.writeObject(FileIO.bank);
				out.flush();
				fileOutput.close();
			}
			catch(Exception en)
			{				
			}
	}
}
