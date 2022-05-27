package com.example.dictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Components.Definition;
import com.example.dictionary.Components.Meaning;
import com.example.dictionary.R;
import com.example.dictionary.ViewHolders.DefinitionViewHolder;

import java.util.List;

public class DefinitionAdapter extends RecyclerView.Adapter<DefinitionViewHolder> {
    private Context context;
    private List<Definition> definitionList;

    public DefinitionAdapter(Context context, List<Definition> definitionList) {
        this.context = context;
        this.definitionList = definitionList;
    }

    @NonNull
    @Override
    public DefinitionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DefinitionViewHolder(LayoutInflater.from(context).inflate(R.layout.definitions_list,
                 parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DefinitionViewHolder holder, int position) {
        holder.textView_definition.setText("Definition: " + definitionList.get(position).getDefinition());
        holder.textView_example.setText("Example: " + definitionList.get(position).getExample());
    }

    @Override
    public int getItemCount() {
        return definitionList.size();
    }
}
