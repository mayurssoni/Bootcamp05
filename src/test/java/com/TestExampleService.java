import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ExampleService;

@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = Application.class)

@SpringBootTest(classes={com.ExampleService.class})
public class TestExampleService {
	ExampleService es = new ExampleService();
        
	@Test
        public void testSign() {
                Assertions.assertEquals(es.checkSign(22), "22 is positive number");
        }
}
