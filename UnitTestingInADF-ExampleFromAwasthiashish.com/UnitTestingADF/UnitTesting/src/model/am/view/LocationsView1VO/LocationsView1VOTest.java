package model.am.view.LocationsView1VO;

import model.am.applicationModule.DeptAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class LocationsView1VOTest {
    private DeptAMFixture fixture1 = DeptAMFixture.getInstance();

    public LocationsView1VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("LocationsView1");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
