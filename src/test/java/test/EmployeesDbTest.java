package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import utilities.DBType;
import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class EmployeesDbTest {

    @BeforeClass
    public static void setUp() throws SQLException {
        DBUtility.establishConnection(DBType.ORACLE);
    }
    @AfterClass
    public static void tearDown(){
        DBUtility.closeConnections();
    }

    @Test
    public void countTest() throws SQLException {
        // Connect to Oracle Database
        // run following sql query
        // select * from employees where job_id = 'IT_PROG'
        // more than 0 records should be return

        int rowsCount = DBUtility.getRowsCount("select * from employees where job_id = 'IT_PROG'");
        assertTrue(rowsCount > 0 );


    }

    @Test
    public void nameTestByID() throws SQLException {
        // Connect to Oracle Database
        // employees fullname with Employee id 105 should be David Austin

        List<Map<String,Object>>  list = DBUtility.runSQLQuery("select first_name, last_name From employees WHERE employee_id=105");

        assertTrue(list.get(0).get("FIRST_NAME").equals("David"));
        assertTrue(list.get(0).get("LAST_NAME").equals("Austin"));

//        for(Map<String,Object> map : list){
//                Assert.assertTrue(map.get("FIRST_NAME").equals("David"));
//                Assert.assertTrue(map.get("LAST_NAME").equals("Austin"));
//        }

    }

}
