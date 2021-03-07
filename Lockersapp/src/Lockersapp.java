
import java.io.*;
import java.util.*;

class Filehandling
{

void getlist()
{
	System.out.println("************Using List files option******");
	Scanner ky = new Scanner(System.in);
	System.out.print("Enter the directory name:");
	String dir=ky.next();
	listfile(dir);
}
 

void listfile(String directory)
{
try
{
File f = new File(directory);
String[] files=f.list();
int size = files.length;  
//logic for sorting   
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<files.length; j++)   
{  
//compares each elements of the array to all the remaining elements  
if(files[i].compareTo(files[j])>0)   
{  
//swapping array elements  
String temp = files[i];  
files[i] = files[j];  
files[j] = temp;  
}  
}  
}  
System.out.println("*********Files in the directory(Ascending order)"+directory+"*******"); 
for (String fl: files) {
	 
      System.out.println(fl);
    }

}catch(Exception e)
{
	System.out.println("File Name not found Error");
}
}

}

public class Lockersapp {
	void welcome()
	{
	System.out.println("************Welcome to Gold Lockers app***********");	
	System.out.println("***********Developer: Sarath Chandar.S************");

	}
	void optmsg()
	{
	System.out.println("Enter the following options:");
	System.out.println("[1] List the files in a directory:");
	System.out.println("[2]:Add a file");
	System.out.println("[3]:Delete a file ");
	System.out.println("[4]:Search a file");
	System.out.println("[5]:Close the appplication");
	}
		
	
	public static void main(String[] args) {
		 
	    int opt=0;
		Scanner ky = new Scanner(System.in);
		Lockersapp la=new Lockersapp();
		Filehandling fh=new Filehandling();
		la.welcome();
    while(opt!=5)
    {   
    	la.optmsg();
        System.out.print("Please enter the option:");
        try
        {
    	opt=ky.nextInt();
        }
        catch(Exception e)
        {
        	System.out.println("Enter only numerical option...");
        	break;
        }
    	while(opt==1)
    	{
    	fh.getlist();
    	
    	System.out.print("Please 1 to continue or press any number to go back to main menu:");
    	opt=ky.nextInt();
    	if(opt==1)
    		continue;
    		else 
    			break;
    	}
    	
       while(opt>5)
    	{
    		System.out.println("Enter the correct option.. Choose correct one from menu");
    		break;
    	}
    		
		}
    System.out.println("Thank you!! App closed successfully");

}

}
 

