package com.taotao.portal.service;

import com.taotao.portal.pojo.ItemInfo;

/**
 * Created by Eric on 2/18/17.
 */
public interface ItemService {
    ItemInfo getItemById(Long itemId);

    String getItemDescById(Long itemId);

    String getItemParam(Long itemId);
}
