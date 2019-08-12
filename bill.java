import java.util.*;
import java.io.*;
class bill
{
    String filename;boolean append;String name;double total;
    public void print(String filename,double total)throws IOException
    {
        Calendar zx=Calendar.getInstance();
        int day; int month;int year;
        System.out.println("Date    " +(zx.get(Calendar.DATE))+"/"+((zx.get(Calendar.MONTH))+1)+"/"+(zx.get(Calendar.YEAR)));
        System.out.println("Time    " +((zx.get(Calendar.HOUR)))+":"+(zx.get(Calendar.MINUTE))+":"+(zx.get(Calendar.SECOND)));
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************************************************************************************************");
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("                                                       ITALIAN DARZEE ");
        System.out.println("___________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("*******************************************************************************************************************************************");
        System.out.println();
        System.out.println(); 
        String txt;
        FileReader f=new FileReader(filename+".txt");
        BufferedReader b=new BufferedReader(f);
        while((txt=b.readLine())!=null)
        {
            System.out.println(txt);
        }
        b.close();
        f.close();
        System.out.println();
        System.out.println("*******************************************************************************************************************************************");
        System.out.println("TOTAL PAYABLE AMOUNT = "+total);
        System.out.println();
        System.out.println();
        System.out.println("CUSTOMER CARE PHONE NUMBER : 080-5242015");
        System.out.println("           NO CASH REFUNDS ");
        System.out.println("TERMS AND CONDITION APPLY");
        System.out.println("                                              # THANK YOU FOR SHOPPING WITH US # ");
    }
    public  void filewriting(String filename,boolean append,String name)throws IOException
    {
        FileWriter fw=new FileWriter(filename+".txt",append);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);        
        pw.println("ITEM NAME: "+name);
        pw.close();
        bw.close();
        fw.close();
    }
}
