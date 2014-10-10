package com.argo.equation.member.service.impl;

import com.argo.core.annotation.Model;
import com.argo.core.exception.EntityNotFoundException;
import com.argo.core.exception.ServiceException;
import com.argo.service.annotation.RmiService;
import com.argo.equation.member.Invite;
import com.argo.equation.member.service.InviteService;
import com.argo.equation.service.BaseServiceImpl;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@Model(Invite.class)
@RmiService(serviceInterface=InviteService.class)
public class InviteServiceImpl extends BaseServiceImpl<Invite> implements InviteService{

    @Override
    public Invite findById(Long oid) throws EntityNotFoundException {
        return super.findById(oid);
    }

    @Override
    public Long add(Invite entity) throws ServiceException {
        return super.add(entity);
    }

    @Override
    public boolean update(Invite entity) throws ServiceException {
        return false;
    }

    @Override
    public boolean remove(Long oid) throws ServiceException {
        return super.remove(oid);
    }
}