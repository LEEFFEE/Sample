package com.huafei.sample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import cn.huafei.widget.BottomTab;
import cn.huafei.widget.BottomTab.CheckedClickListener;

public class TabBottomActivity extends Activity {

	private BottomTab mBottomTab;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabbottom);
		mBottomTab = (BottomTab) findViewById(R.id.rg_tabs);
		ArrayList<BottomTab.BottomTabBean> tabBeans = new ArrayList<BottomTab.BottomTabBean>();
		int txtColorId = R.color.selector_content_txt_color;
		tabBeans.add(new BottomTab.BottomTabBean("首页", true, R.drawable.selector_content_rb_bg_home, txtColorId));
		tabBeans.add(new BottomTab.BottomTabBean("新闻", false, R.drawable.selector_content_rb_bg_news, txtColorId));
		tabBeans.add(new BottomTab.BottomTabBean("服务", false, R.drawable.selector_content_rb_bg_service, txtColorId));
		tabBeans.add(new BottomTab.BottomTabBean("政务", false, R.drawable.selector_content_rb_bg_govaffairs, txtColorId));
		tabBeans.add(new BottomTab.BottomTabBean("设置", false, R.drawable.selector_content_rb_bg_setting, txtColorId));

		mBottomTab.setData(tabBeans);
		mBottomTab.setCheckedListener(new CheckedClickListener() {
			@Override
			public void onItemClick(RadioButton rButton) {
				System.out.println(rButton.getText());
			}

		});
	}
}
