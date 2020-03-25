import java.util.Date;
public class Employee
{

    private String employeeId ;
    private String FirstName;
    private String LastName;
    private String Gender ;
    private Date HiredDate;
    private int Salary;

        //Setter

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setHiredDate(Date hiredDate) {
        HiredDate = hiredDate;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    //Getter

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        return Gender;
    }

    public Date getHiredDate() {
        return HiredDate;
    }

    public int getSalary() {
        return Salary;
    }




}
