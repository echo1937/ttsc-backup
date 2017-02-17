package com.taotao.search.dao;

import com.taotao.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;

/**
 * Created by Eric on 2/18/17.
 */
public interface SearchDao {
    SearchResult search(SolrQuery query) throws Exception;
}
