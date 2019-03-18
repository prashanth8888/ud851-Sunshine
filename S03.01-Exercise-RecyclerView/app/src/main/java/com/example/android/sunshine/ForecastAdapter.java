package com.example.android.sunshine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForeCastAdapterviewHolder> {
    private String[] mWeatherData;

    public ForecastAdapter() {

    }

    @NonNull
    @Override
    public ForeCastAdapterviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForItem, viewGroup, false);

        return new ForeCastAdapterviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ForeCastAdapterviewHolder foreCastAdapterviewHolder, int i) {
        String weatherData = mWeatherData[i];
        foreCastAdapterviewHolder.mWeatherTextView.setText(weatherData);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData ==  null) {
            return 0;
        }
        return mWeatherData.length;
    }

    public void setmWeatherData(String[] mWeatherData) {
        this.mWeatherData = mWeatherData;
        notifyDataSetChanged();
    }

    class ForeCastAdapterviewHolder extends RecyclerView.ViewHolder {
        private TextView mWeatherTextView;

        ForeCastAdapterviewHolder(View view) {
            super(view);
            mWeatherTextView = view.findViewById(R.id.tv_weather_data);
        }
    }
}
