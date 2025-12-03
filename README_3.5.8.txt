  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.8)

2025-12-03T14:54:00.382+01:00  INFO 5691 --- [demo] [           main] com.example.demo.DemoApplicationKt       : Starting DemoApplicationKt using Java 21.0.9 with PID 5691 (/home/xan/Documenti/demo/build/classes/kotlin/main started by xan in /home/xan/Documenti/demo)
2025-12-03T14:54:00.384+01:00  INFO 5691 --- [demo] [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
2025-12-03T14:54:00.830+01:00  INFO 5691 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-12-03T14:54:00.853+01:00  INFO 5691 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 19 ms. Found 1 JPA repository interface.
2025-12-03T14:54:01.086+01:00  INFO 5691 --- [demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-12-03T14:54:01.093+01:00  INFO 5691 --- [demo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-12-03T14:54:01.093+01:00  INFO 5691 --- [demo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.49]
2025-12-03T14:54:01.113+01:00  INFO 5691 --- [demo] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-12-03T14:54:01.113+01:00  INFO 5691 --- [demo] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 708 ms
2025-12-03T14:54:01.171+01:00  INFO 5691 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-12-03T14:54:01.255+01:00  INFO 5691 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:31439c4c-f5b8-4707-a43e-be1cbb5986f2 user=SA
2025-12-03T14:54:01.256+01:00  INFO 5691 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-12-03T14:54:01.275+01:00  INFO 5691 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-12-03T14:54:01.299+01:00  INFO 5691 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.36.Final
2025-12-03T14:54:01.314+01:00  INFO 5691 --- [demo] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2025-12-03T14:54:01.438+01:00  INFO 5691 --- [demo] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-12-03T14:54:01.471+01:00  INFO 5691 --- [demo] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
	Database driver: undefined/unknown
	Database version: 2.3.232
	Autocommit mode: undefined/unknown
	Isolation level: undefined/unknown
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2025-12-03T14:54:01.848+01:00  INFO 5691 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2025-12-03T14:54:01.869+01:00  INFO 5691 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-12-03T14:54:02.032+01:00  WARN 5691 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-12-03T14:54:02.299+01:00  INFO 5691 --- [demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-12-03T14:54:02.304+01:00  INFO 5691 --- [demo] [           main] com.example.demo.DemoApplicationKt       : Started DemoApplicationKt in 2.099 seconds (process running for 2.377)
0
2025-12-03T14:54:07.660+01:00  INFO 5691 --- [demo] [ionShutdownHook] o.s.b.w.e.tomcat.GracefulShutdown        : Commencing graceful shutdown. Waiting for active requests to complete
2025-12-03T14:54:07.661+01:00  INFO 5691 --- [demo] [tomcat-shutdown] o.s.b.w.e.tomcat.GracefulShutdown        : Graceful shutdown complete
2025-12-03T14:54:07.663+01:00  INFO 5691 --- [demo] [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-12-03T14:54:07.666+01:00  INFO 5691 --- [demo] [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-12-03T14:54:07.667+01:00  INFO 5691 --- [demo] [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Process finished with exit code 130 (interrupted by signal 2:SIGINT)
