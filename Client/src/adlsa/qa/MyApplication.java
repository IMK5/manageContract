package adlsa.qa;

import adlsa.qa.srvice.Service;

import java.io.File;
import java.io.IOException;

public class MyApplication {


    public static void main(String[] args) {
        
        //String myDirectoryPath = "D:\\workspace\\test";
        String myDirectoryPath="D:\\workspace\\test\\f1";
        File[] files = Service.getFilesFromDirectory(myDirectoryPath);
        System.out.println("\n *************  Actual Structure *************  ");
        //System.out.println("== YOU HAVE : [ "+ files.length + " ] FOLDERS");
        Service.showFiles(files);
        System.out.println(" *************  END Actual Structure ************* \n ");
        System.out.println("============ Updating : ");
        try {
            Service.renameFile(myDirectoryPath);
           /* System.out.println("============ After Updating ==== : ");
            Service.showFiles(files);*/
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
