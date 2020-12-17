package first.test.a12171;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import first.test.a12171.base.BaseAcitivty;
import first.test.a12171.bean.SchoolBean;
import first.test.a12171.contract.SchollContract;
import first.test.a12171.presenter.SchoolPresenterIMp;

public class MainActivity extends BaseAcitivty<SchoolPresenterIMp> implements SchollContract.MainView {

    private RecyclerView mRecycler;
    private ArrayList<SchoolBean.NewsBean> list;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    @Override
    protected SchoolPresenterIMp getPersenter() {
        return new SchoolPresenterIMp(this);
    }

    @Override
    protected void initData() {
        persenter.par();
    }

    protected void initView() {
        mRecycler = findViewById(R.id.recycler);
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(this, list);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapter(homeAdapter);
        mRecycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void getSchool(SchoolBean schoolBean) {
        List<SchoolBean.NewsBean> news = schoolBean.getNews();
        list.addAll(news);
        homeAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String error) {
        Log.e("TAG", "onError: 错误异常"+error);
    }
}