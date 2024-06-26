package com.example.quanlysanbong.activity.user;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlysanbong.R;
import com.example.quanlysanbong.adapter.user.HistoryBuyAdapter;
import com.example.quanlysanbong.database.MyDatabase;
import com.example.quanlysanbong.model.HistoryBuy;

import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView tvCount;
    private List<HistoryBuy> list;
    HistoryBuyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        list = MyDatabase.getInstance(this).historyBuyDAO().getALlWithId(UserMainActivity.customer.getId());
        tvCount = findViewById(R.id.tv_count_history_buy);
        tvCount.setText(list.size()+"");

        recyclerView = findViewById(R.id.recy_history_buy);
        adapter = new HistoryBuyAdapter(this,list);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
    }
}