package lab18;

import lab18.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab18ApplicationTests {

    @Autowired
    private TestController testController;
    @Test

    void contextLoads() {
        String test = testController.test();
        System.out.println(test);
    }

}
