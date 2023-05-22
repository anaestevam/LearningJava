package arquivos;

import java.io.*;
import java.util.*;

class Program{
    Scanner sc = new Scanner (String[] args);

    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("Folders:");
    for (File folder : folders){
        System.out.println(folder);
    }

    File[] files = path.listFiles(File::isFile);
    System.out.println("Files:");
    for (File file : files){
        System.out.println(file);
    }

    boolean sucess = new File(strPath + "\\subdir").mkdir();
    System.out.println("Directory created sucessfully: " + sucess);

    sc.close();
}