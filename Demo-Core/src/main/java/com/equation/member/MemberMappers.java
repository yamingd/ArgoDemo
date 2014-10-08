package com.equation.member;


import com.equation.member.Invite;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by $User on 2014-10-08 17:10.
 */
public class MemberMappers {
	
	

    public static final RowMapper<Invite> Invite_ROWMAPPER = new BeanPropertyRowMapper<Invite>(
            Invite.class);

    
}