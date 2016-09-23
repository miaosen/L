package com.myutils.l;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L.i("打印文本----");
                L.e("出错了！");
                L.e("出错了！", new RuntimeException("啊啊"));
                L.json(getJson(1).toString());
                L.json("返回的json数据== ", getJson(1).toString());
                L.json("返回的json数据比较长== ", getLongJson(100));
            }
        });
    }


    private JSONObject getJson(int id) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", id);
            jsonObject.put("name", "淼森");
            jsonObject.put("age", "500岁");
            jsonObject.put("gender", "男");
            jsonObject.put("address", "广州市越秀区");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    private String getLongJson(int num) {
        JSONArray jsonArray = new JSONArray();
        try {
            for (int i = 0; i < num; i++) {
                jsonArray.put(i,getJson(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray.toString();
    }

}
