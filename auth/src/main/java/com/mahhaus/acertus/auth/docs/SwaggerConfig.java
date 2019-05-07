package com.mahhaus.acertus.auth.docs;

import com.mahhaus.acertus.core.docs.BasicSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author josias on 06/05/19
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BasicSwaggerConfig {
    public SwaggerConfig() {
        super("com.mahhaus.acertus.auth.endpoint.controller");
    }
}
