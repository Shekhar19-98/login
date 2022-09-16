package in.hafele.login.controller;

import in.hafele.login.service.RetrieveService;
import in.hafele.login.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private RetrieveService retrieveService;

    @GetMapping(value = "/getAllUsers")
    public List<UserInfo> getAllUserInfo(){
        return retrieveService.getAllUsers();
    }

    @PostMapping(value = "/dashboard")
    public void getDashboardParams(){
    }
}
