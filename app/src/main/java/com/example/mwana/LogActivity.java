package com.example.mwana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LogActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imageView;
    TextView textView;


    @BindView (R.id.email)
    EditText email;
    @BindView (R.id.password)
    EditText password;
    @BindView (R.id.signin)
    Button signin;
    @BindView (R.id.signup)
    Button signup;



    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        ButterKnife.bind(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LogActivity.this, HomeActivity.class);
                startActivity(intent);

            }
        });
    }

//            private void loginUser() {
//
//
//        //convert object to json
//        Gson gson = new GsonBuilder().create();
//
//        Map<String, String> user = new HashMap<>();
//        user.put("username", email.getText().toString().trim());
//        user.put("password", password.getText().toString().trim());
//
////        User user = new User(username.getText().toString().trim(), password.getText().toString().trim());
//
//
//        String json = gson.toJson(user);
//
//        OkHttpClient client = new OkHttpClient.Builder().build();
//
//        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.BASE_URL).newBuilder();
//
//        String url = urlBuilder.build().toString();
//
//        MediaType MEDIA_TYPE = MediaType.parse("application/json");
//        RequestBody body = RequestBody.create(MEDIA_TYPE, json);
//
//
//        Request request = new Request.Builder()
//                .url(url)
//                .post(body)
//                .build();
//
//        Call call = client.newCall(request);
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, final IOException  e) {
//                LogActivity.this.runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(LogActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//
//
//                    }
//                });
//            }
//
//            @Override
//            public void onResponse(Call call, final Response response) throws IOException {
//                if (response.isSuccessful()) {
//                    if (response.code() == 200) {
//                        LogActivity.this.runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                try {
//                                    String json = response.body().string();
//                                    JSONObject jsonObject = new JSONObject(json);
//                                    // Constants.Token = "Bearer "+jsonObject.getString("access");
//
//
//                                    Intent intent = new Intent(LogActivity.this, MainActivity.class);
//                                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                                    startActivity(intent);
//
//                                } catch (IOException e) {
//                                    e.printStackTrace();
//                                } catch (JSONException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                        });
//                    }
//                } else {
//                    LogActivity.this.runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            try {
//
//                                String json = response.body().string();
//                                JSONObject jsonObject = new JSONObject(json);
//
//                                Toast.makeText(LogActivity.this, jsonObject.getString("detail"), Toast.LENGTH_SHORT).show();
//
//
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    });
//                }
//
//            }
//        });
//
//
//    }

    @Override
    public void onClick(View v) {
//        if (v == signin) {
//            {
//                loginUser();
//
//            }
//
//            if (v == signup) {
//                Intent intent =  new Intent(LogActivity.this, Signup_FormActivity.class);
//                startActivity(intent);
//        }
//
//
//        }
    }



    }
