import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Date;

import static javafx.application.Application.launch;

public class EmployeeView extends Employee {

    public void printEmployeeView(String EmployeeId,String LastName,String FirstName,String Gender,int Salary,Date HiredDate)
    {
        System.out.println("Employee ID: "+getEmployeeId());
        System.out.println("Name: " + getFirstName() +" "+getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Hired Date :"+getHiredDate());
        System.out.println("Salary :"+getSalary());
    }

}
