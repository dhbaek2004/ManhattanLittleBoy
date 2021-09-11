//package BaekInternational.ManhattanLittleBoy.config;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.CacheControl;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.concurrent.TimeUnit;
//
//@Configuration
//public class test implements WebMvcConfigurer {
//
//    public void addResourceHandler(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("**/")
//                .addResourceLocations("classpath:/templates")
//                .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
//    }
//}
