package model.am.view.JobsView1VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class JobsView1VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public JobsView1VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("JobsView1");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
