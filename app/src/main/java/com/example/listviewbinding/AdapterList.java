package com.example.listviewbinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.listviewbinding.databinding.ListViewBinding;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewDemo> {
    private List<User> userList;
    private Context context;

    public AdapterList(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewDemo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListViewBinding listViewBinding = ListViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewDemo(listViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewDemo holder, int position) {
        User user = userList.get(position);
        holder.listViewBinding.setUser(user);
        holder.listViewBinding.executePendingBindings();
        holder.listViewBinding.buttonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewDemo extends RecyclerView.ViewHolder {
        ListViewBinding listViewBinding;

        public ViewDemo(@NonNull ListViewBinding listViewBinding) {
            super(listViewBinding.getRoot());
            this.listViewBinding = listViewBinding;

        }
    }
}
