package com.example.praytimes;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.praytimes.Adapter.Rec_Adapter;
import com.example.praytimes.Model_for_api.Item;
import com.example.praytimes.Model_for_api.Muslim_Salat;
import com.example.praytimes.Retrofi_Attch.Api_identifier;
import com.example.praytimes.Retrofi_Attch.Retrofit_Helper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tempratchertrttt)
    TextView tempratchertrttt;
    @BindView(R.id.temperature)
    TextView temperature;
    @BindView(R.id.receclvi)
    RecyclerView receclvi;
    @BindView(R.id.progress_circular)
    ProgressBar progressCircular;
    Rec_Adapter adapterSalate;
    Retrofit_Helper retrofethelper;
    NotificationManagerCompat notificationManagerCompat;
    NotificationChannel notificationChannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        notificationManagerCompat=NotificationManagerCompat.from(this);
        init();
    }
    private void init() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        receclvi.setLayoutManager (layoutManager);
        receclvi.addItemDecoration (dividerItemDecoration);
        Retrofit retrofit=new Retrofit.Builder ().baseUrl ("https://muslimsalat.com/").addConverterFactory (GsonConverterFactory.create ()).build ();

        retrofethelper=retrofit.create (Retrofit_Helper.class);
        getBooks ();
    }
    private void getBooks() {
        Call<Muslim_Salat> call = retrofethelper.gettimsalate (Api_identifier.Api_Val);
        call.enqueue (new Callback<Muslim_Salat>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Muslim_Salat> call, Response<Muslim_Salat> response) {
                if (response.isSuccessful ()) {
                    progressCircular.setVisibility (View.GONE);
                    Muslim_Salat salateModel = response.body ();
                    List<Item> itemList = salateModel.getItems ();
                    tempratchertrttt.setText ("TP: "+ salateModel.getTodayWeather ().getTemperature ());
                    adapterSalate=new Rec_Adapter (MainActivity.this,itemList);
                    receclvi.setAdapter (adapterSalate);

                }}
            @Override
            public void onFailure(Call<Muslim_Salat> call, Throwable t) {
                progressCircular.setVisibility (View.GONE);
                Toast.makeText (getApplicationContext (), t.getMessage (), Toast.LENGTH_LONG).show ();

            }
        });

    }

    public void run (){
        Notification notification=new NotificationCompat.Builder(this){

        }
    }
}