package com.pens.projectonedts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final List<String> mWordList;

    public WordListAdapter(List<String> mWordList) {
        this.mWordList = mWordList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View childView = layoutInflater.inflate(R.layout.item_wordlist,viewGroup ,false);
        WordViewHolder viewHolder = new WordViewHolder(childView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder wordViewHolder, int i) {
        String mCurrent = mWordList.get(i);
        wordViewHolder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        public WordViewHolder(View childView) {
            super(childView);
            wordItemView = childView.findViewById(R.id.word);
        }
    }
}
