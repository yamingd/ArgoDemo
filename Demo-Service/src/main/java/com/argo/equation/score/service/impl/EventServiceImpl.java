package com.argo.equation.score.service.impl;

import com.argo.core.annotation.Model;
import com.argo.core.exception.EntityNotFoundException;
import com.argo.core.exception.ServiceException;
import com.argo.service.annotation.RmiService;
import com.argo.equation.score.Event;
import com.argo.equation.score.service.EventService;
import com.argo.equation.service.BaseServiceImpl;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@Model(Event.class)
@RmiService(serviceInterface=EventService.class)
public class EventServiceImpl extends BaseServiceImpl<Event> implements EventService{

    @Override
    public Event findById(Long oid) throws EntityNotFoundException {
        return super.findById(oid);
    }

    @Override
    public Long add(Event entity) throws ServiceException {
        return super.add(entity);
    }

    @Override
    public boolean update(Event entity) throws ServiceException {
        return false;
    }

    @Override
    public boolean remove(Long oid) throws ServiceException {
        return super.remove(oid);
    }
}