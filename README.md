# jspwebdemo

介绍：本仓库只是j2ee相关技术的串联，类似hello的实现。主要涉及到springboot、grpc、springdata jpa、jsp、h5、js、tomcat、mysql等相关技术。
包含jspweb和fullservice两个独立的工程。

jspweb：简单的基于springboot的web框架

fullservice：在jspweb的基础上引申，包含web api和rpc的微服务框架demo。

接下来待完善的工作：
1、由于grpc本身实现不包含分布式扩展，所以后续加入基于etcd服务治理相关技术，以便实现分布式扩展
2、web服务也不支持分布式部署，后续可添加基于keepalived、LVS等横向扩展技术。
