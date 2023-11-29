import java.util.Scanner;
import java.util.*;
class librarynew{
    public void student(int c){
        ArrayList<ArrayList<Integer>> s=new ArrayList<>();
        s.add(new ArrayList<>());
        s.add(new ArrayList<>());
        
        s.get(0).add(101);  //person 1
        s.get(0).add(123);
        s.get(1).add(201);  //person 2
        s.get(1).add(123);
        Scanner input=new Scanner(System.in);
        switch(c){
            case 1: //Students Login 
                int ch=0;
                System.out.println("\t\t\tStudents Login Page ");
                System.out.println("Enter Your Username : ");
                int stduser=input.nextInt();
                System.out.println("Enter Your Password : ");
                int stdpass=input.nextInt();
                for(int i=0;i<s.size();i++){
                    for(int j=0;j<s.size();j++){
                    if(s.get(i).get(j)==stduser){
                        if(s.get(i).get(1)==stdpass){
                            ch=1;
                            break;
                        }
                        else
                            ch=0;
                        }
                    }
                }
                if(ch==1)
                    System.out.println("Login successfully");
               else 
                    System.out.println("Invalid Username Or Password");
                break;
            case 2:     //Students Sign Up
                int nch=0;
                System.out.println("\t\t\tStudents SignUp Page ");
                System.out.println("Enter The New Username : ");
                int nstduser=input.nextInt();
                System.out.println("Enter The New Password : ");
                int nstdpass=input.nextInt();
                for(int i=0;i<s.size();i++){
                    for(int j=0;j<s.size();j++){
                    if(s.get(i).get(j)==nstduser){
                        if(s.get(i).get(1)==nstdpass){
                            nch=1;
                            break;
                        }
                        else
                            nch=0;
                        }
                    }
                }
                if(nch==1)
                    System.out.println("Already Exists...");
               else{
                    s.add(new ArrayList<>());
                    int count=s.size();
                    count=count-1;
                    System.out.println("Count : "+count);
                    s.get(count).add(nstduser);
                    s.get(count).add(nstdpass);
                    System.out.println("SUccessfully Adding Students ");
                    System.out.println("Display All Students Details ..."+s);
                }
                break;
            default:
                System.out.println("Please Enter The Valid Student Choice ...");
                break;
        }
    }

    public void books(){
        System.out.println("Books Available In Your Library...");
        System.out.println("1.Programming in C");
        System.out.println("2.Object Oriented Programming in C++");
        System.out.println("3.Programming in java ");
        System.out.println("4.C#.Net FrameWOrk");
        System.out.println("5.Web Technology");
        System.out.println("6.Relational Database Management System ");
    }

    public void librarian(){
        Scanner input=new Scanner(System.in);
        int oldname=001;
        int oldpass=225;
        System.out.println("\t\t\tLibrarian Login Page");
        System.out.println("Enter The Librarian Username : ");
        int newname=input.nextInt();
        System.out.println("Enter The Librarian Password : ");
        int newpass=input.nextInt();
        if(oldname==newname)
            if(oldpass==newpass)
                System.out.println("Librarian Login Successfully");
            else
                System.out.println("Invalid Librarian Password");
        
        else
            System.out.println("Invalid Username ...");
        
    }
    public static void main(String args[]){
        librarynew s=new librarynew();
        Scanner input=new Scanner(System.in);
        System.out.println("\n1.Students 2.Books 3.Librarian");
        System.out.println("\nTHe Choice Is : ");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("The Student is Login/Sign In (1 or 2) : ");
                int stdin=input.nextInt();
                s.student(stdin);
                break;
            case 2:
                s.books();
                break;
            case 3:
                s.librarian();
                break;
            default:
                System.out.println("Please Enter The Valid Choice ...");
                break;
        }
    }
}