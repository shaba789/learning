import java.io.File;
import java.io.IOException;



public class MainClass{
public static void main(String args[]){
 System.out.println("This is printing from External Code");
  new MainClass().invoke(args);
 
}

public static void invoke(String[] params){
	try {

     File file = new File("c:\\newfile.txt");

     if (file.createNewFile()){
       System.out.println("File is created!");
     }else{
       System.out.println("File already exists.");
     }

	} catch (IOException e) {
     e.printStackTrace();
}	
}
}
