package in.hafele.login.service;

import in.hafele.login.repository.UserInfoRepository;
import in.hafele.login.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrieveService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    public List<UserInfo> getAllUsers(){
        var users = userInfoRepository.findAll();
        System.out.println("Inside Service!!");
        System.out.println(users.toString());
        return users;
    }
}
