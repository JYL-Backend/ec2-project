package com.example.ec2project.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class MemberEntityTests {
    @Test
    public void create(){
        //given
        //when

        Assertions.assertThat(1).isEqualTo(1);
        //then
    }
}
