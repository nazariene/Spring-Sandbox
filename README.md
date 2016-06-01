# SpringTest
Spring sandbox project


Autowiring:
1) First looks by type
2) If multiple - then by name
3) Then - by qualifier. Can set a qualifier in 2 places: 1 - in configuration, inside the bean itself. 2 - on setter. 
4) Inheritance counts! If specified "autowire by Type" - and there are 2 beans of the same hierarchy - we'll get an exception when wiring 

5) Have to add ...PostProcessors to beans to process annotations, such as "Autowired, Required" etc
For example:     <bean class="org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor"/>
OR add <context:annotation-config/> to add all of them

6) @Resource annotation makes dependency injection by Name
-----
Components
1) Add @Component on a class to make it a bean with name = className. 
Restrictions - only 1 declaration available.

2) Add <context:component-scan base-package="..."/> to add @Component beans into configuration

-----






