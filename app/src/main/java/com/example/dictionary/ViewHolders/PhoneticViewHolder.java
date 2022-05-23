package com.example.dictionary.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class PhoneticViewHolder extends RecyclerView.ViewHolder {
    public TextView textView_phonetics;
    public ImageButton audio_button;

    public PhoneticViewHolder(@NonNull View itemView) {
        super(itemView);
        this.textView_phonetics = itemView.findViewById(R.id.textView_phonetics);
        this.audio_button = itemView.findViewById(R.id.audio_button);
    }
}
