import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//扩展配置功能
@Configuration
public class MyConfigMvc extends WebMvcConfigurerAdapter {

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            /*视图映射功能*/
            public void addViewControllers(ViewControllerRegistry registry) {
                //视图映射：浏览器发送"/"请求，会来到index页面（thymeleaf解析的页面），
                registry.addViewController("/").setViewName("/tree");
                //配置springboot直接访问静态html页面，不经过controller
                //配置之后，发送/loginAndRegister.html，就相当于在controller中return "loginAndRegister"
                registry.addViewController("/a.html").setViewName("/a");
                registry.addViewController("/log.html").setViewName("/log");
            }
        };
        return adapter;
    }
}