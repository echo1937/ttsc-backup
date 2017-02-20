package com.taotao.portal.service;

import com.taotao.pojo.TbUser;

/**
 * Created by Eric on 2/21/17.
 */
public interface UserService {
    TbUser getUserByToken(String token);
}
