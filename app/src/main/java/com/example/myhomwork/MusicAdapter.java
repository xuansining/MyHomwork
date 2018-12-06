package com.example.myhomwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {
    private  int resourceId;
    public MusicAdapter( Context context, int textViewResourceId,List<Music> objects) {
        super(context,  textViewResourceId,objects);
        resourceId=textViewResourceId;

    }
    @Override
    public View getView(int position , View convertView, ViewGroup parent){
        Music music=getItem(position);
        View view =LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView musicImage=(ImageView) view.findViewById(R.id.image_music);
        TextView musicList=(TextView)view.findViewById(R.id.textView_list);
        TextView musicNum=(TextView) view.findViewById(R.id.textView_num);
        musicImage.setImageResource(music.getImageId());
        musicList.setText(music.getMusic_list());
        musicNum.setText(music.getMusic_num());

        return  view;
    }
}
