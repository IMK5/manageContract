package adlsa.qa.srvice;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class Service {

 

    /**
     * Get all directory's files
     * @param myDirectoryPath
     * @return File[]
     */
    public  static File[] getFilesFromDirectory(String myDirectoryPath) {
        System.out.println("Calla Service.getFilesFromDirectory method >>");
        File dir = new File(myDirectoryPath);
        return dir.listFiles();

    }

    public static  void showFiles(File[] files) {
        int  d=0;
        if (files != null) {
            
            for (File file : files) {
                if (file.isDirectory()) {
                    d++;
                    System.out.println("\n FOLDER  " +  "[ "+d +" ] : "  +file.getName());
                    showFiles(file.listFiles()); // Calls same method again.
                } else {
                    System.out.println("            --> File : " + file.getName());

                }
            }
        }

    }

    public static void showAndRenameFiles(File[] files) throws IOException {
        if (files != null) {
            
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("\n == FOLDER:  " + "[ "+file.getName() +"]");
                    showAndRenameFiles(file.listFiles()); // Calls same method again.
                } else {
                    System.out.println("            --> File name : " + file.getName());
                    System.out.println("==> PLEASE ENTER FILE TYPE: ");
                    Scanner in = new Scanner(System.in);
                    String codeFile = in.nextLine();
                    String newPathFile= file.getParent()+"\\"+file.getName()+"_"+codeFile;
                    file.renameTo(new File(newPathFile));
                    
                    

                }
            }
        }
    }


    public static void renameFile(String myDirectoryPath) throws IOException {

        File[] files = getFilesFromDirectory(myDirectoryPath);
        showAndRenameFiles(files);


    }


}
