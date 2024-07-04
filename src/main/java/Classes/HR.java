package Classes;

public class HR{
    private String HRUSername;
    private String HRpw;
    private String Name;
    
    FileHandler file=new FileHandler("HRaccounts.txt");

    public HR(String HRUSername, String HRpw, String Name) {
        this.HRUSername = HRUSername;
        this.HRpw = HRpw;
        this.Name = Name;
    }

    public String getHRUSername() {
        return HRUSername;
    }

    public void setHRUSername(String HRUSername) {
        this.HRUSername = HRUSername;
    }

    public String getHRpw() {
        return HRpw;
    }

    public void setHRpw(String HRpw) {
        this.HRpw = HRpw;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public boolean addHR(){
        
        if(!file.create_NewFile()){
            String record = Name + ","+ HRUSername +"," + HRpw;
            return file.writeFile(record);
        }
        return false;
    }
    
}
