package com.exam.member;

public interface MemberService {

    boolean checkMemberExist(String member_id);
    void save(MemberDTO memberDTO);
    boolean checkSignUpSamePasswd(MemberDTO memberDTO);

}
