package com.example.praytimes.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.praytimes.Model_for_api.Item;
import com.example.praytimes.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Rec_Adapter extends RecyclerView.Adapter<Rec_Adapter.Viewholder_Adapter> {
    private Context scontext;
    private List<Item> list;

    public Rec_Adapter(Context context, List<Item> list) {
        scontext = context;
        this.list = list;
    }


    @NonNull
    @Override
    public Viewholder_Adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(scontext).inflate(R.layout.recv_item, parent, false);
        return new Viewholder_Adapter(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder_Adapter holder, int position) {
        final Item item = list.get(position);
        holder.fajrTime.setText(item.getFajr());
        holder.shrokTime.setText(item.getShurooq());
        holder.dohrTime.setText(item.getDhuhr());
        holder.asrTime.setText(item.getAsr());
        holder.maghrbTime.setText(item.getMaghrib());
        holder.alashaTime.setText(item.getAsr());
        holder.dayFor.setText(item.getDateFor());
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    public class Viewholder_Adapter extends RecyclerView.ViewHolder {
        @BindView(R.id.day)
        TextView day;
        @BindView(R.id.day_for)
        TextView dayFor;
        @BindView(R.id.fajr_time)
        TextView fajrTime;
        @BindView(R.id.fajr)
        TextView fajr;
        @BindView(R.id.shrok_time)
        TextView shrokTime;
        @BindView(R.id.shrok)
        TextView shrok;
        @BindView(R.id.dohr_time)
        TextView dohrTime;
        @BindView(R.id.dohr)
        TextView dohr;
        @BindView(R.id.asr_time)
        TextView asrTime;
        @BindView(R.id.asr)
        TextView asr;
        @BindView(R.id.maghrb_time)
        TextView maghrbTime;
        @BindView(R.id.maghrb)
        TextView maghrb;
        @BindView(R.id.alasha_time)
        TextView alashaTime;
        @BindView(R.id.alasha)
        TextView alasha;
        public Viewholder_Adapter(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
        }
    }




