package first.test.a12171;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import first.test.a12171.bean.SchoolBean;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycler;
    private ArrayList<SchoolBean.NewsBean> list;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRecycler = findViewById(R.id.recycler);
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(this, list);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapter(homeAdapter);
        mRecycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}