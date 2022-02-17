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

@NoArgsConstructor(access = AccessLevel.PROTECTED) // lombok annotation [protected Posts() {}]�� ���� �ǹ�.
// ������Ʈ �ڵ� �󿡼��� �⺻ �����ڸ� ���� JPA���� Entity ������ ����ϱ� ���� ���
@Getter // lombok annotation
@Entity // JPA annotation ���̺�� ��ũ�Ǵ� Ŭ����
public class Posts extends BaseTimeEntity {
	@Id // JPA annotation PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // JPA annotation PK ������Ģ
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
