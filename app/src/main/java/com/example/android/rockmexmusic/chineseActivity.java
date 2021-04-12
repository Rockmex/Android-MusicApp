package com.example.android.rockmexmusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class chineseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<songs> chineseSongs = new ArrayList<songs>();
        chineseSongs.add(new songs("开不了口", "周杰伦"));
        chineseSongs.add(new songs("单车", "陈奕迅"));
        chineseSongs.add(new songs("慢慢喜欢你", "莫文蔚"));
        chineseSongs.add(new songs("命硬", "侧田"));
        chineseSongs.add(new songs("有一种悲伤", "黄丽玲"));
        chineseSongs.add(new songs("李白", "李荣浩"));
        chineseSongs.add(new songs("我好想你", "苏打绿"));
        chineseSongs.add(new songs("我们结婚吧", "张靓颖"));
        chineseSongs.add(new songs("可惜没如果", "林俊杰"));
        chineseSongs.add(new songs("28", "Jony J"));
        chineseSongs.add(new songs("说谎", "林宥嘉"));
        chineseSongs.add(new songs("男孩", "梁博"));


        songAdapter adapter = new songAdapter(this, chineseSongs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
