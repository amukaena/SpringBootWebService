package com.amu.springbootwebservice.Domain;

import org.springframework.data.jpa.repository.JpaRepository;

// DB Layer ������
// JPA���� interface ������ JpaRepository<EntityŬ����, PKŸ��>�� ����ϸ� �⺻ CRUD ����
public interface PostsRepository extends JpaRepository<Posts, Long>{

}
