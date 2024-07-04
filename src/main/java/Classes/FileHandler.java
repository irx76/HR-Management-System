package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class FileHandler {
    
    private static String PATH = "D:\\Work\\JAVA\\HR_Management_System\\Files\\";
    
    File file;
    private String FileName;
    

    public FileHandler(String FileName) {
        this.FileName = FileName;
        create_NewFile();
        
    }
    
    public boolean create_NewFile() {
        try {
            file = new File(PATH + FileName);
            if (file.createNewFile()){
                System.out.println("File Created: " + file.getName());
                return true;
            } else {
                System.out.println("file already exist");
                return false;
            }
        } catch (IOException e) {
            System.err.println("Something went wrong when creating the file" + e);
            return false;
        }
    }
    
    public boolean writeFile(String record) {
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(record);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();

            return true;
        } catch (IOException e) {
            System.err.println("Something went wrong when writing the file " + e);
            return false;
        }
    }
    
    public BufferedReader readFile() {
        if (create_NewFile()==false) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                return bufferedReader;
            } 
            catch (IOException e) {
                System.err.println("Something went wrong when Reading the file" + e);
            }
        }
        return null;
    }
    
}
