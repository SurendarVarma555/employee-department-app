package com.dailycodebuffer.user.service.impl;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.model.User;
import com.dailycodebuffer.user.repository.UserRepository;
import com.dailycodebuffer.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public User saveUser (User user){
        return userRepository.save(user);
    }

    @Override
    public ResponseTemplateVO getUserWithDepartment (Long userId){
        ResponseTemplateVO response = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/departments/"+user.getId(), Department.class);
        response.setUser(user);
        response.setDepartment(department);
        return response;
    }
}
