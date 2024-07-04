package Classes;

public class Employee {
    private String EID;
    private String EName;
    private String Epf;
    private String Department;
    private String Designation;
    
    private FileHandler filesys= new FileHandler("Employees.txt");
    
    public Employee(){
    }

    public Employee(String EID, String EName, String Epf, String Department, String Designation) {
        this.EID = EID;
        this.EName = EName;
        this.Epf = Epf;
        this.Department = Department;
        this.Designation = Designation;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public String getEpf() {
        return Epf;
    }

    public void setEpf(String Epf) {
        this.Epf = Epf;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    
    public boolean addEmployee() {

        if (!filesys.create_NewFile()) {
            String record = EID + "," + EName + "," + Epf + "," + Department + "," + Designation;

            return filesys.writeFile(record);
        }
        return false;

    }
    
    @Override
    public String toString() {
        return  EID + "," + EName + "," + Epf + "," + Department + "," + Designation;
    }

    public FileHandler getFilesys() {
        return filesys;
    }

}
