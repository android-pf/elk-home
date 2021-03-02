package com.pf.export_home.router;

/**
 * 购物车组件路由表
 * 即 购物车组件中 所有可以从外部跳转的页面 的路由信息
 *
 * @author hufeiyang
 */
public interface HomeRouter {

    /**
     * act
     */
    String HOME_HOMEACT = "/home/HomeActivity";
    String HOME_GUIDEACT = "/home/GuideActivity";

    /**
     * fragment
     */
    String HOME_TAB1FM = "/home/Tab1Fragment";
    String HOME_TAB2FM = "/home/Tab2Fragment";
//    String HOME_FRAGMENT = "/home/LoginFragment";


    /**
     * 购物车服务
     */
    String HOME_SERVICE = "/home/service";
}
