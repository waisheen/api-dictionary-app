package com.example.dictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Components.Meaning;
import com.example.dictionary.R;
import com.example.dictionary.ViewHolders.MeaningViewHolder;

import java.util.List;

public class MeaningsAdapter extends RecyclerView.Adapter<MeaningViewHolder> {
    private Context context;
    private List<Meaning> meaningList;

    public MeaningsAdapter(Context context, List<Meaning> meaningList) {
        this.context = context;
        this.meaningList = meaningList;
    }

    @NonNull
    @Override
    public MeaningViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeaningViewHolder(LayoutInflater.from(context).inflate(R.layout.meanings_list,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MeaningViewHolder holder, int position) {
        holder.textView_partsOfSpeech.setText("Parts of speech: " + meaningList.get(position).getPartsOfSpeech());

        holder.recycler_definitions.setHasFixedSize(true);
        holder.recycler_definitions.setLayoutManager(new GridLayoutManager(context, 1));

        DefinitionAdapter definitionAdapter = new DefinitionAdapter(context,
                meaningList.get(position).getDefinitions());
        holder.recycler_definitions.setAdapter(definitionAdapter);
    }

    @Override
    public int getItemCount() {
        return meaningList.size();
    }
}
