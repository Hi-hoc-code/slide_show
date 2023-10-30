package com.example.slideshow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHoler> {
    List<Slider> list;
    Context context;
    public SliderAdapter(List<Slider> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public SliderViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHoler(LayoutInflater.from(parent.getContext()).inflate(R.layout.slide_item_container, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull SliderViewHoler holder, int position) {
        holder.setImage(list.get(position));
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class SliderViewHoler extends RecyclerView.ViewHolder {
        RoundedImageView imageView;
        public SliderViewHoler(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgSlideShow);
        }
        void setImage(Slider slider) {
            imageView.setImageResource(slider.getImage());
        }
    }
}
