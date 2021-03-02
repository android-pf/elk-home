package com.pf.export_home;

import com.alibaba.android.arouter.launcher.ARouter;
import com.pf.export_home.bean.HomeData;
import com.pf.export_home.router.HomeRouter;
import com.pf.export_home.service.IHomeService;

/**
 * 购物车组件服务工具类
 * 其他组件直接使用此类即可：页面跳转、获取服务。
 *
 * @author hufeiyang
 */
public class HomeARS {

    /**
     * 跳转到 Home 页面
     *
     * @param param1
     * @param param2
     */
    public static void navHome(String param1, String param2) {
        ARouter.getInstance()
                .build(HomeRouter.HOME_HOMEACT)
                .withString("key1", param1)
                .withString("key2", param2)
                .navigation();
    }

    /**
     * 跳转到 Guide 页面
     *
     * @param param1
     * @param param2
     */
    public static void navGuide(String param1, String param2) {
        ARouter.getInstance()
                .build(HomeRouter.HOME_GUIDEACT)
                .withString("key1", param1)
                .withString("key2", param2)
                .navigation();
    }

    /**
     * 获取服务
     *
     * @return
     */
    public static IHomeService getService() {
        return (IHomeService) ARouter.getInstance().build(HomeRouter.HOME_SERVICE).navigation();
    }

    /**
     * 获取 数量
     *
     * @return
     */
    public static HomeData getCartProductCount() {
        return getService().getProductCountInCart();
    }

}
