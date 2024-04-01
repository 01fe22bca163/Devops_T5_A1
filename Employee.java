public class Employee extends DevopsEngineer{
    String emp_name="Swapna";
     String emp_id="01fe22bca163";
    public void displaydetails(){
        System.out.println("Name:"+emp_name);
        System.out.println("Employee id:"+emp_id);
    }
    public static void main(String[] args) {
       
        float salary=100000;
        Employee e=new Employee();
        e.displaydetails();
        e.displaySalary(salary);
    }

}