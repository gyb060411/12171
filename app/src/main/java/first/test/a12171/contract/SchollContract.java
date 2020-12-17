package first.test.a12171.contract;

import first.test.a12171.base.BaseView;
import first.test.a12171.bean.SchoolBean;
import first.test.a12171.utils.InetCallBack;

public
class SchollContract {
    public interface MainView extends BaseView{
        void getSchool(SchoolBean schoolBean);
        void onError(String error);
    }
    public interface  MainModel{
        <T>void getModel(String url, InetCallBack callBack);
    }
    public interface MainPersenter{
        void par();
    }
}
