package com.dailycodebuffer.user.VO;

import com.dailycodebuffer.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {   
    private User user;
    private Department department;
}
