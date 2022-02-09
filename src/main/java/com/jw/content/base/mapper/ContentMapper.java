package com.jw.content.base.mapper;

import java.util.List;

import com.jw.content.base.model.Content;

public interface ContentMapper<T extends Content> {
	List<T> selectAll() throws Exception;

	T selectById(String id) throws Exception;

	void insert(T user) throws Exception;

	void update(T user) throws Exception;

	void delete(T id) throws Exception;
}
