package com.amu.springbootwebservice.DTO;

import com.amu.springbootwebservice.Domain.Posts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter // Controller���� @RequestBody�� �ܺε����� ���� ���� �⺻������+Setter�� ���� �Ҵ�ȴ�.
@NoArgsConstructor
public class PostsSaveRequestDTO {
	private String title;
	private String content;
	private String author;
	
	public Posts toEntity()
	{
		return Posts.builder()
				.title(title)
				.content(content)
				.author(author)
				.build();
	}
}
