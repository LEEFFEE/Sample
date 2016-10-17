package com.huafei.sample;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import cn.huafei.widget.BottomTabHost;
import cn.huafei.widget.BottomTabHost.TabHostBean;

public class BottomTabHostActivity extends FragmentActivity {

	private BottomTabHost mBottomTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bottomtabhost);

		mBottomTabHost = (BottomTabHost) findViewById(R.id.bottomTabHost);
		
		ArrayList<TabHostBean> tabBeans = new ArrayList<TabHostBean>();
		int txtColorId = R.color.selector_content_txt_color;
		tabBeans.add(new TabHostBean("首页", true, R.drawable.selector_content_rb_bg_home, txtColorId,
				BlankFragment.class));
		tabBeans.add(new TabHostBean("新闻", false, R.drawable.selector_content_rb_bg_news, txtColorId,
				BlankFragment.class));
		tabBeans.add(new TabHostBean("服务", false, R.drawable.selector_content_rb_bg_service, txtColorId,
				BlankFragment.class));
		tabBeans.add(new TabHostBean("政务", false, R.drawable.selector_content_rb_bg_govaffairs, txtColorId,
				BlankFragment.class));
		tabBeans.add(new TabHostBean("设置", false, R.drawable.selector_content_rb_bg_setting, txtColorId,
				BlankFragment.class));

		mBottomTabHost.setData(tabBeans,getSupportFragmentManager(),R.id.fl_tabcontent);
		
		
		/*
		 * FragmentManager fragmentManager = getSupportFragmentManager();
		 * fragmentManager.beginTransaction().replace(android.R.id.tabhost, new
		 * BlankFragment()).commitAllowingStateLoss();// 允许状态丢失，防止崩溃
		 */
	}

}
