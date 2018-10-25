package org.tutorial.gateway.security;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

@Getter
public final class JwtConfig {
    /** default value : /auth/**  */
    @Value("${security.jwt.uri:/api/auth/**}")
    private String uri;

    /** default value : Authorization */
    @Value("${security.jwt.header:Authorization}")
    private String header;

    // Default value Bearer
    @Value("${security.jwt.prefix:Bearer}")
    private String prefix;
        
    // default value : 1 day    
    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;
        
    // default value JwtsecretKey
    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;


    
}