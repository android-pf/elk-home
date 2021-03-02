package com.pf.module_home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pf.export_home.HomeARS;

import com.pf.export_home.router.HomeRouter;

@Route(path = HomeRouter.HOME_HOMEACT)
public class HomeActivity extends AppCompatActivity {
    BottomNavigationView mBtNaview;
    Fragment tabFragment = null, tab1Fragment = null, tab2Fragment = null, tab3Fragment = null, tab4Fragment = null, tab5Fragment = null;
    FragmentTransaction transaction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_home);
        mBtNaview = findViewById(R.id.home_tab_nav_view);

        FragmentManager manager = getSupportFragmentManager();
        setCurrentItem(manager, tab1Fragment, HomeRouter.HOME_TAB1FM);
        mBtNaview.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.navigation_home) {
                setCurrentItem(manager, tab1Fragment, HomeRouter.HOME_TAB1FM);
            } else if (itemId == R.id.navigation_live) {
                setCurrentItem(manager, tab2Fragment, HomeRouter.HOME_TAB2FM);
            } else if (itemId == R.id.navigation_task) {
                setCurrentItem(manager, tab3Fragment, HomeRouter.HOME_TAB1FM);
            } else if (itemId == R.id.navigation_push) {
                setCurrentItem(manager, tab4Fragment, HomeRouter.HOME_TAB2FM);
            } else if (itemId == R.id.navigation_mine) {
                setCurrentItem(manager, tab5Fragment, HomeRouter.HOME_TAB1FM);
            }
            return true;
        });


//        //跳转页面1
//        findViewById(R.id.tv_page_name1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ARouter.getInstance()
//                        .build("/login/LoginActivity")
//                        .withString("key1", "param1")//携带参数1
//                        .withString("key2", "param2")//携带参数2
//                        .navigation();
////                CartServiceUtil.navigateCartPage("param1", "param1");
//            }
//        });
//
//        //跳转页面1
//        findViewById(R.id.tv_page_name2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ARouter.getInstance()
//                        .build("/login/LoginActivity")
//                        .withString("key1", "param3")//携带参数1
//                        .withString("key2", "param4")//携带参数2
//                        .navigation();
//
////                CartServiceUtil.navigateCartPage("param1", "param1");
//            }
//        });
    }

    private void setCurrentItem(FragmentManager manager, Fragment tempFragment, String target) {
        transaction = null;
        tabFragment = null;
        transaction = manager.beginTransaction();
        if (tempFragment == null) {
            tempFragment = (Fragment) ARouter.getInstance().build(target).navigation();
        }
        tabFragment = tempFragment;
        transaction.add(R.id.home_tab_fragment, tabFragment, "tag");
        transaction.commit();
    }
}
