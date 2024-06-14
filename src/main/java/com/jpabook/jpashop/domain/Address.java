package com.jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable // JPA 의 내장타입으로 선언
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
