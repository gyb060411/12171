package first.test.a12171.model;

import first.test.a12171.contract.SchollContract;
import first.test.a12171.utils.InetCallBack;
import first.test.a12171.utils.RetrofitUtils;

public

class SchoolModelImp implements SchollContract.MainModel {
  private SchollContract.MainPersenter persenter;

    public SchoolModelImp(SchollContract.MainPersenter persenter) {
        this.persenter = persenter;
    }

    @Override
    public <T> void getModel(String url, InetCallBack callBack) {
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
