package de.greenrobot.android.dao.generator;

import junit.framework.TestCase;

import java.io.File;

public class DaoGeneratorTest extends TestCase {
    private String path = DaoGeneratorTest.class.getResource("/").getPath();
    public void testSystemOut() throws Exception {
        MyDaoGenerator myDaoGenerator = new MyDaoGenerator();
        myDaoGenerator.main(new String[]{new File(path).getParentFile().getParentFile().getParentFile().getParentFile().getAbsolutePath()});
        assert(true);
    }
}
