/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bradley.edu.gradebook;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author auskov
 */
public class Student {

    private int studentID;
    private String fname;
    private String lname;
    private ArrayList<Grade> grades;

 

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public Student() {
        studentID=-1;
        fname="";
        lname="";
        grades=new ArrayList<Grade>();
    }

    public Student(int studentID, String fname, String lname) {
        this.studentID = studentID;
        this.fname = fname;
        this.lname = lname;
        this.grades=new ArrayList<Grade>();
    }
    
       public ArrayList<Grade> getGrades() {
        return grades;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }


    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public void addGrade(int assignmentID,int score){
        this.addGrade(new Grade(assignmentID, score));
    }

    public Grade getGrade(int assignmentID){
        for (Grade g:grades){
            if (g.getAssignmentID()==assignmentID)
                return g;
        }
        return null;

    }

    public Course setFname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
