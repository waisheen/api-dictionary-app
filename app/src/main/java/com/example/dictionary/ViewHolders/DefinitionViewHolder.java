package com.example.dictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class DefinitionViewHolder extends RecyclerView.ViewHolder {
    public TextView textView_definition;
    public TextView textView_example;

    public DefinitionViewHolder(@NonNull View itemView) {
        super(itemView);
        this.textView_definition = itemView.findViewById(R.id.textView_definition);
        this.textView_example = itemView.findViewById(R.id.textView_example);
    }
}
