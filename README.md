# Spring Cloud Alibaba

Github [转跳](https://github.com/alibaba/spring-cloud-alibaba)

版本依赖关系 [查看详情](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)

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

官网 [转跳](https://nacos.io/zh-cn/index.html)

Github [转跳](https://github.com/alibaba/nacos)

项目版本 [转跳](https://github.com/alibaba/nacos/releases/tag/2.1.0)

Nacos 快速开始 [查看详情](https://nacos.io/zh-cn/docs/v2/quickstart/quick-start.html)