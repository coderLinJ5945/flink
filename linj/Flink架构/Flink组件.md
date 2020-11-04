# Flink组件栈（目前1.11还是中间版本）
## Flink 组件分层结构
1. Deploy部署层：参考：https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/deployment/

	1.1 **Mini-Cluster(idea等编辑器开发使用)**
	
	1.2 **Local-Cluster（本地部署用于测试，包含Flink操作页面）**
	
	1.3 **Standalone Cluster（独立集群，一个master节点，多个work节点）** 
	
	1.4 YARN(基于Hadoop分布式文件系统) 等
	
	1.5 EC2 Cluster
	
2. Core 核心 runtime运行层（Flink优化提交job，编译执行）
	
	2.1 运行层支持java 和scala

3. 优化层：Flink服务端进行的优化

4. API 层（针对开发人员基于Flink开发人员）
	
	4.1 一等公民：Table & SQL API(目前还未完善，可用于学习)
	4.2 DataStream API （目前较完善，推荐使用）
	4.3 DataSet API (弱化放弃)

5. Library 层：CEP(Complex Event Processing)复杂事件处理

6. 多语言层：Python、Java、Scala
	

Flink组件图：
![Image text](https://github.com/coderLinJ5945/flink/blob/release-1.11-me/linj/img/Flink%E6%9E%B6%E6%9E%84/Flink%E7%BB%84%E4%BB%B6%E6%A0%88.jpg)




