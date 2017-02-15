package com.taotao.rest.service;

import com.taotao.pojo.TbContent;

import java.util.List;

/**
 * Created by Eric on 2/15/17.
 */
public interface ContentService {
    List<TbContent> getContentList(long contentCid);
}
