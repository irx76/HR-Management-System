package Classes;

public class Admin {
    
    public void CreateHR(String Name,String Pw, String Username ){
        
        HR hr1=new HR(Username, Pw, Name);
        hr1.addHR();
    }
    
    public void CreateHR_assisstant(String Name, String pw, String USername){
        HR_Assisstant ass1=new HR_Assisstant(USername, pw, Name);
        ass1.addHR_Ass();
    }
    
}
