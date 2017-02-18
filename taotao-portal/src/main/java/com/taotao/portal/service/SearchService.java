package com.taotao.portal.service;

import com.taotao.portal.pojo.SearchResult;

/**
 * Created by Eric on 2/18/17.
 */
public interface SearchService {
    SearchResult search(String queryString, int page);
}
