package com.example.myhomwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MusicActivity extends AppCompatActivity {
    private List<Music> musicList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_main);
        initMusic();
        MusicAdapter adapter=new MusicAdapter(MusicActivity.this,R.layout.activity_music,musicList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initMusic() {
        Music music1=new Music("这是第1个歌单","共15首",R.drawable.bg_main);
        musicList.add(music1);
        Music music2=new Music("这是第2个歌单","共43首",R.drawable.bg_main);
        musicList.add(music2);
        Music music3=new Music("这是第3个歌单","共15首",R.drawable.bg_main);
        musicList.add(music3);
        Music music4=new Music("这是第4个歌单","共19首",R.drawable.bg_main);
        musicList.add(music4);
        Music music5=new Music("这是第5个歌单","共15首",R.drawable.bg_main);
        musicList.add(music5);
        Music music6=new Music("这是第6个歌单","共15首",R.drawable.bg_main);
        musicList.add(music6);
        Music music7=new Music("这是第7个歌单","共15首",R.drawable.bg_main);
        musicList.add(music7);
        Music music8=new Music("这是第8个歌单","共15首",R.drawable.bg_main);
        musicList.add(music8);
        Music music9=new Music("这是第9个歌单","共15首",R.drawable.bg_main);
        musicList.add(music9);
    }
}
