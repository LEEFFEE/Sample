package com.huafei.sample;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import cn.huafei.androidutils.ColorUtil;
import cn.huafei.androidutils.DrawableUtil;
import cn.huafei.widget.BottomTabHost;
import cn.huafei.widget.GuideView;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GuideView mGuideView = (GuideView) findViewById(R.id.guideView);

		ArrayList<Bitmap> images = new ArrayList<Bitmap>();
		images.add(BitmapFactory.decodeResource(getResources(), R.drawable.guide_1));
		images.add(BitmapFactory.decodeResource(getResources(), R.drawable.guide_2));
		images.add(BitmapFactory.decodeResource(getResources(), R.drawable.guide_3));
		mGuideView.setImages(images);// 设置ViewPager图片列表

		//mGuideView.setNormalPointsBGId(R.drawable.shape_point_gray);// 设置默认形状
		mGuideView.setNormalPointsBGDrawable(DrawableUtil.getGradientDrawable(Color.GRAY, 10));
		//mGuideView.setCurPointBGId(R.drawable.shape_point_red);// 设置滚动圆点背景
		mGuideView.setCurPointBGDrawable(DrawableUtil.getGradientDrawable(Color.RED, 10));// 设置滚动圆点背景
		// 获取button
		Button btnStart = mGuideView.getBtnStart();
		btnStart.setText("进入主页");
		btnStart.setBackgroundDrawable(DrawableUtil.getSelector(Color.RED, Color.WHITE, 8, GradientDrawable.RECTANGLE));
		btnStart.setPadding(10, 10, 10, 10);
		btnStart.setTextColor(ColorUtil.createColorStateList(Color.WHITE, Color.BLACK));
		btnStart.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "进入主页", 0).show();
			}
		});
		mGuideView.bind();
	}

}
