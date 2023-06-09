# Spring Cloud Alibaba

Github (https://github.com/alibaba/spring-cloud-alibaba)

版本依赖关系 (https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)

```xml
<dependencyManagement>
    <dependencies>
        <!-- Spring Boot版本管理 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>2.3.12.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
        <!-- Spring Cloud Alibaba版本管理 -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>2.2.9.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
        <!-- Spring Cloud 版本管理 -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>Hoxton.SR12</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

# Nacos

官网 (https://nacos.io/zh-cn/index.html)

Github (https://github.com/alibaba/nacos)

项目版本 (https://github.com/alibaba/nacos/releases/tag/2.1.0)

Nacos 快速开始 (https://nacos.io/zh-cn/docs/v2/quickstart/quick-start.html)

## Nacos注册中心

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```

# OpenFeign 

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

# Sentinel

控制台下载地址 (https://github.com/alibaba/Sentinel/releases/tag/1.8.5)

启动控制台命令 (http://127.0.0.1:8858)

```shell
java -Dserver.port=8858 -Dsentinel.dashboard.auth.username=st -Dsentinel.dashboard.auth.password=123456 -jar sentinel-dashboard-1.8.5.jar
```

微服务试用Sentinel

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
</dependency>
```

# Gateway 

官网 (https://spring.io/projects/spring-cloud-gateway)

```xml
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>
<dependency>
  <groupId>com.alibaba.cloud</groupId>
  <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```

