package com.addteq.assessment.config;

import com.addteq.assessment.api.MyPluginComponent;
import com.addteq.assessment.impl.MyPluginComponentImpl;
import com.addteq.assessment.repository.IssueCommentsRepository;
import com.addteq.assessment.service.IssueCommentsService;
import com.addteq.assessment.service.impl.IssueCommentsServiceImpl;
import com.atlassian.plugins.osgi.javaconfig.configs.beans.ModuleFactoryBean;
import com.atlassian.plugins.osgi.javaconfig.configs.beans.PluginAccessorBean;
import com.atlassian.sal.api.ApplicationProperties;
import org.osgi.framework.ServiceRegistration;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static com.atlassian.plugins.osgi.javaconfig.OsgiServices.exportOsgiService;
import static com.atlassian.plugins.osgi.javaconfig.OsgiServices.importOsgiService;

@Configuration
@Import({
        ModuleFactoryBean.class,
        PluginAccessorBean.class
})
public class MyPluginJavaConfig {

    /*@ComponentImport
    private ActiveObjects ao;*/

    // imports ApplicationProperties from OSGi
    @Bean
    public ApplicationProperties applicationProperties() {
        return importOsgiService(ApplicationProperties.class);
    }

    @Bean
    public MyPluginComponent myPluginComponent(ApplicationProperties applicationProperties) {
        return new MyPluginComponentImpl(applicationProperties);
    }

    // Exports MyPluginComponent as an OSGi service
    @Bean
    public FactoryBean<ServiceRegistration> registerMyDelegatingService(
            final MyPluginComponent mypluginComponent) {
        return exportOsgiService(mypluginComponent, null, MyPluginComponent.class);
    }

    //API Beans
    @Bean
    public IssueCommentsService issueCommentsService() {
        return new IssueCommentsServiceImpl();
    }

    @Bean
    public IssueCommentsRepository issueCommentsRepository() {
        return new IssueCommentsRepository();
    }

    /*@Bean
    public ActiveObjects ao() {
        return ao;
    }*/
}