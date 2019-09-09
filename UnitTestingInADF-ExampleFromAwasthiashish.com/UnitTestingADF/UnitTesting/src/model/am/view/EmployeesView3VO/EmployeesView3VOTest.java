package model.am.view.EmployeesView3VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class EmployeesView3VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public EmployeesView3VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("EmployeesView3");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
