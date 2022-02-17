package com.amu.springbootwebservice.Domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass // �ش� Ŭ���� ��� �� �ʵ���� �÷����� �ν�
@EntityListeners(AuditingEntityListener.class) // �ش� Ŭ������ Auditing ��� �߰�
public abstract class BaseTimeEntity {
	@CreatedDate // Entity �����Ǿ� ����� �� �ð�
	private LocalDateTime createdDate;
	
	@LastModifiedDate // Entity�� ���� ������ �� �ð�
	private LocalDateTime modifiedDate;
}
