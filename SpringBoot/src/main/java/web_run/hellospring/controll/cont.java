package web_run.hellospring.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cont {
// 다른 객체생기면 에노테이션 넣기
    @GetMapping("/")
    public String start()
    {
       return "SweetHtml/home";
    }
    @GetMapping("/new/member")
    public String Login()
    {
        return "SweetHtml/login";
    }
}
