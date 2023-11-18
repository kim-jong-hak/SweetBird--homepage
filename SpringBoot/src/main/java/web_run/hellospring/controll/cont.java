package web_run.hellospring.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web_run.hellospring.google_API.join;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Controller
public class cont {
    // 다른 객체생기면 에노테이션 넣기
    @GetMapping("/")
    public String start() {
        return "SweetHtml/home";
    }

    @GetMapping("/new/member")
    public String Login() {
        return "SweetHtml/login";
       // return "SweetHtml/YesAdmin";

    }

    @PostMapping("/new/member")
    @ResponseBody
    public String AdminAccess(@RequestParam("Id") String Id, @RequestParam("Password") String Password) throws GeneralSecurityException, IOException {
        String[] a = join.main();
        if (a[0].equals(Id) && a[1].equals(Password))
        {
           return "/Yes/Admin";
        }

        return "/new/member";
    }


    @GetMapping("/Yes/Admin")
    public String YesAdmin()
    {
        return "/SweetHtml/YesAdmin";
    }

}