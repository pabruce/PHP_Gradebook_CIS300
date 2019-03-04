/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgradebookclient;
import edu.bradley.gradebookservice.*;
import java.util.*;

/**
 *
 * @author bruce
 */
public class FinalGradeBookClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       Course co = getCourse();
        
       List<Assignment> assign = co.getAssignments();
       
       Assignment as1 = assign.get(0);
       Assignment as2 = assign.get(1);
       Assignment as3 = assign.get(2);
        
       List<Student> stu = co.getStudents();
       
       Student st1 = stu.get(0);
       Student st2 = stu.get(1);
       Student st3 = stu.get(2);
       
       System.out.println("Assignments");
        
       System.out.println("ID :" + as1.getId());
       System.out.println("Description :" + as1.getDescription());
       System.out.println("Max Score :" + as1.getMaxScore());
       System.out.println("ID :" + as2.getId());
       System.out.println("Description :" + as2.getDescription());
       System.out.println("Max Score :" + as2.getMaxScore());
       System.out.println("ID :" + as3.getId());
       System.out.println("Description :" + as3.getDescription());
       System.out.println("Max Score :" + as3.getMaxScore());
       System.out.println("-------------------------------------");
       
       System.out.println("Students");
       
       System.out.println("ID : " + st1.getStudentID());
       System.out.println("First Name : " + st1.getFname());
       System.out.println("Last Name : " + st1.getLname());
       System.out.println("Grades : " + st1.getGrades());
       
       System.out.println("ID : " + st2.getStudentID());
       System.out.println("First Name : " + st2.getFname());
       System.out.println("Last Name : " + st2.getLname());
       System.out.println("Grades : " + st2.getGrades());
       
       System.out.println("ID : " + st3.getStudentID());
       System.out.println("First Name : " + st3.getFname());
       System.out.println("Last Name : " + st3.getLname());
       System.out.println("Grades : " + st3.getGrades());
    }

    private static java.util.List<java.lang.Object> getAssignment() {
        edu.bradley.gradebookservice.GradeBookService_Service service = new edu.bradley.gradebookservice.GradeBookService_Service();
        edu.bradley.gradebookservice.GradeBookService port = service.getGradeBookServicePort();
        return port.getAssignment();
    }

    private static java.util.List<java.lang.Object> getStudent() {
        edu.bradley.gradebookservice.GradeBookService_Service service = new edu.bradley.gradebookservice.GradeBookService_Service();
        edu.bradley.gradebookservice.GradeBookService port = service.getGradeBookServicePort();
        return port.getStudent();
    }

    private static Course getCourse() {
        edu.bradley.gradebookservice.GradeBookService_Service service = new edu.bradley.gradebookservice.GradeBookService_Service();
        edu.bradley.gradebookservice.GradeBookService port = service.getGradeBookServicePort();
        return port.getCourse();
    }
    
    
    
}
