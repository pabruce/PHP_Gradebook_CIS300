/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bradley.GradeBookService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import bradley.edu.gradebook.*;
import java.util.ArrayList;

/**
 *
 * @author bruce
 */
@WebService(serviceName = "GradeBookService")
@Stateless()
public class GradeBookService {

     Course co;
     Assignment as;
     Student stu;

    public GradeBookService() {
       
        co = new Course();
        co.addAssignment(1, "project1", 100);
        co.addAssignment(2, "project2", 200);
        co.addAssignment(3, "project3", 300);

        co.addStudent(5551,"fname1", "lname1");
        co.addStudent(5552,"fname2", "lname2");
        co.addStudent(5553,"fname3", "lname3");

        co.getStudent(5551).addGrade(2, 55);
        co.getStudent(5551).addGrade(3, 155);
        co.getStudent(5551).addGrade(1, 255);
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCourse")
    public Course getCourse() {
        //TODO write your implementation code here:
        return co;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAssignment")
    public ArrayList getAssignment() {
        //TODO write your implementation code here:
        return co.getAssignments();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getStudent")
    public ArrayList getStudent() {
        //TODO write your implementation code here:
        return co.getStudents();
    }
}
