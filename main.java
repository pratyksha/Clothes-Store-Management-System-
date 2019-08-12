import java.util.*;
import java.io.*;
class main
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        clothes obj=new clothes(); 
        write_emp we= new write_emp();
        bill ob= new bill();
        Calendar zx=Calendar.getInstance();
        int day; int month;int year;
        String st_pass="password"// replace password
        System.out.println("Date    " +(zx.get(Calendar.DATE))+"/"+((zx.get(Calendar.MONTH))+1)+"/"+(zx.get(Calendar.YEAR)));
        System.out.println("Time    " +((zx.get(Calendar.HOUR)))+":"+(zx.get(Calendar.MINUTE))+":"+(zx.get(Calendar.SECOND)));
        System.out.println();
        System.out.println();
        System.out.println("**************************************************welcome**********************************************************************************");
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("                                        WELCOME TO THE ITALIAN DARZEE ");
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("*******************************************************************************************************************************************");
        System.out.println();
        System.out.println();
        int o= 1;
        while(o!=0)
        {
          System.out.println("Enter 1: LOGIN AS STORE MANAGER");
          System.out.println("Enter 2: LOGIN AS A CUSTOMER");
          System.out.println("Enter 3: To Exit");
          System.out.println(); 
          System.out.println("Enter your choice");
          int c =sc.nextInt();
          System.out.println();
          switch(c)
          {
            case 1:
            {
                System.out.println("Enter the password to access store details");
                String pd=sc.next();
                if(pd.equals(st_pass))
                {
                     System.out.println("Enter 1: To add new employee's details");
                     System.out.println("Enter 2: To print employee details");
                     System.out.println(); 
                     System.out.println("Enter your choice");
                     int ch =sc.nextInt();
                     System.out.println();
                     switch(ch)
                     {
                         case 1:
                         {
                           System.out.println("Enter the employee's name");
                           String name=sc.next();
                           System.out.println("Enter the phone number ");
                           String phone=sc.next();
                           System.out.println("Enter the salary ");
                           String salary=sc.next();
                           we.filewriting("darzee_emp",true,name,phone,salary);
                           break;                           
                         }
                         case 2:
                         {
                           we.readingfile("darzee_emp.txt");
                           break;                           
                         }
                    }
                }
                else
                {
                    System.out.println("INCORRECT PASSWORD!!");
                    break;
                }
            }
            break;
            case 2: 
            {
                obj.cloth();                
            }
            break;
            case 3:
            {
                System.out.println("THANK YOU...VISIT AGAIN");
                System.exit(1);
            }
            break;
            default:
            {
                System.out.println("WRONG INPUT!!");
            }

            }
        }
    }
}

