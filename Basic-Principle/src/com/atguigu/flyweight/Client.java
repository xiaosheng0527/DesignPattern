package com.atguigu.flyweight;

/**
 * @author shengxiao
 * @date 2021/9/21 20:09
 */
public class Client {

    // 注意：我么这是以单线程为例来讨论的
    // 一般享元模式 是使用在 连接池中，即 连接池中存放相同类型的对象，
    // 而并不是我们这里的HashMap集合中，存放多种类型的对象。但我们可以将这作为一个思想，来
    // 说明 相同类型的对象 是 可以进行共享的，而并非要重复new出来。
    public static void main(String[] args) {

        // 创建一个工厂
        WebSiteFactory factory = new WebSiteFactory() ;

        // 客户要一个以新闻形式发布的网站
        Website website1 = factory.getWebSiteCategory("新闻") ;


        website1.use(new User("tom"));

        // 客户要一个以博客形式发布的网站
        Website website2 = factory.getWebSiteCategory("博客") ;

        website2.use(new User("jack"));

        // 客户要一个以博客形式发布的网站
        Website website3 = factory.getWebSiteCategory("新闻") ;

        website3.use(new User("smith"));

        // 客户要一个以新闻形式发布的网站
        Website website4 = factory.getWebSiteCategory("新闻") ;

        website4.use(new User("king"));

        System.out.println("网站的分类共" + factory.getWebSiteCount());
    }
}
