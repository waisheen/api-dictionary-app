package com.example.dictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class MeaningViewHolder extends RecyclerView.ViewHolder {
    public TextView textView_partsOfSpeech;
    public RecyclerView recycler_definitions;

    public MeaningViewHolder(@NonNull View itemView) {
        super(itemView);
        this.textView_partsOfSpeech = itemView.findViewById(R.id.textView_partsOfSpeech);
        this.recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
    }
}
