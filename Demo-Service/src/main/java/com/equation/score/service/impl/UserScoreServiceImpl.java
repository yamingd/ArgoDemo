package com.equation.score.service.impl;

import com.argo.core.annotation.Model;
import com.argo.core.exception.EntityNotFoundException;
import com.argo.core.exception.ServiceException;
import com.argo.service.annotation.RmiService;
import com.equation.score.UserScore;
import com.equation.score.service.UserScoreService;
import com.equation.service.BaseServiceImpl;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@Model(UserScore.class)
@RmiService(serviceInterface=UserScoreService.class)
public class UserScoreServiceImpl extends BaseServiceImpl<UserScore> implements UserScoreService{

    @Override
    public UserScore findById(Long oid) throws EntityNotFoundException {
        return super.findById(oid);
    }

    @Override
    public Long add(UserScore entity) throws ServiceException {
        return super.add(entity);
    }

    @Override
    public boolean update(UserScore entity) throws ServiceException {
        return false;
    }

    @Override
    public boolean remove(Long oid) throws ServiceException {
        return super.remove(oid);
    }
}