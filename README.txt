  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.0)

2025-12-03T16:36:35.271+01:00  INFO 6499 --- [demo] [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 21.0.9 with PID 6499 (/home/xan/Documenti/demo/build/classes/kotlin/main started by xan in /home/xan/Documenti/demo)
2025-12-03T16:36:35.274+01:00  INFO 6499 --- [demo] [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2025-12-03T16:36:35.747+01:00  INFO 6499 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-12-03T16:36:35.766+01:00  INFO 6499 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15 ms. Found 1 JPA repository interface.
2025-12-03T16:36:35.976+01:00  INFO 6499 --- [demo] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2025-12-03T16:36:35.983+01:00  INFO 6499 --- [demo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-12-03T16:36:35.983+01:00  INFO 6499 --- [demo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.14]
2025-12-03T16:36:36.004+01:00  INFO 6499 --- [demo] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 705 ms
2025-12-03T16:36:36.013+01:00 DEBUG 6499 --- [demo] [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping filters: characterEncodingFilter urls=[/*] order=-2147483648, formContentFilter urls=[/*] order=-9900, requestContextFilter urls=[/*] order=-105
2025-12-03T16:36:36.013+01:00 DEBUG 6499 --- [demo] [           main] o.s.b.w.s.ServletContextInitializerBeans : Mapping servlets: dispatcherServlet urls=[/]
2025-12-03T16:36:36.067+01:00  INFO 6499 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-12-03T16:36:36.153+01:00  INFO 6499 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:4a3fc927-eaff-4ac3-a8ca-c3c8982f03b2 user=SA
2025-12-03T16:36:36.154+01:00  INFO 6499 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-12-03T16:36:36.169+01:00  INFO 6499 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-12-03T16:36:36.191+01:00  INFO 6499 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 7.1.8.Final
2025-12-03T16:36:36.416+01:00  INFO 6499 --- [demo] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-12-03T16:36:36.456+01:00  INFO 6499 --- [demo] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:h2:mem:4a3fc927-eaff-4ac3-a8ca-c3c8982f03b2]
	Database driver: H2 JDBC Driver
	Database dialect: H2Dialect
	Database version: 2.4.240
	Default catalog/schema: 4A3FC927-EAFF-4AC3-A8CA-C3C8982F03B2/PUBLIC
	Autocommit mode: undefined/unknown
	Isolation level: READ_COMMITTED [default READ_COMMITTED]
	JDBC fetch size: 100
	Pool: DatasourceConnectionProviderImpl
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2025-12-03T16:36:36.806+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create global temporary table HTE_a(rn_ integer not null, b_id bigint, id bigint, primary key (rn_)) transactional
2025-12-03T16:36:36.809+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create global temporary table HTE_b(rn_ integer not null, c_id bigint, id bigint, primary key (rn_)) transactional
2025-12-03T16:36:36.809+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create global temporary table HTE_c(rn_ integer not null, id bigint, primary key (rn_)) transactional
2025-12-03T16:36:36.876+01:00  INFO 6499 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2025-12-03T16:36:36.884+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop table if exists a cascade
2025-12-03T16:36:36.885+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop table if exists b cascade
2025-12-03T16:36:36.885+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop table if exists c cascade
2025-12-03T16:36:36.885+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop sequence if exists a_seq
2025-12-03T16:36:36.885+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop sequence if exists b_seq
2025-12-03T16:36:36.886+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop sequence if exists c_seq
2025-12-03T16:36:36.888+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create sequence a_seq start with 1 increment by 50
2025-12-03T16:36:36.889+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create sequence b_seq start with 1 increment by 50
2025-12-03T16:36:36.889+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create sequence c_seq start with 1 increment by 50
2025-12-03T16:36:36.891+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create table a (b_id bigint, id bigint not null, primary key (id))
2025-12-03T16:36:36.891+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create table b (c_id bigint, id bigint not null, primary key (id))
2025-12-03T16:36:36.892+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : create table c (id bigint not null, primary key (id))
2025-12-03T16:36:36.892+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : alter table if exists a add constraint FKh2icx52jhor7siuxpgqqki6bi foreign key (b_id) references b
2025-12-03T16:36:36.899+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : alter table if exists b add constraint FKsy66o41hbsococag8m1sgeclh foreign key (c_id) references c
2025-12-03T16:36:36.902+01:00  INFO 6499 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-12-03T16:36:36.942+01:00  INFO 6499 --- [demo] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2025-12-03T16:36:37.095+01:00  WARN 6499 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-12-03T16:36:37.194+01:00 DEBUG 6499 --- [demo] [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 2 mappings in 'requestMappingHandlerMapping'
2025-12-03T16:36:37.205+01:00 DEBUG 6499 --- [demo] [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2025-12-03T16:36:37.218+01:00 DEBUG 6499 --- [demo] [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2025-12-03T16:36:37.237+01:00 DEBUG 6499 --- [demo] [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 1 @ExceptionHandler, 1 ResponseBodyAdvice
2025-12-03T16:36:37.250+01:00 DEBUG 6499 --- [demo] [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 1 @ExceptionHandler, 0 ResponseBodyAdvice
2025-12-03T16:36:37.341+01:00  INFO 6499 --- [demo] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2025-12-03T16:36:37.344+01:00  INFO 6499 --- [demo] [           main] com.example.demo.DemoApplicationKt       : Started DemoApplicationKt in 2.257 seconds (process running for 2.541)
2025-12-03T16:36:37.488+01:00  INFO 6499 --- [demo] [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-12-03T16:36:37.494+01:00 ERROR 6499 --- [demo] [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.data.jpa.repository.query.BadJpqlGrammarException: org.hibernate.query.PathException: Plural path 'com.example.demo.C(c).bbb' refers to a collection and so element attribute 'aaa' may not be referenced directly (use element() function); Bad SELECT c FROM C c WHERE c.bbb.aaa IS NOT EMPTY grammar [JPQL]
	at org.springframework.data.jpa.repository.query.PartTreeJpaQuery$QueryPreparer.createQuery(PartTreeJpaQuery.java:239) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.doCreateQuery(PartTreeJpaQuery.java:122) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.jpa.repository.query.AbstractJpaQuery.createQuery(AbstractJpaQuery.java:264) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.jpa.repository.query.JpaQueryExecution$CollectionExecution.doExecute(JpaQueryExecution.java:132) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.jpa.repository.query.JpaQueryExecution.execute(JpaQueryExecution.java:99) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.jpa.repository.query.AbstractJpaQuery.doExecute(AbstractJpaQuery.java:164) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.jpa.repository.query.AbstractJpaQuery.execute(AbstractJpaQuery.java:154) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:169) ~[spring-data-commons-4.0.0.jar:4.0.0]
	at org.springframework.data.repository.core.support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:158) ~[spring-data-commons-4.0.0.jar:4.0.0]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:167) ~[spring-data-commons-4.0.0.jar:4.0.0]
	at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:146) ~[spring-data-commons-4.0.0.jar:4.0.0]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.1.jar:7.0.1]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:370) ~[spring-tx-7.0.1.jar:7.0.1]
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:118) ~[spring-tx-7.0.1.jar:7.0.1]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.1.jar:7.0.1]
	at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:135) ~[spring-tx-7.0.1.jar:7.0.1]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.1.jar:7.0.1]
	at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:137) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.1.jar:7.0.1]
	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:222) ~[spring-aop-7.0.1.jar:7.0.1]
	at jdk.proxy2/jdk.proxy2.$Proxy130.findAllByBbbAaaNotEmpty(Unknown Source) ~[na:na]
	at com.example.demo.DemoApplication.applicationRunner$lambda$0(DemoApplication.kt:14) ~[main/:na]
	at org.springframework.boot.SpringApplication.lambda$callRunner$0(SpringApplication.java:797) ~[spring-boot-4.0.0.jar:4.0.0]
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82) ~[spring-core-7.0.1.jar:7.0.1]
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60) ~[spring-core-7.0.1.jar:7.0.1]
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86) ~[spring-core-7.0.1.jar:7.0.1]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:809) ~[spring-boot-4.0.0.jar:4.0.0]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:797) ~[spring-boot-4.0.0.jar:4.0.0]
	at org.springframework.boot.SpringApplication.lambda$callRunners$0(SpringApplication.java:785) ~[spring-boot-4.0.0.jar:4.0.0]
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184) ~[na:na]
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151) ~[na:na]
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:785) ~[spring-boot-4.0.0.jar:4.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:328) ~[spring-boot-4.0.0.jar:4.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1374) ~[spring-boot-4.0.0.jar:4.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1363) ~[spring-boot-4.0.0.jar:4.0.0]
	at com.example.demo.DemoApplicationKt.main(DemoApplication.kt:22) ~[main/:na]
Caused by: java.lang.IllegalArgumentException: org.hibernate.query.PathException: Plural path 'com.example.demo.C(c).bbb' refers to a collection and so element attribute 'aaa' may not be referenced directly (use element() function)
	at org.hibernate.internal.ExceptionConverterImpl.convert(ExceptionConverterImpl.java:126) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.ExceptionConverterImpl.convert(ExceptionConverterImpl.java:155) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.ExceptionConverterImpl.convert(ExceptionConverterImpl.java:161) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:936) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:845) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:139) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.orm.jpa.ExtendedEntityManagerCreator$ExtendedEntityManagerInvocationHandler.invoke(ExtendedEntityManagerCreator.java:362) ~[spring-orm-7.0.1.jar:7.0.1]
	at jdk.proxy2/jdk.proxy2.$Proxy124.createQuery(Unknown Source) ~[na:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:317) ~[spring-orm-7.0.1.jar:7.0.1]
	at jdk.proxy2/jdk.proxy2.$Proxy124.createQuery(Unknown Source) ~[na:na]
	at org.springframework.data.jpa.repository.query.PartTreeJpaQuery$QueryPreparer.createQuery(PartTreeJpaQuery.java:237) ~[spring-data-jpa-4.0.0.jar:4.0.0]
	... 41 common frames omitted
Caused by: org.hibernate.query.PathException: Plural path 'com.example.demo.C(c).bbb' refers to a collection and so element attribute 'aaa' may not be referenced directly (use element() function)
	at org.hibernate.query.sqm.tree.domain.SqmPluralValuedSimplePath.resolvePathPart(SqmPluralValuedSimplePath.java:99) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.DomainPathPart.resolvePathPart(DomainPathPart.java:39) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.BasicDotIdentifierConsumer.consumeIdentifier(BasicDotIdentifierConsumer.java:90) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitSimplePath(SemanticQueryBuilder.java:5845) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitGeneralPathFragment(SemanticQueryBuilder.java:5700) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitGeneralPathExpression(SemanticQueryBuilder.java:1851) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.grammars.hql.HqlParser$GeneralPathExpressionContext.accept(HqlParser.java:7836) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visitChildren(AbstractParseTreeVisitor.java:46) ~[antlr4-runtime-4.13.2.jar:4.13.2]
	at org.hibernate.grammars.hql.HqlParserBaseVisitor.visitBarePrimaryExpression(HqlParserBaseVisitor.java:761) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.grammars.hql.HqlParser$BarePrimaryExpressionContext.accept(HqlParser.java:7285) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitUnaryIsPredicate(SemanticQueryBuilder.java:2445) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitUnaryIsPredicate(SemanticQueryBuilder.java:259) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.grammars.hql.HqlParser$UnaryIsPredicateContext.accept(HqlParser.java:6244) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitWhereClause(SemanticQueryBuilder.java:2373) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitWhereClause(SemanticQueryBuilder.java:259) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.grammars.hql.HqlParser$WhereClauseContext.accept(HqlParser.java:6146) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitQuery(SemanticQueryBuilder.java:1192) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitQuerySpecExpression(SemanticQueryBuilder.java:982) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitQuerySpecExpression(SemanticQueryBuilder.java:259) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.grammars.hql.HqlParser$QuerySpecExpressionContext.accept(HqlParser.java:2113) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitQueryExpression(SemanticQueryBuilder.java:1012) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitQueryExpression(SemanticQueryBuilder.java:259) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.grammars.hql.HqlParser$QueryExpressionContext.accept(HqlParser.java:2003) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitSelectStatement(SemanticQueryBuilder.java:483) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.visitStatement(SemanticQueryBuilder.java:442) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.SemanticQueryBuilder.buildSemanticModel(SemanticQueryBuilder.java:304) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.hql.internal.StandardHqlTranslator.translate(StandardHqlTranslator.java:64) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.internal.QueryInterpretationCacheStandardImpl.createHqlInterpretation(QueryInterpretationCacheStandardImpl.java:166) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.internal.QueryInterpretationCacheStandardImpl.resolveHqlInterpretation(QueryInterpretationCacheStandardImpl.java:148) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.query.spi.QueryEngine.interpretHql(QueryEngine.java:61) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.interpretHql(AbstractSharedSessionContract.java:877) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	at org.hibernate.internal.AbstractSharedSessionContract.createQuery(AbstractSharedSessionContract.java:928) ~[hibernate-core-7.1.8.Final.jar:7.1.8.Final]
	... 52 common frames omitted

2025-12-03T16:36:37.498+01:00  INFO 6499 --- [demo] [           main] o.s.boot.tomcat.GracefulShutdown         : Commencing graceful shutdown. Waiting for active requests to complete
2025-12-03T16:36:37.499+01:00  INFO 6499 --- [demo] [tomcat-shutdown] o.s.boot.tomcat.GracefulShutdown         : Graceful shutdown complete
2025-12-03T16:36:37.501+01:00  INFO 6499 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-12-03T16:36:37.501+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop table if exists a cascade
2025-12-03T16:36:37.502+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop table if exists b cascade
2025-12-03T16:36:37.502+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop table if exists c cascade
2025-12-03T16:36:37.502+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop sequence if exists a_seq
2025-12-03T16:36:37.503+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop sequence if exists b_seq
2025-12-03T16:36:37.503+01:00 DEBUG 6499 --- [demo] [           main] org.hibernate.SQL                        : drop sequence if exists c_seq
2025-12-03T16:36:37.504+01:00  INFO 6499 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-12-03T16:36:37.505+01:00  INFO 6499 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Process finished with exit code 1
