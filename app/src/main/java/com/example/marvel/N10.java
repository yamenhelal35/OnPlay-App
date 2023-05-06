package com.example.marvel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class N10 extends AppCompatActivity {

    RecyclerView mList1,mList2,mList3;
    List<scroll> scrollList;
    List<scroll> scrollList1;
    List<scroll> scrollList2;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n10);
        button2 = (Button) findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });

        mList1=findViewById(R.id.list1);
        scrollList=new ArrayList<>();
        scrollList1=new ArrayList<>();
        scrollList2=new ArrayList<>();

        scrollList.add(new scroll(R.drawable.part_i_bill_infobox));
        scrollList.add(new scroll(R.drawable.part_i_david_infobox));
        scrollList.add(new scroll(R.drawable.part_i_henry_infobox));
        scrollList.add(new scroll(R.drawable.part_i_james_infobox));
        scrollList.add(new scroll(R.drawable.part_i_tess_infobox));
        scrollList.add(new scroll(R.drawable.part_ii_abby_2038_infobox));
        scrollList.add(new scroll(R.drawable.part_ii_ellie_infobox));
        scrollList.add(new scroll(R.drawable.part_ii_joel_infobox));




        LinearLayoutManager manager1=new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.VERTICAL);
        mList1.setLayoutManager(manager1);


        adaptor adaptor1 = new adaptor(this,scrollList);
        mList1.setAdapter(adaptor1);

    }
    public void open_M8(){
        Intent intent=new Intent(N10.this,M8.class);
        startActivity(intent);
    }
}