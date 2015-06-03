package com.ymicloud.entity;


/**
 * Sequence
 * @author yang
 *
 */
public class Sequence {

	/**
	 * name
	 */
	private String name;
	/**
	 * next id
	 */
	private long nextId = -1L;

	public Sequence() {
	}

	public Sequence(String name, long nextId) {
		this.name = name;
		this.nextId = nextId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNextId() {
		return nextId;
	}

	public void setNextId(long nextId) {
		this.nextId = nextId;
	}

	// ========= 应用扩展属性 ========

	// 初始化序列号， 从数据库初始化的值,然后 始终与数据库中的序列号保持一致。
	private long dbValue = -1L;
	// 序列号缓存大小
	private int cacheSize = -1;

	public int getCacheSize() {
		return cacheSize;
	}

	public void setCacheSize(int cacheSize) {
		this.cacheSize = cacheSize;
	}

	public long getDbValue() {
		return dbValue;
	}

	public void setDbValue(long initValue) {
		this.dbValue = initValue;
	}

}
