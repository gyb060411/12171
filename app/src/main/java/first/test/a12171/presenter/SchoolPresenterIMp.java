package first.test.a12171.presenter;

import first.test.a12171.base.BasePresenter;
import first.test.a12171.bean.SchoolBean;
import first.test.a12171.contract.SchollContract;
import first.test.a12171.model.SchoolModelImp;
import first.test.a12171.utils.InetCallBack;
import first.test.a12171.utils.URLConstart;

public
class SchoolPresenterIMp extends BasePresenter<SchollContract.MainView> implements SchollContract.MainPersenter {
   private SchollContract.MainView mainView;
   private SchollContract.MainModel mainModel;

    public SchoolPresenterIMp(SchollContract.MainView mainView) {
        this.mainView = mainView;
        this.mainModel=new SchoolModelImp(this);
    }

    @Override
    public void par() {
        mainModel.getModel(URLConstart.School, new InetCallBack<SchoolBean>() {
            @Override
            public void onSuccess(SchoolBean schoolBean) {
            iView.getSchool(schoolBean);
            }

            @Override
            public void onFail(String error) {
            iView.onError(error);
            }
        });
    }
}
