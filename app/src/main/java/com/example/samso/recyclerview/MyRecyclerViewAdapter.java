package com.example.samso.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samso on 11/27/2019.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{

    List<Planets> arrayList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.recycler_view_layout, parent, false);
        return new MyViewHolder(view);
    }

    public void arrayt(){
        arrayList= new ArrayList<>();
        arrayList.add(new Planets("Mercury", 0));
        arrayList.add(new Planets("Earth", 1));
        arrayList.add(new Planets("Neptune", 13));
        arrayList.add(new Planets("Mars", 2));
        arrayList.add(new Planets("Jupiter", 67));
        arrayList.add(new Planets("Venus", 0));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        arrayt();
        if (arrayList.get(position).numberOfStarts<=3) {
            holder.textView1.setText(String.format("%s%d", arrayList.get(position).name, arrayList.get(position).numberOfStarts));
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.textView1);

        }

        //adding dummy function
        void dummyFunction(){
            System.out.print("I do not do anything. I am here just to help you learn how git merge works");
        }

    }
}
