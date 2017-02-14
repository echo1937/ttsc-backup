package com.taotao.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by Eric on 2/14/17.
 */
public interface ContentCategoryService {
    List<EasyUITreeNode> getCategoryList(long parentId);
}
