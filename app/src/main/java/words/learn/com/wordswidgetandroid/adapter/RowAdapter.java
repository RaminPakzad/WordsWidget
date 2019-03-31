package words.learn.com.wordswidgetandroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import words.learn.com.wordswidgetandroid.R;
import words.learn.com.wordswidgetandroid.models.Word;

public class RowAdapter extends RecyclerView.Adapter<RowAdapter.MyViewHolder> {

    private List<Word> wordList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
//            genre = (TextView) view.findViewById(R.id.genre);
//            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public RowAdapter(List<Word> wordList) {
        this.wordList = wordList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.word_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Word word = wordList.get(position);
        holder.title.setText("titlex");
        holder.genre.setText("genrex");
        holder.year.setText("yearx");
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }
}