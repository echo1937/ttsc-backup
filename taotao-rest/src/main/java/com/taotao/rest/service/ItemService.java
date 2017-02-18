package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by Eric on 2/18/17.
 */
public interface ItemService {
    TaotaoResult getItemBaseInfo(long itemId);

    TaotaoResult getItemDesc(long itemId);

    TaotaoResult getItemParam(long itemId);
}
