package com.amu.springbootwebservice.Domain;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// DB Layer 접근자
// JPA에서 interface 생성후 JpaRepository<Entity클래스, PK타입>를 상속하면 기본 CRUD 생성
public interface PostsRepository extends JpaRepository<Posts, Long>{
	@Query(value = "SELECT p.* FROM posts p ORDER BY p.id DESC", nativeQuery = true)
	Stream<Posts> findAllDesc();
}
