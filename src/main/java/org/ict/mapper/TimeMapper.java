package org.ict.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("Select now()")
	public String getTime();

	public String getTime2();
	
	
}
