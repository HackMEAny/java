package com.example.basic.bean_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcesser implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("Inside Bean Factory Post Processer");
        // Arrays.asList(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
        // Arrays.stream(beanFactory.getBeanDefinitionNames())
        // .forEach(x -> System.out.println("From Bean Factory -> " +
        // beanFactory.getBeanDefinition(x)));

        // if (beanFactory.getBeanNamesIterator().hasNext()) {
        // BeanDefinition beanDefinition = beanFactory.getBeanDefinition("laptop");
        // if (beanDefinition.getBeanClassName().endsWith("Laptop")) {
        // beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        // beanDefinition.setInitMethodName("initMethod");
        // System.out
        // .println("Bean Factory SCOPE of -> " + beanDefinition.getBeanClassName() + "
        // -> "
        // + beanDefinition.getScope());
        // }
        // }
    }

}
