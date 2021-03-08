
/**************************
 * Author: Sarath Chandar S
 * Program: LockersApp- prototype for file management tool
 **************************/


import java.io.*;
import java.util.*;

class Filehandling
{
/*call list file module*/
void getlist()
{
	System.out.println("************Using List files option******");
	Scanner ky = new Scanner(System.in);
	System.out.println("Enter the directory name:");
	String dir=ky.next();
	listfile(dir);
}
/*call add file module*/
void getadd()
{
	System.out.println("************Add a file option******");
	Scanner ky = new Scanner(System.in);
	System.out.println("Enter the directory name:");
	String dir=ky.next();
	System.out.println("Enter the file name:");
	String fl=ky.next();
	addfile(dir,fl);
}
/*call delete file module*/
void getdel()
{
	System.out.println("************Delete a file option******");
	Scanner ky = new Scanner(System.in);
	System.out.println("Enter the directory name:");
	String dir=ky.next();
	System.out.println("Enter the file name:");
	String fl=ky.next();
	delfile(dir,fl);
}
/*call search file  module*/
void getsearch()
{
	System.out.println("************Search a file option******");
	Scanner ky = new Scanner(System.in);
	System.out.println("Enter the directory name:");
	String dir=ky.next();
	System.out.println("Enter the file name:");
	String fl=ky.next();
	searchfile(dir,fl);
}

/*Add file module*/
void addfile(String directory,String file)
{
	File f= new File(directory,file);
	boolean a;
	try {
		a=f.createNewFile();
		if(a)
		{
			System.out.println("File created Sucessfully");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("File path Error");
	}
}

/*Delete file module*/
void delfile(String directory,String file)
{
	File f= new File(directory,file);
	boolean a;
		a=f.delete();
		if(a)
		{
			System.out.println("File Sucessfully deleted");
		}else
		{
			System.out.println("File not found");
		}
	    
}

/*Search file module*/
void searchfile(String directory,String file)
{
	File f= new File(directory,file);
	boolean a;
		a=f.exists();
		if(a)
		{
			System.out.println("File Found in this directory");
		}else
		{
			System.out.println("File not found in this directory");
		}
	    
}

/*Search file module*/
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
	/*Welcome message*/
	void welcome()
	{
	System.out.println("************Welcome to Gold Lockers app***********");	
	System.out.println("***********Developer: Sarath Chandar.S************");

	}
	
	/*Main Menu*/
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
    	while(opt==2)
    	{
    	fh.getadd();
    	
    	System.out.println("Please 2 to continue or press any number to go back to main menu:");
    	opt=ky.nextInt();
    	if(opt==2)
    		continue;
    		else 
    			break;
    	}
    	while(opt==3)
    	{
    	fh.getdel();
    	
    	System.out.println("Please 3 to continue or press any number to go back to main menu:");
    	opt=ky.nextInt();
    	if(opt==3)
    		continue;
    		else 
    			break;
    	}
    	while(opt==4)
    	{
    	fh.getsearch();
    	
    	System.out.println("Please 4 to continue or press any number to go back to main menu:");
    	opt=ky.nextInt();
    	if(opt==4)
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
 

