package com.mycompany.myapp09.member.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberEnrollDate;
	
	public Member(){
		super();
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberEnrollDate=" + memberEnrollDate + "]";
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEnrollDate() {
		return memberEnrollDate;
	}

	public void setMemberEnrollDate(String memberEnrollDate) {
		this.memberEnrollDate = memberEnrollDate;
	}	
}
