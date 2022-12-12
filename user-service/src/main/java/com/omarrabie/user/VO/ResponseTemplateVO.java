package com.omarrabie.user.VO;

import com.omarrabie.user.entity.Userz;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Userz user;
    private Department department;
}
