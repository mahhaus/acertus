package com.mahhaus.acertus.auth.security.filter;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author josias on 05/05/19
 */
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class JwtUserNameAndPasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
}
