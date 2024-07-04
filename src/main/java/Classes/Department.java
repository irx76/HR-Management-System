package Classes;

public class Department {
    private String departmentname;
    private String designationname;

    FileHandler fileSystem = new FileHandler("department.txt");
    
    public Department(String departname, String designname) {
        this.departmentname = departname;
        this.designationname = designname;
    }
    
    public String getDepartname() {
        return departmentname;
    }

    public void setDepartname(String departname) {
        this.departmentname = departname;
    }

    public String getDesignname() {
        return designationname;
    }

    public void setDesignname(String designname) {
        this.designationname = designname;
    }
    
    public boolean addDepartment() {
         String record;
         
        if(!fileSystem.create_NewFile())
            {
                String record1 = departmentname;
                String record2 =" "+designationname;
                record =record1+"-"+record2;
                System.out.println(record);
                return fileSystem.writeFile(record);
            }
        return false;
}
}
