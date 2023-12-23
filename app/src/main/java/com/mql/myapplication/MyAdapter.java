package com.mql.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Music> music ;
    private LayoutInflater myInflater ;

    public MyAdapter(Context context,List<Music> music){
        this.myInflater = LayoutInflater.from(context);
        this.music = music;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.my_inflate, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Music oneMusic = music.get(position);

        holder.title.setText(oneMusic.getTitle());
        holder.description.setText(oneMusic.getDescription());

        holder.btnDelete.setOnClickListener(view -> {
            // Implement deletion logic here
            deleteItem(position);
        });
    }



    @Override
    public int getItemCount() {
        return music.size();
    }


    private void deleteItem(int position) {
        // Implement delete operation for the selected item
        // Here, you should remove the item from the list and notify the adapter
        music.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, music.size());

        }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View btnDelete;
        TextView title;
        TextView description;

        public ViewHolder(@NonNull View view) {
            super(view);
            title = view.findViewById(R.id.title);
            description = view.findViewById(R.id.description);
            btnDelete = view.findViewById(R.id.btnDelete);
        }
    }
}
