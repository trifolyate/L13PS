package sg.edu.rp.c346.id21008946.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    CustomAdapter caWaste;
    ArrayList<Waste> alWasteList;
    ListView lvWaste;
    AsyncHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvWaste = findViewById(R.id.listViewWaste);
        alWasteList =new ArrayList<Waste>();
        client = new AsyncHttpClient();
    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<Waste> alWeather = new ArrayList<Waste>();

        client.get("https://data.gov.sg/api/action/datastore_search?resource_id=4d83d0be-55ba-46de-8430-2ff708fede5c&limit=28", new JsonHttpResponseHandler() {

            String waste_type;
            Integer year;
            Integer recyclingRate;

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try {
                    JSONObject jsonArrItems = response.getJSONObject("result");
                    JSONArray jsonArrForecasts = jsonArrItems.getJSONArray("records");
                    for(int i = 0; i < jsonArrForecasts.length(); i++) {
                        JSONObject jsonObjForecast = jsonArrForecasts.getJSONObject(i);
                        waste_type = jsonObjForecast.getString("waste_type");
                        recyclingRate = jsonObjForecast.getInt("recycling_rate");
                        year = jsonObjForecast.getInt("year");
                        Waste weather = new Waste(year,waste_type,recyclingRate);
                        alWasteList.add(weather);
                    }
                }
                catch(JSONException e){
                }
                caWaste = new CustomAdapter(MainActivity.this,R.layout.row,alWasteList);
                lvWaste.setAdapter(caWaste);
            }
        });
    }//end onResume
}