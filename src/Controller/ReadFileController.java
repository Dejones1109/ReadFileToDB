package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

import Model.Infomation;

public class ReadFileController  {
	private ArrayList<Infomation> info;
	//private 
	
	// read file từ url
    public void ReadFile(String url) throws  Exception {
    	File file = new File(url);
    	FileInputStream input;
		try {
			input = new FileInputStream(file);
			int i = input.read();
			System.out.println((char)i);
			//System.out.println(input);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
		
    	
    }
}
