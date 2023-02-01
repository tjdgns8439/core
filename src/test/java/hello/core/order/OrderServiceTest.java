package hello.core.order;

import hello.core.OrderApp;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        //given
        Long memberId = 1L;
        //깜짝 TIP. long 이 아닌 Long으로 wrapper타입을 쓰는 이유는 null이 들어갈 수도 있기 때문이다.


        //when
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        //then
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
