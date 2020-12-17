package first.test.a12171.base;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public
abstract class BaseAcitivty<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    public P persenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if(persenter==null){
            persenter=getPersenter();
            persenter.attachView(this);
            Log.e("TAG", "attachView: 信息"+this.toString() );
        }
        initView();
        initData();
    }

    protected abstract P getPersenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutID();

}
