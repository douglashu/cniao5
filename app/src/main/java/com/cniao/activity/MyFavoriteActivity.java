package com.cniao.activity;

import android.view.View;

import com.cniao.R;
import com.cniao.widget.CNiaoToolBar;

import butterknife.BindView;

/**
 * Created by 高磊华
 * Time  2017/8/21
 * Describe: 我的收藏
 */

public class MyFavoriteActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    CNiaoToolBar mToolBar;

    @Override
    protected int getContentResourseId() {
        return R.layout.activity_myfavorite;
    }


    @Override
    protected void init() {
        initToolBar();
    }

    /**
     * 关于标题栏的操作
     */
    private void initToolBar() {

        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyFavoriteActivity.this.finish();
            }
        });

    }


}
