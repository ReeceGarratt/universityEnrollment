package com.bbd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {

    Student s0 = null;
    Student s1 = null;
    Student s2 = null;
    Student s3 = null;
    Student s4 = null;

    @BeforeEach
    public void instantiateTestClasses(){
        s0 = new Student("Reece", 10001, "25-08-93");
        s1 = new Student("Nic", 20002, "26-09-94");
        s2 = new Student("Q", 30003, "27-10-95");
        s3 = new Student("Matthew", 40004, "01-01-01");
        s4 = new Student("Justin", 50005, "02-02-02");
    }
    @Test
    public void studentClassTest(){
        //names
        assertEquals("Reece", s0.getName());
        assertEquals("Nic", s1.getName());
        assertEquals("Q", s2.getName());
        assertEquals("Matthew", s3.getName());
        assertEquals("Justin", s4.getName());

        //DoB
        assertEquals("25-08-93", s0.getDoB());
        assertEquals("26-09-94", s1.getDoB());
        assertEquals("27-10-95", s2.getDoB());
        assertEquals("01-01-01", s3.getDoB());
        assertEquals("02-02-02", s4.getDoB());

        //StudentNumbers
        assertEquals(10001, s0.getStudentNumber());
        assertEquals(20002, s1.getStudentNumber());
        assertEquals(30003, s2.getStudentNumber());
        assertEquals(40004, s3.getStudentNumber());
        assertEquals(50005, s4.getStudentNumber());

        //toString
        assertEquals("Reece 10001", s0.toString());
        assertEquals("Nic 20002", s1.toString());
        assertEquals("Q 30003", s2.toString());
        assertEquals("Matthew 40004", s3.toString());
        assertEquals("Justin 50005", s4.toString());

    }
    @Test
    public void courseClassTest(){
        Course c0 = new Course("WSOA4001", 4);
        Course c1 = new Course("ELEN1001", 100);

        // courseName
        assertEquals("WSOA4001", c0.getName());
        assertEquals("ELEN1001", c1.getName());

        //number of courses
        assertEquals(2, c0.getNumberOfCourses());
        assertEquals(2, c1.getNumberOfCourses());

        Course c2 = new Course("ELEN2004", 100);

        assertEquals(3, c0.getNumberOfCourses());
        assertEquals(3, c1.getNumberOfCourses());
        assertEquals(3, c2.getNumberOfCourses());

        // enroll
        assertTrue(c0.enrollStudent(s0));
        assertTrue(c0.enrollStudent(s1));
        assertTrue(c0.enrollStudent(s2));
        assertTrue(c0.enrollStudent(s3));
        assertFalse(c0.enrollStudent(s4));

        // print enrolled students
        assertEquals("Reece 10001, Nic 20002, Q 30003, Matthew 40004, ", c0.printCurrentEnrolled());

        // unenroll
        assertFalse(c0.unenrollStudent(s4));

        assertTrue(c0.unenrollStudent(s0));
        assertTrue(c0.unenrollStudent(s1));
        assertTrue(c0.unenrollStudent(s2));
        assertTrue(c0.unenrollStudent(s3));
    }

    @AfterEach
    public void deleteTestClasses() {
        s0 = null;
        s1 = null;
        s2 = null;
        s3 = null;
        s4 = null;
    }


}
