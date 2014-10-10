package com.argo.equation.score.service.impl;

import com.argo.core.annotation.Model;
import com.argo.core.exception.EntityNotFoundException;
import com.argo.core.exception.ServiceException;
import com.argo.service.annotation.RmiService;
import com.argo.equation.score.Score;
import com.argo.equation.score.service.ScoreService;
import com.argo.equation.service.BaseServiceImpl;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@Model(Score.class)
@RmiService(serviceInterface=ScoreService.class)
public class ScoreServiceImpl extends BaseServiceImpl<Score> implements ScoreService{

    @Override
    public Score findById(Long oid) throws EntityNotFoundException {
        return super.findById(oid);
    }

    @Override
    public Long add(Score entity) throws ServiceException {
        return super.add(entity);
    }

    @Override
    public boolean update(Score entity) throws ServiceException {
        return false;
    }

    @Override
    public boolean remove(Long oid) throws ServiceException {
        return super.remove(oid);
    }
}