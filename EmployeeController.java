import java.util.Date;
public class EmployeeController
{
    private Employee model;
    private EmployeeView view ;


    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model ;
        this.view = view ;
    }

    //Getter
    public String getEmployeeFirstName()
    {
        return model.getFirstName();
    }
    public String getEmployeeId(){return model.getEmployeeId();}
    public String getEmployeeLastName()
    {
        return model.getLastName();
    }
    public String getEmployeeGender()
    {
        return model.getGender();
    }
    public Date getEmployeeHiredDate()
    {
       return  model.getHiredDate();
    }
    public int getEmployeeSalary()
    {
        return model.getSalary();
    }

    //Setter

    public void setEmployeeName(String FirstName,String LastName)
    {
        model.setFirstName(FirstName);
        model.setLastName(LastName);
    }
    public void setEmployeeGender(String Gender)
    {
        model.setGender(Gender);
    }

    public void setEmployeeHiredDate(Date HiredDate)
    {
        model.setHiredDate(HiredDate);
    }
    public void setEmployeeSalary(int Salary)
    {
        model.setSalary(Salary);
    }
    //Updating View
    public void updateView(){
        view.printEmployeeView(model.getEmployeeId(),model.getLastName(),model.getFirstName(),model.getGender(),model.getSalary(),model.getHiredDate());
    }
}
