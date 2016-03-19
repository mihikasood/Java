import java.io.File;
import java.lang.String;

public class ListFiles{
	public static void main(String args[]){
	File f= null;
	File[] paths;
	
	
		f=new File(".");//open folder to check
	
		paths=f.listfiles();//takes all files and directories one by one
		//now need to check if each item is file or directory. if file print path. if directory print path of directory and then each file inside it
		for(File path:paths)//for loop for checking out paths of all directories and files 
         {
            //now check or directory or file and print
			if(f.isDirectory())
			{paths = f.getPath();
			System.out.println(path+"is directory");}
			else
			{System.out.println(path);}
			
			
         }
		
		
	}


	
}
