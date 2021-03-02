package com.pf.export_home.service;


import com.alibaba.android.arouter.facade.template.IProvider;
import com.pf.export_home.bean.HomeData;

/**
 * 组件对外暴露的服务
 */
public interface IHomeService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    HomeData getProductCountInCart();
}
