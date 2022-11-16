package config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import service.ProductService;

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class WebConfig implements ApplicationContextAware {
        private ApplicationContext applicationContext;

        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
        }

        //Cấu hình.
        @Bean
        public ViewResolver getViewResolver() {
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("/view/");
            resolver.setSuffix(".jsp");
            return resolver;

        }
        @Bean
        public ProductService productService() {
            return new ProductService();
        }

        @Bean
        public CommonsMultipartResolver multipartResolver() {
            CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
            multipartResolver.setMaxUploadSizePerFile(90000000);
            return multipartResolver;
        }


}
