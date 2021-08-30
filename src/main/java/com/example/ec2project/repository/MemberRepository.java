package com.example.ec2project.repository;

import com.example.ec2project.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<MemberEntity, Long> {
}
