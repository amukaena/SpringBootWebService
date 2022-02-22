package com.amu.springbootwebservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.amu.springbootwebservice.Service.PostsService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {
	private PostsService postsService;
	
	@GetMapping("/")
	public String main(Model model)
	{
		model.addAttribute("posts", postsService.findAllDesc());
		return "main";
	}
}
