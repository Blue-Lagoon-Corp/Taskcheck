package academy.certif.taskcheck;

import academy.certif.taskcheck.controller.CheckController;
import academy.certif.taskcheck.mock.MockCheckService;
import academy.certif.taskcheck.mock.MockTaskProvider;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CheckControllerTest {

    public static MockCheckService checkService;
    public static MockTaskProvider taskProvider;
    public static CheckController checkController;

    @BeforeClass
    public static void init(){
        CheckControllerTest.taskProvider = new MockTaskProvider();
        CheckControllerTest.checkService = new MockCheckService(taskProvider);
        CheckControllerTest.checkController = new CheckController(checkService);
    }

    @Test
    public void listNotDoneShouldNotBeNull(){
        assertNotNull(checkController.listNotDone());
    }

    @Test
    public void checkNotNull(){
        checkController.check("1");
    }

    @Test(expected = NumberFormatException.class)
    public void checkThatCheckIsNumberFormat(){
        checkController.check("test");
    }
}
