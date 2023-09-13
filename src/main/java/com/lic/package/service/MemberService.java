for the above entity with package name com.lic.package.service

public class MemberService {

	private MemberRepository memberRepository;
	
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	// Inserting an Individual Member
	public Member insertIndividualMember(Member member) {
		return memberRepository.save(member);
	}
	
	// Inserting Multiple Members
	public List<Member> insertMultipleMembers(List<Member> members) {
		return memberRepository.saveAll(members);
	}
	
	// Updating a Member
	public Member updateMember(Member member) {
		return memberRepository.save(member);
	}
	
	// Retrieving a Member
	public Member getMemberById(Long memberId) {
		return memberRepository.findById(memberId).orElse(null);
	}
	
	// Deleting a Member
	public void deleteMember(Long memberId) {
		memberRepository.deleteById(memberId);
	}
	
	// Retrieving all Members
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

}