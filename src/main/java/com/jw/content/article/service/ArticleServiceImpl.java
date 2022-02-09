package com.jw.content.article.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jw.content.article.mapper.ArticleMapper;
import com.jw.content.base.model.Article;
import com.jw.content.base.service.AbstractContentService;

@Service
public class ArticleServiceImpl extends AbstractContentService<Article>{
	public ArticleServiceImpl (final ArticleMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public List<Article> list(Article data) throws Exception {
		// TODO Auto-generated method stub
		return super.list(data);
	}
}
