package hello.core.member;

public interface MemberRepository {
    void save(Member member);//멤버 객체를 저장한다.

    Member findById(Long memberId);//멤버 객체가 리턴된다.
}
