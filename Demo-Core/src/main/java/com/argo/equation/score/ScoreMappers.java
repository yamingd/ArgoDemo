package com.argo.equation.score;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by $User on 2014-10-08 17:10.
 */
public class ScoreMappers {
	
	

    public static final RowMapper<Score> Score_ROWMAPPER = new BeanPropertyRowMapper<Score>(
            Score.class);

    

    public static final RowMapper<Event> Event_ROWMAPPER = new BeanPropertyRowMapper<Event>(
            Event.class);

    

    public static final RowMapper<UserScore> UserScore_ROWMAPPER = new BeanPropertyRowMapper<UserScore>(
            UserScore.class);

    
}