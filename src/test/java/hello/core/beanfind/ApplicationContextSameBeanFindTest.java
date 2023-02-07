package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;

import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ApplicationContextSameBeanFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findAllBean(){
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
        //memberService가 MemberServiceImpl의 객체면 통과
    }

    @Test
    @DisplayName("이름 없이 타입으로만 조회")
    void findAllBeanType(){
        MemberService memberService = ac.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findAllBeanType2(){
        MemberService memberService = ac.getBean("memberService", MemberServiceImpl.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }//구현에 의존했기에 좋은 코드가 아님.

    @Test
    @DisplayName("빈 이름으로 조회된 것이 없음.")
    void findBeanByNameX(){
//        org.junit.jupiter.api.Assertions.assertThrows() -> 너무 길어서 아래 코드는 static import한 코드
        assertThrows(NoSuchBeanDefinitionException.class, () ->      //2. 이 예외가 터져야 함.
                ac.getBean("xxxxxx", MemberServiceImpl.class));//1. 이 로직을 실행했을 때
    }
}
