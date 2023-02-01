package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //가입을 하고 멤버를 찾으려면 앞에서 만들었던 멤버리퍼지토리 인터페이스가 필요함.

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
