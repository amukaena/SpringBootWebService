package com.amu.springbootwebservice.Service;

import static org.assertj.core.api.Assertions.assertThat;

import org.aspectj.lang.annotation.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.amu.springbootwebservice.DTO.PostsSaveRequestDTO;
import com.amu.springbootwebservice.Domain.Posts;
import com.amu.springbootwebservice.Domain.PostsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {
	@Autowired
	private PostsService postsService;
	
	@Autowired
	private PostsRepository postsRepository;
	
	@After(value = "")
	public void cleanup()
	{
		postsRepository.deleteAll();
	}
	
	@Test
	public void DTO데이터_Posts테이블에_저장()
	{
		//given
		PostsSaveRequestDTO dto = PostsSaveRequestDTO.builder()
				.author("amu7517@gmail.com")
				.content("테스트")
				.title("테스트 타이틀")
				.build();
		
		//when
		postsService.save(dto);
		
		//then
		Posts posts = postsRepository.findAll().get(0);
		assertThat(posts.getAuthor().equals(dto.getAuthor()));
		assertThat(posts.getContent().equals(dto.getContent()));
		assertThat(posts.getTitle().equals(dto.getTitle()));
	}
}
