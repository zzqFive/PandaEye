package com.pandaq.pandaeye.modules.video.videodetail.mvp;

import com.pandaq.pandaeye.modules.ImpBasePresenter;
import com.pandaq.pandaeye.modules.ImpBaseView;
import com.pandaq.pandaqlib.magicrecyclerView.BaseItem;

import java.util.ArrayList;

/**
 * Created by PandaQ on 2017/4/12.
 * 767807368@qq.com
 */

public interface VideoCommentContract {
    interface View extends ImpBaseView {
        void loadComment();

        void refreshComment();

        String getDataId();

        void showComment(ArrayList<BaseItem> listBeen);

        void noMore();

        void loadFail();
    }

    interface Presenter extends ImpBasePresenter {
        void refreshComment();

        void loadMoreComment();
    }
}
