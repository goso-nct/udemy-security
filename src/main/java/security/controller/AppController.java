package security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "for_all";
    }

    @GetMapping("hr_info")
    public String getInfoOnlyForHRs() {
        return "for_hr";
    }

    @GetMapping("manager_info")
    public String getInfoOnlyForManagers() {
        return "for_manager";
    }
}
