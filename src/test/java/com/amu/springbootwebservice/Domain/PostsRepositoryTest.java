package com.amu.springbootwebservice.Domain;

import java.time.LocalDateTime;
import java.util.List;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
	@Autowired
	PostsRepository postsRepository;
	
	@After(value = "")
	public void cleanup()
	{
		postsRepository.deleteAll();
	}
	
	@Test
	public void �Խñ�����_�ҷ�����()
	{
		//given
		postsRepository.save(Posts.builder()
				.title("�׽�Ʈ �Խñ�")
				.content("�׽�Ʈ ����")
				.author("amu7517@gmail.com")
				.build());
		
		//when
		List<Posts> postList = postsRepository.findAll();
		
		//then
		Posts posts = postList.get(0);
		assertThat(posts.getTitle(), is("�׽�Ʈ �Խñ�"));
		assertThat(posts.getContent(), is("�׽�Ʈ ����"));
	}
	
	@Test
	public void BaseTimeEntity_���()
	{
		//given
		LocalDateTime now = LocalDateTime.now();
		postsRepository.save(Posts.builder()
				.title("�׽�Ʈ �Խñ�")
				.content("�׽�Ʈ ����")
				.author("amu7517@gmail.com")
				.build());
		
		//when
			List<Posts> postList = postsRepository.findAll();
			
		//then
			Posts posts = postList.get(0);
			assertTrue(posts.getCreatedDate().isAfter(now));
			assertTrue(posts.getModifiedDate().isAfter(now));
	}
}
