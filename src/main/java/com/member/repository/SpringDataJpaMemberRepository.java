package com.member.repository;

import com.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //"select m from Member m where m.name = ?"로 등록됨
    @Override
    Optional<Member> findByName(String name);
}
