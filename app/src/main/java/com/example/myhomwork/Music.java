package com.example.myhomwork;

public class Music {
    private String music_list;
    private  String music_num;
    private   int  imageId;
    public Music(String music_list,String music_num,int imageId){
        this.imageId=imageId;
        this.music_list=music_list;
        this.music_num=music_num;

    }

    public String getMusic_list() {
        return music_list;
    }

    public String getMusic_num() {
        return music_num;
    }

    public int getImageId() {
        return imageId;
    }
}
