package com.example.ec2project.entity;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
public class MemberEntity {
    @Id @GeneratedValue
    private Long id;

    private String name;
}
