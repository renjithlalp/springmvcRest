package com.ust.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ust.mvc.domain.Member;

@Controller
@RequestMapping("/rest/members")
public class MemberRestController
{
	

    @RequestMapping(method=RequestMethod.GET,produces = "application/json; charset=utf-8")
    public @ResponseBody List<Member> listAllMembers()
    {
    	Member member1 = new Member(1L,"Vigheshwar","Vighnehwar@gmail.com","9742400858");
    	Member member2 = new Member(1L,"RLal","R.lal@gmail.com","9745500859");
    	Member member3 = new Member(1L,"Baby Lexmi","lexmi@gmail.com","9643500834");
    	List<Member> listMembers = new ArrayList<Member>();
    	listMembers.add(member1);
    	listMembers.add(member2);
    	listMembers.add(member3);
        return listMembers;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody Member lookupMemberById(@PathVariable("id") Long id)
    {
        return null;
    }
}
