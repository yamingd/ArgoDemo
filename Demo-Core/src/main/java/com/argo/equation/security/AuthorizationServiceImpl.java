package com.argo.equation.security;

import com.argo.core.base.BaseBean;
import com.argo.core.exception.PermissionDeniedException;
import com.argo.core.exception.UserNotAuthorizationException;
import com.argo.core.password.PasswordServiceFactory;
import com.argo.core.security.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yaming_deng on 14-8-20.
 */
@Component
public class AuthorizationServiceImpl extends BaseBean implements AuthorizationService<Account> {

    @Autowired
    private PasswordServiceFactory passwordServiceFactory;

    /*@Autowired
    private AccountService accountService;*/

    @Override
    public Account verifyCookie(String value) throws UserNotAuthorizationException {
        /*BigInteger uid = SecurityIdGenerator.Id62.decode(value);
        try {
            Account user = accountService.findById(uid.longValue());
            return user;
        } catch (EntityNotFoundException e) {
            logger.error(e.getMessage(), e);
            throw new UserNotAuthorizationException("User not found. uid=" + uid);
        }*/
        return null;
    }

    @Override
    public Account verifyUserPassword(String userName, String password) {
        /*try {
            Account user = accountService.findByUserName(userName);
            boolean flag = passwordServiceFactory.getDefaultService().validate(password, user.getLoginid(), user);
            if (flag){
                return user;
            }
            return null;
        } catch (EntityNotFoundException e) {
            logger.error(e.getMessage(), e);
        }*/
        return null;
    }

    @Override
    public void verifyAccess(String url) throws PermissionDeniedException {

    }
}