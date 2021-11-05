package com.hanif.makanan;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Foodadapter extends RecyclerView.Adapter<Foodadapter.ListViewHolder> {
    private ArrayList<Food> foodData;

    Foodadapter(ArrayList<Food> list) {
        this.foodData = list;
    }

    @NonNull
    @Override
    public Foodadapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Foodadapter.ListViewHolder holder, int position) {
        Food food = foodData.get(position);
        holder.judul.setText(food.judul);
        holder.harga.setText(String.valueOf(food.harga));
        holder.image.setImageDrawable(food.image);
    }

    @Override
    public int getItemCount() {
        return foodData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView judul, harga;
        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_photo);
            judul = itemView.findViewById(R.id.item_name);
            harga = itemView.findViewById(R.id.item_price);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }
}
