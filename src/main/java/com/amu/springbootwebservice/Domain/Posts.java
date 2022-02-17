package com.amu.springbootwebservice.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // lombok annotation [protected Posts() {}]와 같은 의미.
// 프로젝트 코드 상에서는 기본 생성자를 막고 JPA에서 Entity 생성은 허용하기 위한 방법
@Getter // lombok annotation
@Entity // JPA annotation 테이블과 링크되는 클래스
public class Posts extends BaseTimeEntity {
	@Id // JPA annotation PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // JPA annotation PK 생성규칙
	private Long id;
	
	@Column(length = 500, nullable = false) // JPA annotation
	private String title;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	
	private String author;
	
	@Builder // lombok annotation
	public Posts(String title, String content, String author)
	{
		this.title = title;
		this.content = content;
		this.author = author;
	}
}
