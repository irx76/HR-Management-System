package Classes;

public class HR_Assisstant {
    private String HR_Ass_Username;
    private String HR_Ass_pw;
    private String Name;
    
    FileHandler file=new FileHandler("HR_Assisstant_accounts.txt");

    public HR_Assisstant(String HR_Ass_Username, String HR_Ass_pw, String Name) {
        this.HR_Ass_Username = HR_Ass_Username;
        this.HR_Ass_pw = HR_Ass_pw;
        this.Name = Name;
    }

    public String getHR_Ass_Username() {
        return HR_Ass_Username;
    }

    public void setHR_Ass_Username(String HR_Ass_Username) {
        this.HR_Ass_Username = HR_Ass_Username;
    }

    public String getHR_Ass_pw() {
        return HR_Ass_pw;
    }

    public void setHR_Ass_pw(String HR_Ass_pw) {
        this.HR_Ass_pw = HR_Ass_pw;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    public boolean addHR_Ass(){
        
        if(!file.create_NewFile()){
            String record = Name + ","+ HR_Ass_Username +"," + HR_Ass_pw;
            return file.writeFile(record);
        }
        return false;
    }
    
    
    
}
