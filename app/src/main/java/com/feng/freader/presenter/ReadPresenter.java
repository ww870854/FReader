package com.feng.freader.presenter;

import com.feng.freader.base.BasePresenter;
import com.feng.freader.constract.IReadContract;
import com.feng.freader.entity.data.DetailedChapterData;
import com.feng.freader.model.ReadModel;

import java.util.List;

/**
 * @author Feng Zhaohao
 * Created on 2019/11/25
 */
public class ReadPresenter extends BasePresenter<IReadContract.View>
        implements IReadContract.Presenter {

    private IReadContract.Model mModel;

    public ReadPresenter() {
        mModel = new ReadModel(this);
    }

    @Override
    public void getChapterUrlListSuccess(List<String> chapterUrlList) {
        if (isAttachView()) {
            getMvpView().getChapterUrlListSuccess(chapterUrlList);
        }
    }

    @Override
    public void getChapterUrlListError(String errorMsg) {
        if (isAttachView()) {
            getMvpView().getChapterUrlListError(errorMsg);
        }
    }

    @Override
    public void getDetailedChapterDataSuccess(DetailedChapterData data) {
        if (isAttachView()) {
            getMvpView().getDetailedChapterDataSuccess(data);
        }
    }

    @Override
    public void getDetailedChapterDataError(String errorMsg) {
        if (isAttachView()) {
            getMvpView().getDetailedChapterDataError(errorMsg);
        }
    }

    @Override
    public void loadTxtSuccess(String text) {
        if (isAttachView()) {
            getMvpView().loadTxtSuccess(text);
        }
    }

    @Override
    public void loadTxtError(String errorMsg) {
        if (isAttachView()) {
            getMvpView().loadTxtError(errorMsg);
        }
    }

    @Override
    public void getChapterUrlList(String url) {
        mModel.getChapterUrlList(url);
    }

    @Override
    public void getDetailedChapterData(String url) {
        mModel.getDetailedChapterData(url);
    }

    @Override
    public void loadTxt(String filePath) {
        mModel.loadTxt(filePath);
    }
}
