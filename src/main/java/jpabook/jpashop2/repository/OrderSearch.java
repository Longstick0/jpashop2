package jpabook.jpashop2.repository;

import jpabook.jpashop2.domain.OrderStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.EntityManager;

@Getter @Setter
@RequiredArgsConstructor
public class OrderSearch {

    private String memberName; //회원이름
    private OrderStatus orderStatus; // 주문 상태[ORDER, CANCEL]
}
