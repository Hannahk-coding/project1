package com.jw.content.article.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jw.content.base.model.Article;
import com.jw.content.base.service.ContentService;

@RestController
@RequestMapping("/articles")
public class ArticleRest {
	private final ContentService<Article> service;

	public ArticleRest(ContentService<Article> service) {
		this.service = service;
	}
	
	@GetMapping("")
	public List<Article> list() throws Exception {
		return service.list(new Article());
	}
}
