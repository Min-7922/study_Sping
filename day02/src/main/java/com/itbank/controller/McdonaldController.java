package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.McdonaldService;

import mcdonald.McdonaldDTO;

@Controller
public class McdonaldController {
	
	@Autowired private McdonaldService ms;
	
	@GetMapping("/") 
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("home");
		List<McdonaldDTO> list = ms.getMcdonaldListAll();
		mav.addObject("list",list);
		return mav;
	}
	
	@GetMapping("/add")
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("add");
		return mav;
	}
	@PostMapping("/add")
	public ModelAndView add(McdonaldDTO dto) {
		ModelAndView mav = new ModelAndView("redirect:/add");
		int row = ms.add(dto);
		mav.addObject("row",row);
		return mav;
	}
	
	@GetMapping("/list/{category}")
	public ModelAndView list(@PathVariable("category") String category) {
		ModelAndView mav = new ModelAndView("home");
		List<McdonaldDTO> list = ms.getMcdonaldListByCategory(category);
		mav.addObject("list",list);
		return mav;
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		McdonaldDTO dto = ms.getMcdonaldView(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("alert");
		int row = ms.delete(idx);
		mav.addObject("row",row);
		return mav;
	}
	
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("modify");
		McdonaldDTO dto = ms.getMcdonaldView(idx);
		mav.addObject("dto",dto);
		return mav;
	}
	@PostMapping("/modify/{idx}")
	public ModelAndView modify(McdonaldDTO dto) {
		ModelAndView mav = new ModelAndView("redirect:/view/{idx}");
		int row = ms.modify(dto);
		mav.addObject("row",row);
		return mav;
	}
	
}




























