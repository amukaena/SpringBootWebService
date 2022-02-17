package com.amu.springbootwebservice.Domain;

import org.springframework.data.jpa.repository.JpaRepository;

// DB Layer 접근자
// JPA에서 interface 생성후 JpaRepository<Entity클래스, PK타입>를 상속하면 기본 CRUD 생성
public interface PostsRepository extends JpaRepository<Posts, Long>{

}
