# GeniusAI智能分析平台
### 后端代码地址：https://github.com/littlefat18/geniusBI
### 上线域名：部署中~
基于 Spring Boot + MQ + AIGC（+ React）的智能数据分析平台。区别于传统 BI，用户只需要导入原始数据集、并输入分析诉求，就能自动生成可视化图表及分析结论，实现数据分析的降本增效（或者降低数据分析的人工成本、提高数据分析效率等）。
1. 定义Prompt预设模板并且封装用户的输入数据以及分析诉求，通过对接AIGC接口生成可视化图表json
配置和分析结论，返回给前端渲染成图表。
2. 由于 AIGC 的输入 Token 限制，使用 Easy Excel 解析用户上传的 XLSX 表格数据文件并压缩为 CSV，
实测提高了 20% 的单次输入数据量、并节约了成本。
3. 由于 AIGC 的响应时间较长，基于自定义 IO 密集型线程池+ 任务队列实现了 AIGC 的并发执行和异步
化，提交任务后即可响应前端，提高用户体验。后续经过优化引入rabbitMQ实现了异步处理请求，并且
加入死信队列来处理异常，提高可靠性。

![image](https://github.com/littlefat18/geniusBI/assets/82098994/59b3abde-8ca1-4119-bcc7-8b28736f1af2)
![image](https://github.com/littlefat18/geniusBI/assets/82098994/5513250b-619a-4294-84d0-82a17fb798d0)
