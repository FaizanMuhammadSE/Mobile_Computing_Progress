package com.example.lec13_recyclerview.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lec13_recyclerview.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    ArrayList<String> arrayList;

    public RecyclerViewAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    //where to get single card as a ViewHolder object
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("ResourceType") View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    //what will happen after we create the view holder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
            String ques=arrayList.get(position);
            holder.textView.setText(ques);
    }

    //How many items
    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements AdapterView.OnClickListener{

        //if you will not specify these access specifiers then, these are by-default public
        public TextView textView;
        public ImageView editBtn;
        public ImageView cancelBtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView=itemView.findViewById(R.id.que);
            editBtn=itemView.findViewById(R.id.editButton);
            cancelBtn=itemView.findViewById(R.id.cancelButton);

            editBtn.setOnClickListener(this);
            cancelBtn.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Log.d("ClickedFromViewHolder","Clicked");
            if(editBtn.getId()==v.getId())
            {
                Log.d("ClickedFromViewHolder","Edit button clikecd");
                Toast.makeText(context,"Edit Button",Toast.LENGTH_LONG).show();
            }
            else if(cancelBtn.getId()==v.getId())
            {
                Log.d("ClickedFromViewHolder","cancel button clikecd");
                Toast.makeText(context,"Cancel Button",Toast.LENGTH_LONG).show();
            }
        }
    }
}