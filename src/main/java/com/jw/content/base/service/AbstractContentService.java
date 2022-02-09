package com.jw.content.base.service;

import java.util.List;

import com.jw.content.base.mapper.ContentMapper;
import com.jw.content.base.model.Content;

public class AbstractContentService<T extends Content> implements ContentService<T> {

	protected ContentMapper<T> mapper;
	
	@Override
	public List<T> list(T data) throws Exception {
		return mapper.selectAll();
	}

	@Override
	public void add(T content) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
