package model.am.view.DepartmentsView2VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class DepartmentsView2VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public DepartmentsView2VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("DepartmentsView2");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
