package model.am.view.JobHistoryView4VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class JobHistoryView4VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public JobHistoryView4VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("JobHistoryView4");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
