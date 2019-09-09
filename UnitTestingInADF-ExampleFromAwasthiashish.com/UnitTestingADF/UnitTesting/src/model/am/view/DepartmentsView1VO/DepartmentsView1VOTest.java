package model.am.view.DepartmentsView1VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

import org.junit.After;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class DepartmentsView1VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public DepartmentsView1VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("DepartmentsView1");
        assertNotNull(view);
    }
    
//taken from http://www.awasthiashish.com/2019/01/unit-testing-of-adf-application-using-junit.html?unapproved=16421&moderation-hash=f293d336f8e14be2f6ba44689d8479a8#comment-16421
    @Test
    public void checkDeptIdNotNull() {
        ViewObject deptVo = fixture1.getApplicationModule().findViewObject("DepartmentsView1");
        Row newRow = deptVo.createRow();
        newRow.setAttribute("DepartmentId", 222);
        newRow.setAttribute("DepartmentName", "Testing");
        assertNotNull("DepartmentId should not be null", newRow.getAttribute("DepartmentId"));
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
