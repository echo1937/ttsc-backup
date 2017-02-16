package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by Eric on 2/16/17.
 */
public interface RedisService {
    TaotaoResult syncContent(long contentCid);
}
