import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.NestingKind;

/**
 * @author 刘振东
 * @create 2021-09-26 19:29
 */
@RestController
public class WorldController {

    @RequestMapping("/world")
    public String world(){
        return  "hello";
    }

}
