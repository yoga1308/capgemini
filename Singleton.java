class Employee
{
    private static Employee e =new Employee();
    public static Employee getEmployee()
    {
        return e; 
    }
}
public class Singleton{

     public static void main(String []args){
         Employee e = Employee.getEmployee();
         Employee e1 = Employee.getEmployee();
        System.out.println(e+" "+e1);
     }
}