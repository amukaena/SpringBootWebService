package com.amu.springbootwebservice.DTO;

import com.amu.springbootwebservice.Domain.Posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter // Controller에서 @RequestBody로 외부데이터 받을 때는 기본생성자+Setter로 값이 할당된다.
@NoArgsConstructor
public class PostsSaveRequestDTO {
	private String title;
	private String content;
	private String author;
	
	@Builder
	public PostsSaveRequestDTO(String title, String content, String author)
	{
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Posts toEntity()
	{
		return Posts.builder()
				.title(title)
				.content(content)
				.author(author)
				.build();
	}
}
