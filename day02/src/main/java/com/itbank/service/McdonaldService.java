package com.itbank.service;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.repository.McdonaldDAO;

import mcdonald.McdonaldDTO;

enum McdonaldCategory {
	all(null),
	burger("버거"),
	drink("음료");
	
	private String columnValue;
	
	McdonaldCategory(String columnValue) {
		this.columnValue = columnValue;
	}
	public String getColumnName() {
		return columnValue;
	}
}

@Service
public class McdonaldService {
	
	@Autowired 
	private McdonaldDAO dao;
	
	public List<McdonaldDTO> getMcdonaldListAll() {
		List<McdonaldDTO> list = dao.selectListLAll();
		return list;
	}

	public int add(McdonaldDTO dto) {
		int row = dao.insert(dto);
		return row;
	}

	public List<McdonaldDTO> getMcdonaldListByCategory(String category) {
		List<McdonaldDTO> list = dao.selectListByCategory(category);
		return list;
	}
	
	public McdonaldDTO getMcdonaldView(int idx) {
		McdonaldDTO dto = dao.selectOne(idx);
		return dto;
	}
	
	public int delete(int idx) {
		int row = dao.delete(idx);
		return row;
	}

	public int modify(McdonaldDTO dto) {
		int row = dao.update(dto);
		return row;
	}
	
//	public List<McdonaldDTO> getList(String category) {
//		String columnValue = null;
//		
//		McdonaldCategory e1 = McdonaldCategory.valueOf(category);
//		columnValue = e1.getColumnName();
//		
//		System.out.println("category : " + category);
//		System.out.println("columnValue" + columnValue);
//		System.out.println();
//		return dao.selectListLAll();
//	}
	
	


	
}
