package com.ymicloud.dao;

import com.ymicloud.entity.Sequence;

/**
 * Sequence实体层
 * @author yang
 *
 */
public interface SequenceMapper {

	/**
	 * 根据名称获取Sequence
	 * @param sequenceName
	 * @return
	 */
	Sequence getSequenceByName(String sequenceName);

	/**
	 * 修改Sequence值
	 * @param sequence
	 */
	void updateSequence(Sequence sequence);
}
