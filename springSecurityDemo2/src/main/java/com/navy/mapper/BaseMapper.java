package com.navy.mapper;

import java.io.Serializable;

public interface BaseMapper <T extends Serializable, PK extends Serializable>
{
	public T findByPK(PK pk);
	
	public void insert(T t);
}
