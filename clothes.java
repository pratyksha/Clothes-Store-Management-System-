import java.util.*;
import java.io.*;
class clothes
{
    bill ob= new bill();
    int n;
    public void cloth()throws IOException
    {
        String col="",st;
        double total1=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("HAVE A PLEASANT TIME SHOPPING WITH US!!");
        System.out.println("ENTER 1 TO SHOP FROM MEN'S SECTION");
        System.out.println("ENTER 2 TO SHOP FROM WOMEN'S SECTION");
        System.out.println("ENTER 3 TO PRINT RECEIPT");
        System.out.println("ENTER 4 TO EXIT"); 
        System.out.println("ENTER YOUR CHOICE");    
        int c=sc.nextInt();
        while(c!=4){
           switch(c)
           {
            case 1:
            {
                System.out.println("WELCOME TO MENS SECTION");
                System.out.println("ENTER 1 FOR DENIMS");
                System.out.println("ENTER 2 FOR T-SHIRTS");
                System.out.println("ENTER 3 FOR SHIRTS");
                System.out.println("ENTER 4 FOR BLAZER");
                System.out.println("ENTER 5 FOR TROUSERS");                    
                System.out.println("ENTER 6 TO EXIT MENS SECTION");
                System.out.println("ENTER YOUR CHOICE");    
                int ch=sc.nextInt();                
                while(ch!=6){
                    if(ch==1){
                        System.out.println("WELCOME TO DENIM SECTION");
                        System.out.println("ENTER 1 FOR CLASSIC STONEWASHED");
                        System.out.println("ENTER 2 FOR SELVEDGE");
                        System.out.println("ENTER 3 FOR THIN AND STRETCHY");
                        System.out.println("ENTER 4 FOR WAXED");
                        System.out.println("ENTER 5 TO EXIT DENIM SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=5)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT");
                            n=sc.nextInt();
                            if(d==1){
                                total1+=4000*n;
                                st="Denim, CLASSIC STONEWASHED, "+col;
                                System.out.println("A pair of straight-leg, lightly-washed jeans. It is reliable, long-lasting and versatile.");
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2){
                               total1+=5000*n;
                               st="Denim, SELVEDGE, "+col;
                               System.out.println("Selvedge denim tends to be considerably thicker and stiffer than an ordinary pair of jeans.");
                               ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=4500*n;
                                st="Denim,THIN AND STRETCHY, "+col;
                                System.out.println("The stretchy, wafer-thin jean is considerably more modern and even elegant.");
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=6000*n;
                                st="Denim, WAXED, "+col;
                                System.out.println("Wax coating adds a jet-black finish to it,retaining their classic appeal"); 
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR CLASSIC STONEWASHED");
                            System.out.println("ENTER 2 FOR SELVEDGE");
                            System.out.println("ENTER 3 FOR THIN AND STRETCHY");
                            System.out.println("ENTER 4 FOR WAXED");
                            System.out.println("ENTER 5 TO EXIT DENIM SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==2)
                    {
                        System.out.println("WELCOME TO T-SHIRT SECTION");
                        System.out.println("ENTER 1 FOR Round Neck");
                        System.out.println("ENTER 2 FOR V-Necks");
                        System.out.println("ENTER 3 FOR T-Shirt Fit");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=4)
                        {
                            int t=0;
                            System.out.println("ENTER 1 FOR BASIC,is one uniform color or pattern throughout"); 
                            System.out.println("ENTER 2 FOR Graphic,is one that has an image printed onto the fabric");
                            System.out.println("ENTER 3 FOR Embellished,have been decorated with a medium other than ink");
                            t=sc.nextInt();
                            if(t==1)
                                col ="BASIC";
                            else if(t==2)
                                col="GRAPHICS";
                            else if(t==3)
                                col="EMBELLISHED";
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                             n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=1400*n;
                                 st="T-SHIRT, ROUND NECK, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=1500*n;
                                 st="T-SHIRT, V-NECK, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=1600*n;
                                st="T-SHIRT, T-SHIRT fit, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR Round Neck");
                            System.out.println("ENTER 2 FOR V-Necks");
                            System.out.println("ENTER 3 FOR T-Shirt Fit");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==3)
                    {
                        System.out.println("WELCOME TO SHIRT SECTION");
                        System.out.println("ENTER 1 FOR Button-Down Shirts");
                        System.out.println("ENTER 2 FOR Dress Shirts");
                        System.out.println("ENTER 3 FOR Jerseys");
                        System.out.println("ENTER 4 FOR Polo Shirts");
                        System.out.println("ENTER 5 FOR Sweatshirts");
                        System.out.println("ENTER 6 TO EXIT SHIRT SECTION ");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=6)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=2600*n;
                                 st=" SHIRTS, Button-Down Shirts, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=3200*n;
                                 st="SHIRTS, Dress Shirts, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=1400*n;
                                 st="SHIRTS, Jerseys, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=3000*n;
                                 st="SHIRTS, Polo Shirts, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==5)
                            {
                                total1+=5500*n;
                                st="SHIRTS, Sweatshirts, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR Button-Down Shirts");
                            System.out.println("ENTER 2 FOR Dress Shirts");
                            System.out.println("ENTER 3 FOR Jerseys");
                            System.out.println("ENTER 4 FOR Polo Shirts");
                            System.out.println("ENTER 5 FOR Sweatshirts");
                            System.out.println("ENTER 6 TO EXIT SHIRT SECTION ");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==4)
                    {
                        System.out.println("WELCOME TO BLAZER SECTION");
                        System.out.println("ENTER 1 FOR SINGLE BREAST BLAZER WITH ONE BUTTON");
                        System.out.println("ENTER 2 FOR SINGLE BREAST BLAZER WITH TWO BUTTONS");
                        System.out.println("ENTER 3 FOR SINGLE BREAST BLAZER WITH THREE BUTTONS");
                        System.out.println("ENTER 4 FOR DOUBLE BREAST BLAZER");
                        System.out.println("ENTER 5 FOR NEHRU JACKET");
                        System.out.println("ENTER 6 TO EXIT BLAZER SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=6)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=5000*n;
                                st="BLAZER, SINGLE BREAST(1 BUTTON), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=5200*n;
                                st="BLAZER, SINGLE BREAST(2 BUTTON), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=5300*n;
                                st="BLAZER, SINGLE BREAST(3 BUTTON), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=6000*n;
                                st="BLAZER, DOUBLE BREAST, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==5)
                            {
                                total1+=6500*n;
                                st="BLAZER, NEHRU JACKET, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR SINGLE BREAST BLAZER WITH ONE BUTTON");
                            System.out.println("ENTER 2 FOR SINGLE BREAST BLAZER WITH TWO BUTTON");
                            System.out.println("ENTER 3 FOR SINGLE BREAST BLAZER WITH THREE BUTTON");
                            System.out.println("ENTER 4 FOR DOUBLE BREAST BLAZER");
                            System.out.println("ENTER 5 FOR NEHRU JACKET");
                            System.out.println("ENTER 6 TO EXIT BLAZER SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==5)
                    {
                        System.out.println("WELCOME TO TROUSURE SECTION");
                        System.out.println("ENTER 1 FOR FORMAL (FLAT FRONT)");
                        System.out.println("ENTER 2 FOR FORMAL (PLEATED) ");
                        System.out.println("ENTER 3 FOR INFORMAL (FLAT FRONT)");
                        System.out.println("ENTER 4 FOR INFORMAL (PLEATED)");
                        System.out.println("ENTER 5 TO EXIT TROUSURE SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=5)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=2000*n;
                                st="TROUSURE, FORMAL (FLAT FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=2400*n;
                                st="TROUSURE, FORMAL (PLEATED FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=2600*n;
                                st="TROUSURE, INFORMAL (FLAT FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=3000*n;
                                st="TROUSURE, INFORMAL (PLEATED FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR FORMAL (FLAT FRONT)");
                            System.out.println("ENTER 2 FOR FORMAL (PLEATED) ");
                            System.out.println("ENTER 3 FOR INFORMAL (FLAT FRONT)");
                            System.out.println("ENTER 4 FOR INFORMAL (PLEATED)");
                            System.out.println("ENTER 5 TO EXIT TROUSURE SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else
                    {
                        System.out.println("wrong input!!");
                    }
                    System.out.println("ENTER 1 FOR DENIMS");
                    System.out.println("ENTER 2 FOR T-SHIRTS");
                    System.out.println("ENTER 3 FOR SHIRTS");
                    System.out.println("ENTER 4 FOR BLAZER");
                    System.out.println("ENTER 5 FOR TROUSERS");
                    System.out.println("ENTER 6 TO EXIT MENS SECTION");
                    System.out.println("ENTER YOUR CHOICE");    
                    ch=sc.nextInt();
                }
            }
            break;
            case 2:
            {
                System.out.println("WELCOME TO WOMENS SECTION");
                System.out.println("ENTER 1 FOR DENIMS");
                System.out.println("ENTER 2 FOR T-SHIRTS");
                System.out.println("ENTER 3 FOR SHIRTS");
                System.out.println("ENTER 4 FOR BLAZER");
                System.out.println("ENTER 5 FOR TROUSERS");
                System.out.println("ENTER 6 FOR DRESSES");
                System.out.println("ENTER 7 FOR SKIRTS");  
                System.out.println("ENTER 8 TO EXIT WOMENS SECTION");
                System.out.println("ENTER YOUR CHOICE");    
                int ch=sc.nextInt();
                while(ch!=8){
                    if(ch==1){
                        System.out.println("WELCOME TO DENIM SECTION");
                        System.out.println("ENTER 1 FOR CLASSIC STONEWASHED");
                        System.out.println("ENTER 2 FOR SELVEDGE");
                        System.out.println("ENTER 3 FOR THIN AND STRETCHY");
                        System.out.println("ENTER 4 FOR WAXED");
                        System.out.println("ENTER 5 TO EXIT DENIM SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=5)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT");
                            n=sc.nextInt();
                            if(d==1){
                                total1+=4000*n;
                                st="Denim, CLASSIC STONEWASHED, "+col;
                                System.out.println("A pair of straight-leg, lightly-washed jeans. It is reliable, long-lasting and versatile.");
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2){
                               total1+=5000*n;
                               st="Denim, SELVEDGE, "+col;
                               System.out.println("Selvedge denim tends to be considerably thicker and stiffer than an ordinary pair of jeans.");
                               ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=4500*n;
                                st="Denim,THIN AND STRETCHY, "+col;
                                System.out.println("The stretchy, wafer-thin jean is considerably more modern and even elegant.");
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=6000*n;
                                st="Denim, WAXED, "+col;
                                System.out.println("Wax coating adds a jet-black finis to it,retaining their classic appeal");
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR CLASSIC STONEWASHED");
                            System.out.println("ENTER 2 FOR SELVEDGE");
                            System.out.println("ENTER 3 FOR THIN AND STRETCHY");
                            System.out.println("ENTER 4 FOR WAXED");
                            System.out.println("ENTER 5 TO EXIT DENIM SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==2)
                    {
                        System.out.println("WELCOME TO T-SHIRT SECTION");
                        System.out.println("ENTER 1 FOR Round Neck");
                        System.out.println("ENTER 2 FOR V-Necks");
                        System.out.println("ENTER 3 FOR T-Shirt Fit");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=4)
                        {
                            int t=0;
                            System.out.println("ENTER 1 FOR BASIC,is one uniform color or pattern throughout"); 
                            System.out.println("ENTER 2 FOR Graphic,is one that has an image printed onto the fabric");
                            System.out.println("ENTER 3 FOR Embellished,have been decorated with a medium other than ink");
                            t=sc.nextInt();
                            if(t==1)
                                col ="BASIC";
                            else if(t==2)
                                col="GRAPHICS";
                            else if(t==3)
                                col="EMBELLISHED";
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                             n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=1400*n;
                                 st="T-SHIRT, ROUND NECK, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=1500*n;
                                 st="T-SHIRT, V-NECK, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=1600*n;
                                st="T-SHIRT, T-SHIRT fit, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR Round Neck");
                            System.out.println("ENTER 2 FOR V-Necks");
                            System.out.println("ENTER 3 FOR T-Shirt Fit");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==3)
                    {
                        System.out.println("WELCOME TO SHIRT SECTION");
                        System.out.println("ENTER 1 FOR Button-Down Shirts");
                        System.out.println("ENTER 2 FOR Dress Shirts");
                        System.out.println("ENTER 3 FOR Jerseys");
                        System.out.println("ENTER 4 FOR Polo Shirts");
                        System.out.println("ENTER 5 FOR Sweatshirts");
                        System.out.println("ENTER 6 TO EXIT SHIRT SECTION ");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=6)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=2600*n;
                                 st=" SHIRTS, Button-Down Shirts, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=3200*n;
                                 st="SHIRTS, Dress Shirts, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=1400*n;
                                 st="SHIRTS, Jerseys, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=3000*n;
                                 st="SHIRTS, Polo Shirts, "+col;
                                 ob.filewriting("darzee",true,st);
                            }
                            else if(d==5)
                            {
                                total1+=5500*n;
                                st="SHIRTS, Sweatshirts, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR Button-Down Shirts");
                            System.out.println("ENTER 2 FOR Dress Shirts");
                            System.out.println("ENTER 3 FOR Jerseys");
                            System.out.println("ENTER 4 FOR Polo Shirts");
                            System.out.println("ENTER 5 FOR Sweatshirts");
                            System.out.println("ENTER 6 TO EXIT SHIRT SECTION ");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==4)
                    {
                        System.out.println("WELCOME TO BLAZER SECTION");
                        System.out.println("ENTER 1 FOR SINGLE BREAST BLAZER WITH ONE BUTTON");
                        System.out.println("ENTER 2 FOR SINGLE BREAST BLAZER WITH TWO BUTTON");
                        System.out.println("ENTER 3 FOR SINGLE BREAST BLAZER WITH THREE BUTTON");
                        System.out.println("ENTER 4 FOR DOUBLE BREAST BLAZER");
                        System.out.println("ENTER 5 FOR NEHRU JACKET");
                        System.out.println("ENTER 6 TO EXIT BLAZER SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=6)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=5000*n;
                                st="BLAZER, SINGLE BREAST(1 BUTTON), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=5200*n;
                                st="BLAZER, SINGLE BREAST(2 BUTTON), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=5300*n;
                                st="BLAZER, SINGLE BREAST(3 BUTTON), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=6000*n;
                                st="BLAZER, DOUBLE BREAST, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==5)
                            {
                                total1+=6500*n;
                                st="BLAZER, NEHRU JACKET, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR SINGLE BREAST BLAZER WITH ONE BUTTON");
                            System.out.println("ENTER 2 FOR SINGLE BREAST BLAZER WITH TWO BUTTON");
                            System.out.println("ENTER 3 FOR SINGLE BREAST BLAZER WITH THREE BUTTON");
                            System.out.println("ENTER 4 FOR DOUBLE BREAST BLAZER");
                            System.out.println("ENTER 5 FOR NEHRU JACKET");
                            System.out.println("ENTER 6 TO EXIT BLAZER SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==5)
                    {
                        System.out.println("WELCOME TO TROUSURE SECTION");
                        System.out.println("ENTER 1 FOR FORMAL (FLAT FRONT)");
                        System.out.println("ENTER 2 FOR FORMAL (PLEATED) ");
                        System.out.println("ENTER 3 FOR INFORMAL (FLAT FRONT)");
                        System.out.println("ENTER 4 FOR INFORMAL (PLEATED)");
                        System.out.println("ENTER 5 TO EXIT TROUSURE SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=5)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            if(d==1)
                            {
                                total1+=2000*n;
                                st="TROUSURE, FORMAL (FLAT FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=2400*n;
                                st="TROUSURE, FORMAL (PLEATED FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=2600*n;
                                st="TROUSURE, INFORMAL (FLAT FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=3000*n;
                                st="TROUSURE, INFORMAL (PLEATED FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR FORMAL (FLAT FRONT)");
                            System.out.println("ENTER 2 FOR FORMAL (PLEATED) ");
                            System.out.println("ENTER 3 FOR INFORMAL (FLAT FRONT)");
                            System.out.println("ENTER 4 FOR INFORMAL (PLEATED)");
                            System.out.println("ENTER 5 TO EXIT TROUSURE SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==6)
                    {
                        System.out.println("WELCOME TO DRESS SECTION");
                        System.out.println("ENTER 1 FOR SOLID(MONOCHROME) DRESS");
                        System.out.println("ENTER 2 FOR PRINTED DRESS ");
                        System.out.println("ENTER 3 FOR BROCADE FLARE DRESS");
                        System.out.println("ENTER 4 FOR STRIPED DRESS");
                        System.out.println("ENTER 5 TO EXIT DRESS SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=5)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=5000*n;
                                st="DRESS, SOLID(MONOCHROME) DRESS, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=3400*n;
                                st="DRESS, PRINTED DRESS, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=2800*n;
                                st="DRESS, BROCADE FLARE DRESS, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==4)
                            {
                                total1+=3600*n;
                                st="DRESS, STRIPED DRESS, "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR SOLID(MONOCHROME) DRESS");
                            System.out.println("ENTER 2 FOR PRINTED DRESS ");
                            System.out.println("ENTER 3 FOR BROCADE FLARE DRESS");
                            System.out.println("ENTER 4 FOR STRIPED DRESS");
                            System.out.println("ENTER 5 TO EXIT DRESS SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else if(ch==7)
                    {
                        System.out.println("WELCOME TO SKIRT SECTION");
                        System.out.println("ENTER 1 FOR FORMAL (FLAT FRONT)");
                        System.out.println("ENTER 2 FOR FORMAL (PLEATED) ");
                        System.out.println("ENTER 3 FOR FORMAL (SLIT)");
                        System.out.println("ENTER 4 TO EXIT SKIRT SECTION");
                        System.out.println("ENTER YOUR CHOICE");
                        int d=sc.nextInt();
                        while(d!=4)
                        {
                            System.out.println("ENTER THE COLOUR YOU WANT"); 
                            col =sc.next();
                            System.out.println("ENTER THE QUANTITY YOU WANT"); 
                            n=sc.nextInt();
                            if(d==1)
                            {
                                total1+=2000*n;
                                st="SKIRT, FORMAL (FLAT FRONT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==2)
                            {
                                total1+=2400*n;
                                st="SKIRT, FORMAL (PLEATED), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else if(d==3)
                            {
                                total1+=2600*n;
                                st="SKIRT, INFORMAL (SLIT), "+col;
                                ob.filewriting("darzee",true,st);
                            }
                            else 
                                System.out.println("wrong input");
                            System.out.println("ENTER 1 FOR FORMAL (FLAT FRONT)");
                            System.out.println("ENTER 2 FOR FORMAL (PLEATED) ");
                            System.out.println("ENTER 3 FOR FORMAL (SLIT)");
                            System.out.println("ENTER 4 TO EXIT SKIRT SECTION");
                            System.out.println("ENTER YOUR CHOICE");
                            d=sc.nextInt();
                        }
                    }
                    else
                    {
                        System.out.println("wrong input!!");
                    }
                    System.out.println("ENTER 1 FOR DENIMS");
                    System.out.println("ENTER 2 FOR T-SHIRTS");
                    System.out.println("ENTER 3 FOR SHIRTS");
                    System.out.println("ENTER 4 FOR BLAZER");
                    System.out.println("ENTER 5 FOR TROUSERS");
                    System.out.println("ENTER 6 FOR DRESSES");
                    System.out.println("ENTER 7 FOR SKIRTS");  
                    System.out.println("ENTER 8 TO EXIT WOMENS SECTION");
                    System.out.println("ENTER YOUR CHOICE");    
                    ch=sc.nextInt();
                }                               
            }
            break;        
            case 3:
            {
             ob.print("darzee",total1);          
             break;
            }
         }
         System.out.println("ENTER 1 TO SHOP FROM MEN'S SECTION");
         System.out.println("ENTER 2 TO SHOP FROM WOMEN'S SECTION");
         System.out.println("ENTER 3 TO PRINT RECEIPT");
         System.out.println("ENTER 4 TO EXIT");
         System.out.println("ENTER YOUR CHOICE");    
         c=sc.nextInt();
        }
    }
}



