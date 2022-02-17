package com.amu.springbootwebservice.Domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass // 해당 클래스 상속 시 필드들을 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class) // 해당 클래스에 Auditing 기능 추가
public abstract class BaseTimeEntity {
	@CreatedDate // Entity 생성되어 저장될 때 시간
	private LocalDateTime createdDate;
	
	@LastModifiedDate // Entity의 값을 변경할 때 시간
	private LocalDateTime modifiedDate;
}
