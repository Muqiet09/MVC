import javax.swing.*;

public class MVCpattern
{
    public static void main(String[] args) {


        Employee model  = retriveEmployeeFromDatabase();

        //Create a view : to write student details on console
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model,view);

        controller.updateView();

        //update model data
        //controller.setEmployeeName("John","Ahlia");

        controller.updateView();
    }



    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setEmployeeId("11111");
        Employee.setFirstName("Abdul");
        Employee.setLastName("Muntaqim");
        Employee.setGender("Male");
        Employee.setSalary(100000);
        return Employee;

    }
}


