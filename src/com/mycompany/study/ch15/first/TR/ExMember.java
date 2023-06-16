package com.mycompany.study.ch15.first.TR;

import java.util.ArrayList;

public class ExMember {
	public static void main(String[] args) {
	
	ArrayList<Member> members = new ArrayList<Member>();
	
	
	Member member1 = new Member("jane", "kkk",124,890,"aaaa");
	
	members.add(member1);
	
	for(Member member: members) {
		System.out.println("member.name:" + member.name);
		System.out.println("member.ID:" + member.ID);
		System.out.println("============================");
	}
}
}