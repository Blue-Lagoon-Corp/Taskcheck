package academy.certif.taskcheck;

import academy.certif.taskcheck.mock.MockTaskProvider;
import academy.certif.taskcheck.service.CheckService;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CheckServiceTest {
    private static MockTaskProvider taskProvider;
    private static CheckService checkService;

    @BeforeClass
    public static void init(){
        CheckServiceTest.taskProvider = new MockTaskProvider();
        CheckServiceTest.checkService = new CheckService(taskProvider);
    }

    @Test
    public void listNotDoneShouldNotBeNull(){
        assertNotNull(checkService.listNotDone());
    }

    @Test
    public void checkNotNull(){
        checkService.check(1);
    }
}
