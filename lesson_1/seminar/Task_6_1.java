package lesson_1.seminar;

// Дан стектрейс ошибки.
// Проанализируйте, предложите возможное место и причину возникновения ошибки
// https://docs.google.com/document/d/197XaW263uG8l88tDhW9cIz05tKfKouNBusKOV0K-uS8/edit
// Dec 14, 2018 1:23:19 PM com.sun.jersey.api.core.servlet.WebAppResourceConfig init
//INFO: Scanning for root resource and provider classes in the Web app resource paths:
//  /WEB-INF/lib
//  /WEB-INF/classes
//Dec 14, 2018 1:23:20 PM com.sun.jersey.server.impl.application.WebApplicationImpl _initiate
//INFO: Initiating Jersey application, version 'Jersey: 1.17.1 02/28/2013 12:47 PM'
//Dec 14, 2018 1:23:20 PM org.apache.catalina.core.ApplicationContext log
//SEVERE: StandardWrapper.Throwable
//java.lang.TypeNotPresentException: Type javax.xml.bind.JAXBContext not present
//	at java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:117)
//	at java.base/sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:125)
//	at java.base/sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
//	at java.base/sun.reflect.generics.visitor.Reifier.reifyTypeArguments(Reifier.java:68)
//	at java.base/sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:138)
//	at java.base/sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
//	at java.base/sun.reflect.generics.repository.ClassRepository.computeSuperInterfaces(ClassRepository.java:117)
//	at java.base/sun.reflect.generics.repository.ClassRepository.getSuperInterfaces(ClassRepository.java:95)
//	at java.base/java.lang.Class.getGenericInterfaces(Class.java:1138)
//	at com.sun.jersey.core.reflection.ReflectionHelper.getClass(ReflectionHelper.java:533)
//	at com.sun.jersey.core.reflection.ReflectionHelper.getClass(ReflectionHelper.java:529)
//	at com.sun.jersey.core.spi.factory.ContextResolverFactory.getParameterizedType(ContextResolverFactory.java:202)
//	at com.sun.jersey.core.spi.factory.ContextResolverFactory.init(ContextResolverFactory.java:89)
//	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
//	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:801)
//	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
//	at org.apache.catalina.startup.Catalina.start(Catalina.java:695)
//	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
//	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:350)
//	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:492)
//Caused by: java.lang.ClassNotFoundException: javax.xml.bind.JAXBContext
//	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1328)
//	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1157)
//	at java.base/java.lang.Class.forName0(Native Method)
//	at java.base/java.lang.Class.forName(Class.java:398)
//	at java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:114)
//	... 59 more

public class Task_6_1 {
}
