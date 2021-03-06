
package cn.featherfly.permission.web.authentication;

/**
 * <p>
 * AuthenticationKey
 * </p>
 * <p>
 * 2019-08-21
 * </p>
 *
 * @author zhongj
 */
public interface AuthenticationKeyToken extends AuthenticationToken {
    /**
     * Gets signature.
     *
     * @return the signature
     */
    String getSignature();

    /**
     * Gets authentication key.
     *
     * @return the authentication key
     */
    String getAuthenticationKey();

    /**
     * 根据AuthenticationKey对应的时间戳
     */
    Long getTimestamp();
}
