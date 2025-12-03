  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.0)

2025-12-03T14:48:13.868+01:00  INFO 4822 --- [demo] [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 21.0.9 with PID 4822 (/home/xan/Documenti/demo/build/classes/kotlin/main started by xan in /home/xan/Documenti/demo)
2025-12-03T14:48:13.871+01:00  INFO 4822 --- [demo] [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2025-12-03T14:48:14.377+01:00  INFO 4822 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-12-03T14:48:14.396+01:00  INFO 4822 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15 ms. Found 1 JPA repository interface.
2025-12-03T14:48:14.612+01:00  INFO 4822 --- [demo] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2025-12-03T14:48:14.618+01:00  INFO 4822 --- [demo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-12-03T14:48:14.618+01:00  INFO 4822 --- [demo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.14]
2025-12-03T14:48:14.637+01:00  INFO 4822 --- [demo] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 739 ms
2025-12-03T14:48:14.696+01:00  INFO 4822 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-12-03T14:48:14.781+01:00  INFO 4822 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:5d96d904-0bfd-4024-b978-e37a8024d5d1 user=SA
2025-12-03T14:48:14.782+01:00  INFO 4822 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-12-03T14:48:14.796+01:00  INFO 4822 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-12-03T14:48:14.818+01:00  INFO 4822 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 7.1.8.Final
2025-12-03T14:48:15.037+01:00  INFO 4822 --- [demo] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-12-03T14:48:15.076+01:00  INFO 4822 --- [demo] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:h2:mem:5d96d904-0bfd-4024-b978-e37a8024d5d1]
	Database driver: H2 JDBC Driver
	Database dialect: H2Dialect
	Database version: 2.4.240
	Default catalog/schema: 5D96D904-0BFD-4024-B978-E37A8024D5D1/PUBLIC
	Autocommit mode: undefined/unknown
	Isolation level: READ_COMMITTED [default READ_COMMITTED]
	JDBC fetch size: 100
	Pool: DatasourceConnectionProviderImpl
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2025-12-03T14:48:15.495+01:00  INFO 4822 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2025-12-03T14:48:15.520+01:00  INFO 4822 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-12-03T14:48:15.560+01:00  INFO 4822 --- [demo] [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2025-12-03T14:48:15.707+01:00  WARN 4822 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-12-03T14:48:15.950+01:00  INFO 4822 --- [demo] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2025-12-03T14:48:15.953+01:00  INFO 4822 --- [demo] [           main] com.example.demo.DemoApplicationKt       : Started DemoApplicationKt in 2.283 seconds (process running for 2.559)
2025-12-03T14:48:16.093+01:00  INFO 4822 --- [demo] [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-12-03T14:48:16.099+01:00 ERROR 4822 --- [demo] [           main] o.s.boot.SpringApplication               : Application run failed

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

2025-12-03T14:48:16.103+01:00  INFO 4822 --- [demo] [           main] o.s.boot.tomcat.GracefulShutdown         : Commencing graceful shutdown. Waiting for active requests to complete
2025-12-03T14:48:16.104+01:00  INFO 4822 --- [demo] [tomcat-shutdown] o.s.boot.tomcat.GracefulShutdown         : Graceful shutdown complete
2025-12-03T14:48:16.106+01:00  INFO 4822 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-12-03T14:48:16.108+01:00  INFO 4822 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-12-03T14:48:16.109+01:00  INFO 4822 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Process finished with exit code 1
