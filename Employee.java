public class Employee{
    String emp_name="Ritul";
     String emp_id="01fe22bca126";
    public void displaydetails(){
        System.out.println("Name:"+emp_name);
        System.out.println("Employee id:"+emp_id);
    }
    public static void main(String[] args) {
       Employee e=new Employee();
        e.displaydetails();
    } 

}