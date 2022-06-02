package unit_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P15_FileHandling_In_Java_Task01 {

	public static void main(String[] args)
	{
		WordCountInFile obj = new WordCountInFile("E:\\vsc_4th_sem\\Java_practice\\learning__java\\src\\unit_03\\WordCountInput");
		obj.wordsInFile();
		

	}

}

class WordCountInFile
{
	
	public int wordCount=0;
	
	WordCountInFile(String path)
	{
		File file= new File(path);
		
		
		try 
		{
			FileReader fr= new FileReader(file);
			
			int readed;
			
			
			while((readed=fr.read())!=-1)
			{
				if(readed==' '|| readed=='\n')
				{
					wordCount++;
				}
			}
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		wordCount++;
		
		
	}
	
	public void wordsInFile()
	{
		System.out.println("File Contains " + wordCount+" words");
	}
}


