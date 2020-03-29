package adlsa.qa;

import java.io.File;

public class Test {
    public Test() {
        super();
    }

    public static void main(String[] args) {
        Test test = new Test();
        File oldfile =new File("D:\\workspace\\test\\aaaa.txt");
                        File newfile =new File("D:\\workspace\\test\\test.txt");
                        
                        if(oldfile.renameTo(newfile)){
                                System.out.println("Rename succesful");
                        }else{
                                System.out.println("Rename failed");
                        }
    
    }
}
