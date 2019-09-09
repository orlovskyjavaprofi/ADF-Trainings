package model.am.applicationModule;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class DeptAMFixture {
    private static DeptAMFixture fixture1 = new DeptAMFixture();
    private ApplicationModule _am;

    private DeptAMFixture() {
        _am = Configuration.createRootApplicationModule("model.am.DeptAM", "DeptAMLocal");
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public static DeptAMFixture getInstance() {
        return fixture1;
    }

    public void release() throws Exception {
        Configuration.releaseRootApplicationModule(_am, true);
    }

    public ApplicationModule getApplicationModule() {
        return _am;
    }
}
