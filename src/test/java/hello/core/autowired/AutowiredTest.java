package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        //호출안됨
        @Autowired(required = false)
        public void setNoBean1(Member member) {//Member는 스프링 빈 멤버가 아니기에.
            System.out.println("setNoBean1 = " + member);
        }
        //호출도 안됨. true면 에러뜸.


        //null 호출
        @Autowired
        public void setNoBean2(@Nullable Member member) {
            System.out.println("setNoBean2 = " + member);
        }
        //호출은 되지만 null로 들어옴

        //Optional.empty 호출
        @Autowired(required = false)
        public void setNoBean3(Optional<Member> member) {
            System.out.println("setNoBean3 = " + member);
        }
        //스프링 빈이 없으면 Optional.empty로 들어옴. 있으면 Optional로 감싸짐.
    }

}
