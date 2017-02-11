package com.taotao.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItemParam;

/**
 * Created by Eric on 2/11/17.
 */
public interface ItemParamService {
    TaotaoResult getItemParamByCid(long cid);

    TaotaoResult insertItemParam(TbItemParam itemParam);
}
