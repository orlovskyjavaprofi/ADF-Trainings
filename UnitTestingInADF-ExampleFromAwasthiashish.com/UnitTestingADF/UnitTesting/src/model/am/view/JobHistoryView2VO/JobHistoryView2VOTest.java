package model.am.view.JobHistoryView2VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class JobHistoryView2VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public JobHistoryView2VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("JobHistoryView2");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
