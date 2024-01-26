package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import mcdonald.McdonaldDTO;

@Repository
public interface McdonaldDAO {
	
	@Select("select * from mcdonald order by idx")
	List<McdonaldDTO> selectListLAll();
	
	
	@Insert("insert into mcdonald (category, name, price, imgName, memo)"
			+ "	values (#{category}, #{name}, #{price}, #{imgName}, #{memo})")
	int insert(McdonaldDTO dto);
	
	@Select("select * from mcdonald where category = #{category}")
	List<McdonaldDTO> selectListByCategory(String category);
	
	
	@Select("select * from mcdonald where idx = #{idx}")
	McdonaldDTO selectOne(int idx);
	
	@Delete("delete from mcdonald where idx = #{idx}")
	int delete(int idx);

	
	@Update("update mcdonald set "
			+ "	category = #{category}, name = #{name}, price = #{price}, imgName = #{imgName}, memo = #{memo} "
			+ "	where idx = #{idx}")
	int update(McdonaldDTO dto);

}
