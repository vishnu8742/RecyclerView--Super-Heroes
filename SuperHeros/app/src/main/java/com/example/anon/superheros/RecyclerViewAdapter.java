package com.example.anon.superheros;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.anon.superheros.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.media.CamcorderProfile.get;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "recyclerViewAdapter";

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> imageNames = new ArrayList<>();
    private Context mcontext;

    public RecyclerViewAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> images) {
        this.mImages = images;
        this.imageNames = imageNames;
        this.mcontext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: Called on");

        Glide.with(mcontext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.mImage);

        holder.imageText.setText(imageNames.get(position));

        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontext, imageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView mImage;
        TextView imageText;
        RelativeLayout parent_layout;

        public ViewHolder(View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.image);
            imageText = itemView.findViewById(R.id.image_text);
            parent_layout = itemView.findViewById(R.id.parent_layout);

        }
    }
}
