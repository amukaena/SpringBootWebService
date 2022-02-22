package com.amu.springbootwebservice.Domain;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// DB Layer ������
// JPA���� interface ������ JpaRepository<EntityŬ����, PKŸ��>�� ����ϸ� �⺻ CRUD ����
public interface PostsRepository extends JpaRepository<Posts, Long>{
	@Query(value = "SELECT p.* FROM posts p ORDER BY p.id DESC", nativeQuery = true)
	Stream<Posts> findAllDesc();
}
