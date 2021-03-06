package cn.featherfly.permission.web.authentication;

import javax.servlet.http.HttpServletRequest;

import cn.featherfly.permission.PermissionActor;
import cn.featherfly.permission.authentication.Authenticator;

/**
 * <p>
 * WEB环境下的认证者
 * </p>
 *
 * @param <A>
 *            泛型，用于具体行动者的定义
 * @author 钟冀
 */
public interface WebAuthenticator<A extends PermissionActor> extends
        Authenticator<A, HttpServletRequest> {

    /**
     * <p>
     * 认证. 认证失败抛出AuthenticationException异常
     * </p>
     * 
     * @param actor
     *            行动者
     * @param request
     *            HttpServletRequest
     */
    @Override
    void authenticate(A actor, HttpServletRequest request);
}
