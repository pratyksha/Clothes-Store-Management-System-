import java.util.*;
import java.io.*;
class write_emp
{
    String filename,n,ph,sal;
    boolean append;
    //"darzee_emp_add.txt",true,name,phone,salary)
    public  void filewriting(String filename,boolean append,String n,String ph,String sal)throws IOException
    {
        FileWriter fw=new FileWriter(filename+".txt",append);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println("NAME: "+n);
        pw.println("PHONE: "+ph);
        pw.println("SALARY: "+sal);
        pw.close();
        bw.close();
        fw.close();
    }
       public void readingfile(String filename)throws IOException
    {
        String txt;
        FileReader f=new FileReader(filename);
        BufferedReader b=new BufferedReader(f);
        while((txt=b.readLine())!=null)
        {
            System.out.println(txt);
        }
        b.close();
        f.close();
    }
}
