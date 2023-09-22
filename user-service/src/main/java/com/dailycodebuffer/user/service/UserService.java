package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.model.User;

public interface UserService {

    User saveUser(User user);

    ResponseTemplateVO getUserWithDepartment (Long userId);
}
