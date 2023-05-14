package com.fullstack.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.db.entity.Memo;

/*
 * Repository의 기능 메서드
 * 
 * insert, update  --> save()
 * select  --> findbyId(key 타입), getOne(key 타입)
 * delete  --> deleteById(key 타입), delete(Entity 객체)
 */

public interface MemoRepository extends JpaRepository<Memo, Long> {

}
