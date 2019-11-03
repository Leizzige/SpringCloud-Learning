# SpringCloud-Learning
SpringCloud 组件

`server.port` : 当前 Eureka Server 服务端口

`spring.application.name` : 当前服务注册在 Eureka Server 上的名称

`eureka.client.register-with-eureka` : 是否将当前的 Eureka Server 服务作为客户端进行注册

`eureka.instance.prefer-ip-address` : 是否将当前服务的 IP 注册到 Eureka Server

`eureka.client.fetch-fegistry` : 是否获取其他 Eureka Server 服务的数据

`eureka.client.service-url.defaultZone` : 注册中心的访问地址

`zuul.routes.provider` : 给服务提供者 provider 设置映射

`@EnableZuulProxy` : 包含了 `@EnableZuulServer`，设置该类是网关的启动类

`@LoadBalanced` : 声明一个基于 Ribbon 的负载均衡

`feign.hystrix.enabled` : 是否开启熔断器

`management.endpoints.web.exposure.include` : 通过 hystrix.stream 节点来监控数据

`profiles.active` : 配置文件的获取方式，设置为本地启动的方式，而不是通过git

`cloud.config.server.native.search-locations` : 本地配置文件存放的路径，classpath(类路径)和(系统文件路径) file两种 (F:/conf)

`@EnableConfigServer` : 声明配置中心

`cloud.config.uri` : 本地 Config Server 的访问路径

`cloud.config.fail-fase` : 设置客户端优先判断 Config Server 获取是否正常

通过`spring.application.name` 结合`spring.profiles.active`拼接目标配置文件名,configclient-dev.yml,去 Config Server 中查找该文件

`spring.cloud.config.name` : 当前服务注册在 Eureka Server 上的名称,与远程仓库的配置文件名对应

`spring.cloud.config.label` : Git Repository  的分支

`spring.cloud.config.discovery.enabled` : 是否开启 Config 服务发现支持

`spring.cloud.config.discovery.service-id` : 配置中心在 Eureka Server 上注册的名称
