package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author donchi
 */
public class StudentGrade {

    final double  MIDTERM_PERCENTAGE =0.3; 
    final double FINAL_TERM_PERCENTAGE =0.3;
    final double PROJECT_PERCENTAGE=0.4;
    final String SEMSTER_FALL ="FALL";
    final String SEMSTER_WINTER ="WINTER";
    
    int midTerm=0;
    int finalTerm =0;
    int project =0;
    double finalGrade =0;
    String course =null,facultyName=null;
    Scanner  scan = new Scanner(System.in);
    
    public StudentGrade() {
        options();
    }
    
    public void options(){
        System.out.println("********Welcome to Student Grade Calculator***************");
        System.out.println(" ************* MENU **************");
        System.out.println("Enter option  type( 1=Grade , 2= Display Courses , 3=Faculties Information ) >>>");
             int options = scan.nextInt();
        switch (options) {
            case 1:
                System.out.println("Totat Grade =: " + grade());
                break;
            case 2:
                System.out.print("Enter Semster name e.g ( FALL , WINTER )  =:  ");
                course = scan.next();
                displayCourses(course);
                break;
            case 3:
                System.out.println("Enter the Faculty Name: ");
                facultyName = scan.next();
                displayFaculty(facultyName);
                break;
            default:
                System.out.println("********Invalid option1*********");
                break;
        }
    }
    
    
    public double grade(){
    
        System.out.println("******Enter Student Grade*********");
        System.out.print("******Enter MidTerm Grade =:  ");
        midTerm = scan.nextInt();
        System.out.print("******Enter Final Term Grade =:  ");
        finalTerm = scan.nextInt();
        System.out.print("******Enter Project Grade =:  ");
        project =scan.nextInt();
        
        finalGrade =(midTerm * MIDTERM_PERCENTAGE) + (finalTerm * FINAL_TERM_PERCENTAGE) + (project * PROJECT_PERCENTAGE);
        return finalGrade;
    }
    public void displayCourses(String semster){
          
           if(semster.equalsIgnoreCase(SEMSTER_FALL))
           {
            
                 System.out.println("********** Fall Courses Information************");
            System.out.println(" 1: CPAN202 \n 2: CPAN204  ");
            System.out.println("****************End*********************");

           }
           else if(semster.equalsIgnoreCase(SEMSTER_WINTER))
           {
                      System.out.println("********** Fall Courses Information************");
            System.out.println(" 1: CPAN252 \n 2: CPAN253  ");
            System.out.println("****************End*********************");

           }
           else{
                 System.out.println("********Invalid Semeter*********");
           }
           
       
    }
    public void displayFaculty(String name)
    {
        String phone_Number =null , email=null,office_No=null;
        if(name.equalsIgnoreCase("wajiha")){
            phone_Number ="+1(647) 518-0046";
            email ="wajiha1512@gmail.com";
            office_No="NX306";
            System.out.println("**********Faculty Information************");
            System.out.println(" Phone Number =:  "+phone_Number  +" \n email =:  "+email  + " \n office no =: "+office_No);
            System.out.println("*************************************");
        }
        else  if(name.equalsIgnoreCase("Yasemin")){
            phone_Number ="416.675.6622 ext. 4422";
            email ="yasemin.fanaeian@humber.ca";
            office_No="NX301";
            System.out.println("**********Faculty Information************");
            System.out.println(" Phone Number =:  "+phone_Number  +" \n email =:  "+email  + " \n office no =: "+office_No);
            System.out.println("*************************************");
        }
        else  if(name.equalsIgnoreCase("inam")){
            phone_Number ="+1(647) 518-0045";
            email ="inam@gmail.com";
            office_No="NX361";
            System.out.println("**********Faculty Information************");
            System.out.println(" Phone Number =:  "+phone_Number  +" \n email =:  "+email  + " \n office no =: "+office_No +"\n");
            System.out.println("*************************************");
        }else{
             System.out.println("********Invalid faculty name *********");
        }
    }
    
    
    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();
    }
}
