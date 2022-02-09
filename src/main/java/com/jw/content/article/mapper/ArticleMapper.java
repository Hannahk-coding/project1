package com.jw.content.article.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jw.content.base.mapper.ContentMapper;
import com.jw.content.base.model.Article;

@Mapper
public interface ArticleMapper extends ContentMapper<Article> {

}
