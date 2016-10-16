package com.huafei.sample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	private RadioGroup mRadioGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRadioGroup = (RadioGroup) findViewById(R.id.rg_tabs);
		ArrayList<TabInfo> tabInfos = new ArrayList<MainActivity.TabInfo>();
		tabInfos.add(new TabInfo("首页", true, R.drawable.selector_content_rb_bg_home));
		tabInfos.add(new TabInfo("新闻", false, R.drawable.selector_content_rb_bg_news));
		tabInfos.add(new TabInfo("服务", false, R.drawable.selector_content_rb_bg_service));
		tabInfos.add(new TabInfo("政务", false, R.drawable.selector_content_rb_bg_govaffairs));
		tabInfos.add(new TabInfo("设置", false, R.drawable.selector_content_rb_bg_setting));

		RadioButton radioButton = null;
		for (TabInfo tabInfo : tabInfos) {
			radioButton = (RadioButton) View.inflate(getApplicationContext(), R.layout.view_radiobutton, mRadioGroup);
			radioButton.setText(tabInfo.title);
			radioButton.setSelected(false);
			radioButton.setCompoundDrawablesWithIntrinsicBounds(0, tabInfo.drawableTopId, 0, 0);
			//radioButton.setCompoundDrawablesRelativeWithIntrinsicBounds(0, tabInfo.drawableTopId, 0, 0);
		}
	}

	class TabInfo {
		String title;// tab标题
		boolean checked;// 是否选中
		int drawableTopId;// 资源选择器

		public TabInfo(String title, boolean checked, int drawableTopId) {
			super();
			this.title = title;
			this.checked = checked;
			this.drawableTopId = drawableTopId;
		}

	}
	// <RadioButton
	// android:id="@+id/rb_content_home"
	// android:checked="true"
	// style="@style/style_bottom_tab"
	// android:drawableTop="@drawable/selector_content_rb_bg_home"
	// android:text="首页" />
	// <RadioButton
	// android:id="@+id/rb_content_news"
	// style="@style/style_bottom_tab"
	// android:drawableTop="@drawable/selector_content_rb_bg_news"
	// android:text="新闻" />
	// <RadioButton
	// android:id="@+id/rb_content_service"
	// style="@style/style_bottom_tab"
	// android:drawableTop="@drawable/selector_content_rb_bg_service"
	// android:text="服务" />
	// <RadioButton
	// android:id="@+id/rb_content_govaffairs"
	// style="@style/style_bottom_tab"
	// android:drawableTop="@drawable/selector_content_rb_bg_govaffairs"
	// android:text="政务" />
	// <RadioButton
	// android:id="@+id/rb_content_setting"
	// style="@style/style_bottom_tab"
	// android:drawableTop="@drawable/selector_content_rb_bg_setting"
	// android:text="设置" />

}
