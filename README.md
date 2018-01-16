# maven_takeout
本系统主要用于对外卖系统做一个全方位设计
项目通过springmvc分模型实现。数据库定义8个表，包括商店、用户、门店员、快递员、订单等实体信息。其中订单实体围绕整个外卖服务的体系中。
项目分为三种权限登陆，包括用户、门店员、快递员登陆。用户可以查看各个商店的商品信息并生成订单；门店员可以上传与下架自己所在店铺的商品信息，并接受与处理订单信息。
快递员可以接受订单信息并将商品送达。
项目未实现web层模块，只提供针对不同权限的服务接口，也就是maven_api模块，使用者在clone此代码时需要在web层加入api与service依赖即可正常调用。
说明：项目完整版在git feature分支下
