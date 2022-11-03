package Samples.JDK8.Streams;

public class Employee {
    private long empId;
    private String name;
    private String deptName;

    public Employee(long empId, String name, String deptName) {
        this.empId = empId;
        this.name = name;
        this.deptName = deptName;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
