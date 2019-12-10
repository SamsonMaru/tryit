package com.example.samso.recyclerview;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        recyclerView=findViewById(R.id.recyclerView1);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        MyRecyclerViewAdapter adapter= new MyRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
//        ItemDecoration itemDecoration= new ItemDecoration();
//        recyclerView.addItemDecoration(itemDecoration);


    }

//    public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{
//
//        @Override
//        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View view= LayoutInflater.from(parent.getContext()).inflate(
//                    R.layout.recycler_view_layout, parent, false);
//            return new MyViewHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(MyViewHolder holder, int position) {
//            holder.textView1.setText(String.format("%s%d", arrayList.get(position).name, arrayList.get(position).numberOfStarts));
//
//        }
//
//        @Override
//        public int getItemCount() {
//            return arrayList.size();
//        }
//
//        @Override
//        public int getItemViewType(int position) {
//            return super.getItemViewType(position);
//        }
//
//
//         class MyViewHolder extends RecyclerView.ViewHolder {
//            TextView textView1;
//
//            public MyViewHolder(View itemView) {
//                super(itemView);
//                textView1=(TextView) itemView.findViewById(R.id.textView1);
//
//            }
//
//        }
//    }



//    public class ItemDecoration extends RecyclerView.ItemDecoration{
//        @Override
//        public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
//
//            super.onDraw(c, parent, state);
//        }
//    }
}
