package com.amu.springbootwebservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amu.springbootwebservice.DTO.PostsSaveRequestDTO;
import com.amu.springbootwebservice.Domain.PostsRepository;
import com.amu.springbootwebservice.Service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor // 의존성 관계 변경할 떄 마다 생성자 수정 안하도록 사용
public class WebRestController {
	private PostsService postsService;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "HelloWorld!!";
	}
	
	@PostMapping("/posts")
	public Long savePosts(@RequestBody PostsSaveRequestDTO dto)
	{
		return postsService.save(dto);
	}
}
