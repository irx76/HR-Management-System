package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class User {
    
    private String Username;
    private String Password;
    private String UserType;
    
    public User(String Username, String Password,String UserType){ 
        this.Username=Username;
        this.Password=Password;
        this.UserType=UserType;
    }
    
    private User(){
    }
    
    FileHandler filee;
    String[] arr;
    String line;
    
    public boolean CheckUser() throws FileNotFoundException, IOException{
        if("HR".equals(UserType)){
            BufferedReader br= new BufferedReader(new FileReader("D:\\Work\\JAVA\\HR_Management_System\\Files\\HRaccounts.txt"));
            while((line=br.readLine())!=null){
                arr=line.split(",");
                for(String asd:arr){
                    System.out.println(asd);
                }
               
                if(arr[1].equals(Username) && arr[2].equals(Password)){
                            return true;
                        }
            }
        }
        
        if("HR Assisstant".equals(UserType)){

            BufferedReader br= new BufferedReader(new FileReader("D:\\Work\\JAVA\\HR_Management_System\\Files\\HR_Assisstant_accounts.txt"));
            while((line=br.readLine())!=null){
                arr=line.split(",");
                for(String asd:arr){
                    System.out.println(asd);
                }
                
                if(arr[1].equals(Username) && arr[2].equals(Password)){
                            return true;
                        }
            }
        
        }
        
        if("Admin".equals(UserType)){
            
            try {
                if(Username.equals("admin") && Password.equals("123abc")){
                    return true;
            }

                else{
                    return false;
                    }
            }
            catch (Exception e){
                return false;
            }
        }
        return false;
    }
}
