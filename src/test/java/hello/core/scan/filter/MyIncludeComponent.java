package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}//MyIncludeComponent -> 얘가 붙은 것은 컴포넌트 스캔에 추가할 거라는 뜻
