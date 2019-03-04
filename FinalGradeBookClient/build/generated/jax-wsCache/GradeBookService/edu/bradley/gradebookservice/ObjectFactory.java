
package edu.bradley.gradebookservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.bradley.gradebookservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStudentResponse_QNAME = new QName("http://GradeBookService.bradley.edu/", "getStudentResponse");
    private final static QName _GetCourseResponse_QNAME = new QName("http://GradeBookService.bradley.edu/", "getCourseResponse");
    private final static QName _GetAssignmentResponse_QNAME = new QName("http://GradeBookService.bradley.edu/", "getAssignmentResponse");
    private final static QName _GetCourse_QNAME = new QName("http://GradeBookService.bradley.edu/", "getCourse");
    private final static QName _GetAssignment_QNAME = new QName("http://GradeBookService.bradley.edu/", "getAssignment");
    private final static QName _GetStudent_QNAME = new QName("http://GradeBookService.bradley.edu/", "getStudent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.bradley.gradebookservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link GetAssignmentResponse }
     * 
     */
    public GetAssignmentResponse createGetAssignmentResponse() {
        return new GetAssignmentResponse();
    }

    /**
     * Create an instance of {@link GetCourse }
     * 
     */
    public GetCourse createGetCourse() {
        return new GetCourse();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetAssignment }
     * 
     */
    public GetAssignment createGetAssignment() {
        return new GetAssignment();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Assignment }
     * 
     */
    public Assignment createAssignment() {
        return new Assignment();
    }

    /**
     * Create an instance of {@link Grade }
     * 
     */
    public Grade createGrade() {
        return new Grade();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GradeBookService.bradley.edu/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GradeBookService.bradley.edu/", name = "getCourseResponse")
    public JAXBElement<GetCourseResponse> createGetCourseResponse(GetCourseResponse value) {
        return new JAXBElement<GetCourseResponse>(_GetCourseResponse_QNAME, GetCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssignmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GradeBookService.bradley.edu/", name = "getAssignmentResponse")
    public JAXBElement<GetAssignmentResponse> createGetAssignmentResponse(GetAssignmentResponse value) {
        return new JAXBElement<GetAssignmentResponse>(_GetAssignmentResponse_QNAME, GetAssignmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GradeBookService.bradley.edu/", name = "getCourse")
    public JAXBElement<GetCourse> createGetCourse(GetCourse value) {
        return new JAXBElement<GetCourse>(_GetCourse_QNAME, GetCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GradeBookService.bradley.edu/", name = "getAssignment")
    public JAXBElement<GetAssignment> createGetAssignment(GetAssignment value) {
        return new JAXBElement<GetAssignment>(_GetAssignment_QNAME, GetAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GradeBookService.bradley.edu/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

}
