package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;

/**
 * Created by Eric on 2/18/17.
 */
public interface SearchService {
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
