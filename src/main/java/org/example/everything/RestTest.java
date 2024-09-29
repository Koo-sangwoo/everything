package org.example.everything;

import org.springframework.web.bind.annotation.*;

/**
 * @author sangu02
 * @apiNote Rest API 연동 테스트
 * @since 2024-09-30
 */

@RestController
@RequestMapping("/test")
public class RestTest {

    @GetMapping("/default")
    public String firstTestService() {
        return "배포 성공 및 API 호출 완료";
    }

    @GetMapping("/valuePatch/{value}")
    public String pathValuePatch(@PathVariable("value") String value) {
        return value + "는 무슨 뜻일까";
    }
}
