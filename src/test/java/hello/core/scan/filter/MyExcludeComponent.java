package hello.core.scan.filter;

import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}//MyIncludeComponent -> 얘가 붙은 것은 컴포넌트 스캔에 제외할 거라는 뜻
