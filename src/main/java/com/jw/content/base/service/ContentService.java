package com.jw.content.base.service;

import java.util.List;

import com.jw.content.base.model.Content;

public interface ContentService<T extends Content>{
	List<T> list(T data) throws Exception;
	void add(T content) throws Exception;
}
