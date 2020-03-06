
/*

Stephen McIntyre
g00325469@gmit.ie
06/03/2020

Testing each possible case of incorrect data being entered into employee database

 */


package ie.gmit;

import org.junit.jupiter.api.*;


import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeTest {


    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        testReporter.publishEntry("Testing" + " ", testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Testing test Constructor")
     void testConstructor(){

        Employee myEmployee = new Employee("Mr", "Stephen", "123456","1234567","Part-time",24);
        assertEquals("Mr",myEmployee.getTitle());

    }


    @DisplayName("Testing for no Title")
    @Test
     void testConstructorNoTitle(){

        assertThrows(IllegalArgumentException.class, () -> new Employee("","Stephen","123456","1234567","Part-time",24));


    }

    @DisplayName("Testing for Name")
    @Test
     void testConstructorNoName(){

        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Ste","123456","1234567","Part-time",24));


    }

    @DisplayName("Testing for PPS")
    @Test
     void testConstructorNoPPS(){

        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen","12","1234567","Part-time",24));


    }

    @DisplayName("Testing for phone number")
    @Test
     void testConstructorNoNumber(){

        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen","123456","123","Part-time",24));

    }

    @DisplayName("Testing for employement details")
    @Test
     void testConstructorNoEmployment(){

        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen","123456","1234567","jobless",24));

    }

    @DisplayName("Testing for Age")
    @Test
     void testConstructorAge(){

        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Stephen","123456","1234567","jobless",15));

    }





}
