package model.am;

import model.am.applicationModule.DeptAMFixture;
import model.am.view.CountriesView1VO.CountriesView1VOTest;
import model.am.view.CountriesView2VO.CountriesView2VOTest;
import model.am.view.DepartmentsView1VO.DepartmentsView1VOTest;
import model.am.view.DepartmentsView2VO.DepartmentsView2VOTest;
import model.am.view.DepartmentsView3VO.DepartmentsView3VOTest;
import model.am.view.EmpDetailsViewView1VO.EmpDetailsViewView1VOTest;
import model.am.view.EmployeesView1VO.EmployeesView1VOTest;
import model.am.view.EmployeesView2VO.EmployeesView2VOTest;
import model.am.view.EmployeesView3VO.EmployeesView3VOTest;
import model.am.view.EmployeesView4VO.EmployeesView4VOTest;
import model.am.view.JobHistoryView1VO.JobHistoryView1VOTest;
import model.am.view.JobHistoryView2VO.JobHistoryView2VOTest;
import model.am.view.JobHistoryView3VO.JobHistoryView3VOTest;
import model.am.view.JobHistoryView4VO.JobHistoryView4VOTest;
import model.am.view.JobsView1VO.JobsView1VOTest;
import model.am.view.LocationsView1VO.LocationsView1VOTest;
import model.am.view.LocationsView2VO.LocationsView2VOTest;
import model.am.view.PsTxnView1VO.PsTxnView1VOTest;
import model.am.view.RegionsView1VO.RegionsView1VOTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CountriesView2VOTest.class, LocationsView2VOTest.class, DepartmentsView3VOTest.class,
                      JobHistoryView4VOTest.class, JobHistoryView3VOTest.class, JobHistoryView2VOTest.class,
                      EmployeesView4VOTest.class, EmployeesView3VOTest.class, EmployeesView2VOTest.class,
                      DepartmentsView2VOTest.class, RegionsView1VOTest.class, PsTxnView1VOTest.class,
                      LocationsView1VOTest.class, JobsView1VOTest.class, JobHistoryView1VOTest.class,
                      EmployeesView1VOTest.class, EmpDetailsViewView1VOTest.class, DepartmentsView1VOTest.class,
                      CountriesView1VOTest.class
    })
public class AllDeptAMTests {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() throws Exception {
        DeptAMFixture.getInstance().release();
    }
}
