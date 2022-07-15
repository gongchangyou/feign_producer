import com.braindata.dubbodemo.DubboDemoApplication;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/3/15 9:41 上午
 */

@Slf4j
@SpringBootTest(classes= DubboDemoApplication.class)
public class DBTest {


    @Test
    public void searchByName() {
        val result = repository.getMacaqueByName("CJ185");
        log.info("result={}", result);
    }
}