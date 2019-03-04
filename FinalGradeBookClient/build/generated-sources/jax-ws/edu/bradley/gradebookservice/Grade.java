
package edu.bradley.gradebookservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignmentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grade", propOrder = {
    "assignmentID",
    "score"
})
public class Grade {

    protected int assignmentID;
    protected int score;

    /**
     * Gets the value of the assignmentID property.
     * 
     */
    public int getAssignmentID() {
        return assignmentID;
    }

    /**
     * Sets the value of the assignmentID property.
     * 
     */
    public void setAssignmentID(int value) {
        this.assignmentID = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

}
