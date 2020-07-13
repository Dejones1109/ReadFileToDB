package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

import Model.Infomation;
import System.mysql.ReadFileDB;

public class ReadFileController  {
	public Infomation info;
	public ReadFileDB db = new ReadFileDB();
	//private 
	
	// read file từ url
    public void ReadFile(String url) throws  Exception {
    	File file = new File(url);
    	FileInputStream input;
		try {
			input = new FileInputStream(file);
		
			int i=0;
		    String word="";
		    String words[];
		    while((i=input.read())!=-1) {
		    	char w = (char)i;
		    	word+=w;
		    	words =  new String [i];
		    	int j=0;
		    	if(w == '\n') {
		    		words[j]=word.trim();
		    		info= new Infomation();
		    		String Sub[] = word.split("\\|");
		    		System.out.println(Sub.length);
		    		for (int k = 0; k < Sub.length; k++) {
						info.setID(Sub[0]);
						info.setFullName(Sub[1]);
						info.setSex(Sub[2]);
						info.setVillage(Sub[3]);
						info.setAddress(Sub[4]);
					}
		    		System.out.println(info.getID()+info.getFullName()+info.getSex()+info.getVillage()+info.getAddress());
		    		db.SaveToDB(info.getID(),info.getFullName(),info.getSex(),info.getVillage(),info.getAddress());
		    		word=" ";
		    		j++;
		    		System.out.println("done");
		    	}
		    	
		    }
		    input.close();
			//System.out.println(input);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
		
    	
    }
}
