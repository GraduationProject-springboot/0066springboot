# [首页查询更多项目](https://github.com/GraduationProject-springboot) 包安装运行


# 0066springboot中小型医院网站

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV16ia6epENY?p=67)


# 绪论
## 1.1研究背景
随着计算机技术的成熟、普及，现代信息技术革命的迅猛发展,正冲击并进而改变着经济和社会结构。信息化的程度已经成为一个国家，一个企业，一个组织仍至一个人发展的基础和竞争成败的关键。

在实际的生活中，用户都是去医院进行就诊预约挂号，费事费力，效率低下，因此，针对用户对网上预约挂号的高需求，特开发了本基于Spring Boot的中小型医院网站。在互联网的迅速发展下，局域网的普及，为建立中小型医院网站的设计与实现提供了基础条件。中小型医院网站有着无法比拟的优点，网络共享、传播速度快的特点，用户可以随时随地进行预约挂号，取药等，同时医师可及时查看用户挂号预约信息，并可进行开药等，管理员通过计算机后台可对系统相关信息进行管理，大大提高管理的效率，更好的为广大用户服务。
## 1.2设计原则
在开始开发项目之前，必须要先考虑项目的实用性、科学性，以及该项目是否能够真正让用户受益并尽可能的发挥项目的作用。因此，在开发前，通过以下几条原则对项目进行判断：

（1）可行性原则。项目需要保证经济可行性和技术可行性，这包括了项目在浏览端、服务端等方面上的经济和技术上是可以达成的。

（2）适应性原则。项目要保证可维护性和可扩展性，这是每个非短期项目都需要考虑的，并且不论是维护还是扩展，都必须要建立在适应用户的正常需求的基础上。

（3）安全性及保密性原则。要充分保证用户信息的安全性和保密性，不能因为开发上的疏忽，导致用户的信息泄露。

（4）系统工程原则。为了确保项目的整体性，在项目调查、项目分析、项目设计、项目开发的过程中，都需遵从项目工程的方法和步骤逐步进行。

（5）统一规划、分期实施、逐步完善原则。项目开发的过程中，要按照规划、分期实施，特别是要注意在项目开发过程中要有条理，从点到面，一步步完善，不要贪图进度，要循环渐进的对项目进行开发。
## 1.3研究内容
根据基于Spring Boot的中小型医院网站编写的论文主要阐述了基于Spring Boot的中小型医院网站的开发过程中使用的技术，系统开发前进行的需求分析，根据需求文档进行系统设计，最后才是系统功能实现以及测试几个部分，在开始编写论文之前亲自到图书馆借阅Java书籍，MYSQL数据库书籍等编程书籍，然后针对开发的基于Spring Boot的中小型医院网站，去网上查找了很多别人做好的系统，根据他们的功能设计进行自己的系统的系统功能结构设计，出具需求报告，根据形成的需求报告完成系统各个功能模块设计，最后才是进行程序编码，系统完成后才能进行测试和最后的验收工作，程序开发流程大致如此。

这次编写的论文包含了6个部分的内容，具体内容如下：

第一部分绪论：文章主要从课题背景以及设计原则综合阐述了开发此系统的必要性。

第二部分相关技术：系统开发用到的各种技术都大致做出了简介

第三部分系统分析：从可行性分析和功能需求分析等角度综合研究了此次开发的系统

第四部分系统设计：功能模块设计和数据库设计这两部分内容都有专门的表格和图片表示

第五部分系统实现：进行系统主要功能模块的界面展示

第六部分系统测试：检验程序是否达到预期目标


# 2 相关技术简介
## 2.1 Java技术
Java是一种非常常用的编程语言，在全球编程语言排行版上总是前三。在方兴未艾的计算机技术发展历程中，Java的身影无处不在，并且拥有旺盛的生命力。Java的跨平台能力十分强大，只需一次编译，任何地方都可以运行。除此之外，它还拥有简单的语法和实用的类库，让编程人员可以尽可能将精力集中在问题的求解上，并且许多开源项目和科研成果都是采用它实现的。

在1995年这一年的5月份，著名的Sun Microsystems公司在程序开发设计上面郑重推出一种面向对象开发的程序设计语言——Java，最开始的时候Java是由詹姆斯.高斯林这位伟大的JAVA之父来进行主导，但是在后来由于各种原因，让甲骨文公司这个针对商业程序创建了oracle大型数据库的公司收购了Java。Java的平台总共算下来有3个，分别为javaME和javaSE以及javaEE这3个java平台。下面将对其进行分别介绍。

（1）在电脑桌面程序的开发上面需要选择JavaME，这个用得也比较多。

（2）企业也会根据工作以及业务需要开发各种软件，那么就会选用JavcEE这个支持企业版软件的开发的Java平台，JavcEE主攻运用在企业领域上面的web应用，JavcEE也在javaSE的基础上获得了比如jsp技术 ，Servlet技术等程序开发技术的支持。

（3）现在生活中手机的普及化，也使得手机端这样的移动设备的软件的兴起，JavaME这个迷你版java平台就能运用于移动端的软件开发操作。
## 2.2 B/S结构
此次设计的网络结构模式B/S结构（Browser/Server）。B/S架构也称为B/S模式，是一种服务器以及浏览器架构模式。B/S的工作模式都是先由浏览器请求，服务器再响应。B/S体系结构解决了异构系统中的连接难题，大大改善了系统的开放性，让系统的扩展和维护更加简单；同时，B/S体系结构操作也比较容易，界面全都为浏览器模式，容易分发数据的捕获程序。只要安装通用的浏览器（如WWW浏览器）就能通过Web服务器与数据库进行数据交互。此结构的好处之一在于由于它使用的统一的浏览器，使其可以在不同的地方且不需要用专门的软件进行操作，实现了不论你使用怎样的接入网的方式都可以对公共的数据进行调用和浏览。

相对于C/S模式，B/S模式是对C/S模式应用的扩展，B/S模式不用对不同的计算机安装不同应用程序，还有安全性的要求及对模式上手难度都比前者更好。B/S模式可以让客户机的压力大大减轻，工作的负荷被合理的分配了。

![](/md/blog.001.png)

图2-1  B/S模式三层结构图
## 2.3 MYSQL数据库
所谓数据库，实际上就是一个容器，按照数据结构来组织、存储和管理。数据库的作用就是为大量的信息进行管理并提供高效的解决方案。

MySQL是典型的关系数据库系统，拥有开源免费、稳定、高效等特点，一直是中小型web项目的最佳数据库选择。MySQL作为当今IT领域使用人数最多的开源关系型数据库软件之一，在2018年的数据库使用率排名中位居第二，仅次于目前为止最成功的商业版数据库Orcle。MySQL最大的优势之一就是无偿使用，这也是它成功的关键。

MySQL支持标准化数据库查询语言SQL。MySQL是一款非常适合个人开发者或小型组织开发团体的数据库管理系统，因为它是开源并且免费的，体积小、速度快、成本低以及其最重要的一点开放源码，深受程序设计人员的喜爱，这也让它成为了许许多多中小型开发网站数据库的首选，同时提供了多种开发的连接API。MySQL将数据的存放按照记录之间的关系存放到了不同的表中，减少了数据的冗余并且提高了开发的工作效率。MySQL支持开发中需要用的大型数据库，并能处理数以万计的记录。因为MySQL是开源的软件，所以在项目的预算中的时候不用花费额外的资金，大大降低了开发的总体成本，这也是MySQL数据库在中小型企业和独立的开发者中广泛流行的原因。
## 2.4 Spring Boot框架
Spring Boot是一个简化程序设置的拥有开箱即用的框架，它主要的优点是根据程序员不同的设置而生成不同的代码配置文件，这样开发人员就不用每个项目都配置相同的文件，从而减低了开发人员对于传统配置文件的时间，提高了开发效率。它内嵌Tomcat服务器，简化了Maven的配置，自动配置Spring，通过这样的框架，开发人员就不用头疼各种配置文件，可以减少时间，同时提高了代码的整体性，使开发人员工作效率大大提高。

#
# 3 系统分析
## 3.1 可行性分析
通过对本基于Spring Boot的中小型医院网站实行的目的初步调查和分析，提出可行性方案并对其一一进行论证。我们在这里主要从技术可行性、操作可行性、经济可行性和时间可行性四方面进行分析。
### 3.1.1 技术可行性
本基于Spring Boot的中小型医院网站采用Java和MYSQL数据库进行开发设计，作为计算机专业学生，在学校期间就接触到许多关于编程方面的知识，当然也包括各种编程软件，对他们的了解度也比较系统，所以技术开发上面还是有一定把握。
### 3.1.2 操作可行性
本人自己就是学生，程序开发经验不足，在界面设计上面不会设计太复杂，要讲究简单好看，操作上要方便，不能让用户觉得不流畅。用户一旦进入操作界面，界面上就会有相应提示，跟着操作提示就可以找到对应的功能操作模块，对于用户来说免培训就能使用。本系统具有易操作、易管理、交互性好的特点，在操作上是非常简单的。因此本系统可以进行开发。
### 3.1.3 经济可行性
由于自己本身就是学生，还没有正式参加工作，金钱上面一直都处于缺乏状态。所以在开发程序过程中，我是不会花太多经济成本在上面的。针对开发软件和数据库，还有界面设计的photoshop软件等在百度上面就可以直接下载，然后根据各种安装视频进行安装，这些资源都是免费的，程序编码阶段使用的源代码在百度上面可以轻松获得，在有网络的环境下就能下载下来，不需要支付任何费用，经济成本很低。
### 3.1.4 法律可行性
开发的基于Spring Boot的中小型医院网站使用的软件和用到的资料来源都是图书馆、百度文库、百度网页等渠道，并不涉及违法。在个人毕业设计上面，无论源代码还是论文编写内容不存在抄袭行为。

综上所述，基于Spring Boot的中小型医院网站在技术、经济、操作和法律上都具有很高的可行性，开发此程序是很必要的。
## 3.2 系统性能分析
（1）系统的存储性：因为是中小型医院网站，所以就会在数据库要求上比较严格，信息录入的比较多，而且丰富复杂， 这就需要一个强大的数据库来存放更多的数据和保证数据的时时性。

（2）系统的易学性：系统设计的应该简单易学的，设计的各种功能应该简单操作，不需要努力学习培训，缩短用户熟悉系统的进程。

（3）系统的数据要求：数据应该录入准确，需要更新时，数据应该可以及时的修改，数据还应该有独立保存，不能删除数据的时候会连带着把还需要的数据都删除掉。

（4）系统稳定性：开发的基于Spring Boot的中小型医院网站要求运行稳定，运行过程中无界面不清楚、字体模糊等现象。
## 3.3 角色功能分析
本基于Spring Boot的中小型医院网站主要满足了三类角色用户的功能需求，包括管理员、医师和用户，下面将对这三类角色用户分别的实现的功能进行阐述。

（1）角色：医师

医师注册登录后主要功能模块包括个人中心、预约挂号管理、体检报告管理、医师开药管理以及用户取药管理。医师用例图如图3-1所示。

![](/md/blog.002.png)

图3-1 医师用例图

（2）角色：管理员

管理员可登录系统后台对系统进行全面管理操作，管理员主要实现等功能模块包括个人中心、用户管理、医师管理、关于我们管理、科室类型管理、门诊信息管理、药库信息管理、缴费清单管理、药品类型管理以及系统管理。管理员实现了对系统信息的添加、修改和删除的功能。管理员用例图如图3-2所示。

![](/md/blog.003.png)

图3-2 管理员用例图

（3）角色：用户

用户在系统前台可查看系统信息，包括首页、门诊信息、药库信息、系统公告等，用户要想实现选择门诊预约挂号功能，就必须登录系统，没有账号的用户可首先进行注册操作，注册登录后主要功能模块包括个人中心、预约挂号管理、体检报告管理、医师开药管理、用户取药管理、缴费清单管理。用户用例图如图3-3所示。

![](/md/blog.004.png)

图3-3 用户用例图
## 3.4 系统结构分析
### 3.4.1逻辑结构
基于Spring Boot的中小型医院网站的特点就是利用Browser/Server（B/S）结构，为用户提供了一个网络预约挂号的平台，可提高预约挂号效率。

本系统的网络应用原理示意图如图3-4所示：

![](/md/blog.005.png)

图3-4系统的网络应用原理示意图
### 3.4.2物理结构
系统实现的物理结构如图3-5所示：

![](/md/blog.006.png)

图3-5 系统实现的物理结构图
## 3.5 系统流程分析
### 3.5.1注册流程
未有账号的用户可进行注册操作，用户注册流程图如图3-6所示。

![](/md/blog.007.png)

图3-6 注册流程图
### 3.5.2登录流程
登录模块主要满足了管理员、医师和用户的权限登录，用户登录流程图如图3-7所示。

![](/md/blog.008.png)

图3-7 登录流程图
#
# 4 系统设计
## 4.1 系统概要设计
本中小型医院网站采用B/S结构(Browser/Server,浏览器/服务器结构)和JAVA技术，MYSQL数据库存储数据，是一个适用于Internet环境下的模型结构。只要用户能连上Internet,便可以在任何时间、任何地点使用。系统工作原理图如图4-1所示：

![](/md/blog.009.png)

图4-1 系统工作原理图
## 4.2 系统结构设计
在结构设计过程中，首先对系统进行需求分析，然后进行系统初步设计，将系统功能模块细化，具体分析每一个功能模块具体应该首先哪些功能，最后将各个模块进行整合，实现系统结构的最终设计。本基于Spring Boot的中小型医院网站主要实现了用户功能模块、医师功能模块和管理员功能模块三大部分，系统的功能结构设计如图4-2所示。

![](/md/blog.010.png)

图4-2系统结构图
## 4.3 数据库设计
### 4.3.1数据库实体（E-R图）
E-R图是一种描述显示数据类型间的关系的数据描述方法，E-R图可以完整地映射出现实模型的关系。E-R图中的三个最为重要的元素就是实体、属性、关系。E-R图即由这三点组成。

实体：E-R图中数据的实体，用矩形表示上面为实体名，下面为实体属性，实体包含主外键等关系。

属性：E-R图中的属性，是指实体的属性，实体由多条属性所构成，属性拥有自己的数据类型，数据大小。属性的优劣决定了E-R图中实体的健全性、完整性。

关系：E-R图中的关系是指实体之间的关系，用菱形来表示实体间的关系，这些菱形关系的联系上有着一对多或多对多的数据联系，这些构成了E-R图的关系，E-R图的关系紧密连接了实体，使实体间的关联性更加的显著、易懂。本基于Spring Boot的中小型医院网站的E-R图如下所示：

1、缴费清单信息实体E-R图如图4-3所示

![](/md/blog.011.png)

图4-3 缴费清单实体E-R图

2、预约挂号信息实体E-R图如图4-4所示

![](/md/blog.012.png)

图4-4  预约挂号信息实体E-R图

3、医师信息实体E-R图如图4-5所示

![](/md/blog.013.png)

图4-5 医师信息实体E-R图

4、管理员信息实体E-R图如图4-6所示

![](/md/blog.014.png)

图4-6 管理员信息实体E-R图

5、用户信息实体E-R图如图4-7所示

![](/md/blog.015.png)

图4-7 用户信息实体E-R图

5、门诊信息实体E-R图如图4-8所示

![](/md/blog.016.png)

图4-8 门诊信息实体E-R图
### 4.3.2数据库表设计
本基于Spring Boot的中小型医院网站需要后台数据库，本系统采用MYSQL数据库作为数据存储，下面介绍数据库中的各个表的详细信息。

表4-1  jiaofeiqingdan缴费清单信息表

|字段名称|字段意义|字段类型|字段长度|是否主键|能否为空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|编号|bigint|20|是|否|
|addtime|创建时间|timestamp||否|是|
|feiyongbianhao|费用编号|varchar|200|否|是|
|feiyongxiangmu|费用项目|longtext||否|是|
|feiyongjiage|费用价格|int|11|否|是|
|feiyongxiangqing|费用详情|longtext||否|是|
|jianmianjine|减免金额|int|11|否|是|
|jianmianyuanyin|减免原因|longtext||否|是|
|`shifujine|实付金额|varchar|200|否|是|
|zhanghao|账号|varchar|200|否|是|
|xingming|姓名|varchar|200|否|是|
|sfsh|是否审核|varchar|200|否|是|
|`shhf`|审核回复|longtext||否|是|
|`ispay|是否支付|varchar|200|否|是|
表4-2  yuyueguahao预约挂号信息表

|字段名称|字段意义|字段类型|字段长度|是否主键|能否为空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|编号|bigint|20|是|否|
|addtime|创建时间|timestamp||否|是|
|keshibianhao|科室编号|varchar|200|否|是|
|keshileixing|科室类型|varchar|200|否|是|
|yishixingming|医师姓名|varchar|200|否|是|
|`guahaofei|挂号费|varchar|200|否|是|
|guahaoshijian|挂号时间|datetime||否|是|
|beizhu`|备注|longtext||否|是|
|shouji|手机|varchar|200|否|是|
|zhanghao|账号|varchar|200|否|是|
|sfsh|是否审核|varchar|200|否|是|
|`shhf`|审核回复|longtext||否|是|
|`ispay|是否支付|varchar|200|否|是|
表4-3  yishi医师信息表

|字段名称|字段意义|字段类型|字段长度|是否主键|能否为空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|编号|bigint|20|是|否|
|addtime|创建时间|timestamp||否|是|
|yishigonghao|医师工号|varchar|200|否|是|
|mima|密码|varchar|200|否|是|
|`yishixingming`|医师姓名|varchar|200|否|是|
|`xingbie|性别|varchar|200|否|是|
|zhicheng`|职称|varchar|200|否|是|
|shouji|手机|varchar|200|否|是|
|`youxiang|邮箱|varchar|200|否|是|
|shenfenzheng|身份证|varchar|200|否|是|
|tupian|图片|varchar|200|否|是|
表4-4  users`管理员信息表 

|字段名称|字段意义|字段类型|字段长度|是否主键|能否为空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|编号|bigint|20|是|否|
|username`|用户名|varchar|100|否|是|
|password|密码|varchar|100|否|是|
|role`|角色|varchar|100|否|是|
|addtime|新增时间|timestamp||否|是|
表4-5  yonghu用户信息表 

|字段名称|字段意义|字段类型|字段长度|是否主键|能否为空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|编号|bigint|20|是|否|
|addtime|创建时间|timestamp||否|是|
|zhanghao|账号|varchar|200|否|是|
|mima|密码|varchar|200|否|是|
|xingming|姓名|varchar|200|否|是|
|xingbie|性别|varchar|200|否|是|
|shouji`|手机|varchar|200|否|是|
|youxiang|邮箱|varchar|200|否|是|
|shenfenzheng|身份证|varchar|200|否|是|
表4-6  menzhenxinxi门诊信息表 

|字段名称|字段意义|字段类型|字段长度|是否主键|能否为空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|id|编号|bigint|20|是|否|
|addtime|创建时间|timestamp||否|是|
|keshibianhao|科室编号|varchar|200|否|是|
|keshileixing|科室类型|varchar|200|否|是|
|yishixingming|医师姓名|longtext||否|是|
|zhicheng|职称|varchar|200|否|是|
|zhuanyetezhang|专业特长|longtext||否|是|
|guahaofei|挂号费|int|11|否|是|
|xiangqing|详情|longtext||否|是|
|zhibanbiao|值班表|longtext||否|是|
|tupian|图片|varchar|200|否|是|
#


# 5 系统实现
## 5.1 用户功能模块的实现
用户进入本系统可查看系统信息，包括首页、门诊信息、药库信息以及系统公告信息等，系统前台主界面展示如图5-1所示。

![](/md/blog.017.png)

图5-1系统前台主界面图
### 5.1.1用户登录界面
用户要想实现预约挂号功能，必须登录系统，在登录界面输入正确的登录账号和密码点击登录按钮进行登录，系统会对用户输入的登录信息进行验证，信息正确则登录成功，反之登录失败，用户登录界面展示如图5-2所示。

![](/md/blog.018.png)

图5-2 用户登录界面图
### 5.1.2用户注册界面
没有账号的用户可进行注册操作，用户注册界面展示如图5-3所示。

![](/md/blog.019.png)

图5-3 用户注册界面图
### 5.1.3门诊信息详情界面
用户可选择门诊查看详情信息，登录后可进行预约挂号操作，门诊信息详情界面展示如图5-4所示。

![](/md/blog.020.png)

图5-4 门诊信息详情界面图
### 5.1.4预约挂号界面
用户在预约挂号时需要填写相关数据，预约挂号界面展示如图5-5所示。

![](/md/blog.021.png)

图5-5  预约挂号界面图
### 5.1.5药品详情界面
用户可选择药品查看详情信息，登录后可进行取药操作，药品详情展示如图5-6所示。

![](/md/blog.022.png)

图5-6  药品详情界面图
### 5.1.6体检报告界面
用户可查看个人体检报告信息，体检报告界面展示如图5-7所示。

![](/md/blog.023.png)

图5-7 体检报告界面图
## 5.2 管理员功能模块的实现
### 5.2.1管理员登录界面
管理员要想进入系统后台对系统进行管理操作，必须登录系统后台，管理员登录界面展示如图5-8所示。

![](/md/blog.024.png)

图5-8 管理员登录界面图
### 5.2.2用户管理界面
管理员可增删改查用户信息，用户管理界面展示如图5-9所示。

![](/md/blog.025.png)

图5-9 用户管理界面图
### 5.2.3医师管理界面
管理员可查看医师信息，并可对其进行修改和删除操作，同时也可添加医师信息，医师管理界面展示如图5-10所示。

![](/md/blog.026.png)

图5-10 医师管理界面图
### 5.2.4科室类型管理界面
管理员可增删改查科室类型信息，科室类型管理界面展示如图5-11所示。

![](/md/blog.027.png)

图5-11 科室类型管理界面图
### 5.2.5门诊信息管理界面
管理员可查看所有门诊信息，并可对其进行修改和删除操作，也可添加门诊信息，门诊信息管理界面展示如图5-12所示。

![](/md/blog.028.png)

图5-12 门诊信息管理界面图
### 5.2.6药库信息管理界面
管理员能够增删改查药库信息，药库信息管理界面展示如图5-13所示。

![](/md/blog.029.png)

图5-13  药库信息管理界面图
## 5.3 医师功能模块的实现
### 5.3.1预约挂号管理界面
医师登录后可查看用户预约挂号信息，并可对其进审核和查看结果操作，预约挂号管理界面展示如图5-14所示。

![](/md/blog.030.png)

图5-14 预约挂号管理界面图
### 5.3.2体检报告管理界面
医师可增删改查体检报告信息，并可进行添加药方信息，体检报告管理界面展示如图5-15所示。

![](/md/blog.031.png)

图5-15 体检报告管理界面图

#
# 系统










