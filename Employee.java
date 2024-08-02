import java.util.*;
class Employee
{
    public int Emp_id;
    public String Emp_name;
    public double Emp_sal;
    public String Emp_add;

    public void setdata(int id,String name,double sal,String add)
    {
        Emp_id = id;
        Emp_name = name;
        Emp_sal = sal;
        Emp_add = add;
    }

    /*public void setdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee id : ");
        Emp_id = sc.nextInt();
        System.out.println("Employee Name : ");
        Emp_name = sc.next();
        System.out.println("Employee Salary : ");
        Emp_sal = sc.nextInt();
        System.out.println("Employee Address : ");
        Emp_add = sc.next();
    }*/

    public void show()
    {      
        System.out.println("Employee id : "+Emp_id);
        System.out.println("Employee Name : "+Emp_name);
        System.out.println("Employee Salary : "+Emp_sal);
        System.out.println("Employee Address : "+Emp_add);
    }
}
class Main
{
    public static void main(String[]args)
    {
       Employee ab = new Employee();
      /* for(int i=1;i<=5;++i)
       {
          ab.setdata();          
       }*/
       Scanner kb = new Scanner(System.in);
       System.out.println("Enter Employee id :  ");
       int c = kb.nextInt();
       switch(c)
       {
            case 101 :
                    ab.setdata(101,"Ankita",1000,"Ich");
                    ab.show();
                    break;
            case 102 :
                    ab.setdata(102,"Sakshi",2000,"Sangali");
                    ab.show();
                    break;        
            case 103 :
                    ab.setdata(103,"Eisha",3000,"Kagal");
                    ab.show();
                    break;
            case 104 :
                    ab.setdata(104,"Vaishanavi",4000,"Pune");
                    ab.show();
                    break;
            case 105 :
                    ab.setdata(105,"Revati",5000,"Mumbai");
                    ab.show();
                    break;   
            default:
                    System.out.println("Invalid choice");                      

       } 
    }
}