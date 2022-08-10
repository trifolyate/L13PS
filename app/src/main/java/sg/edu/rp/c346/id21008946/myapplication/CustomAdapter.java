package sg.edu.rp.c346.id21008946.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Waste> wasteList;

    public CustomAdapter(Context context, int resource, ArrayList<Waste> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        wasteList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvRecyclingRate = rowView.findViewById(R.id.textViewRecyclingRate);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        ImageView ivRating = rowView.findViewById(R.id.imageViewRating);

        Waste currentItem = wasteList.get(position);
        String wasteTypeString = String.format("Waste Type: %s",currentItem.getWaste_type());
        String recyclingRateString = String.format("Recycling Rate: %s%s",currentItem.getRecycling_rate()+"","%");
        String yearString = String.format("Year: %s",currentItem.getYear()+"");
        Integer recyclingRate = currentItem.getRecycling_rate();
        tvTitle.setText(wasteTypeString);
        tvRecyclingRate.setText(recyclingRateString);

        if(recyclingRate < 50)
        {
            tvRecyclingRate.setTextColor(Color.RED);
        }
        tvYear.setText(yearString);
        // Construction Debris, Used Slag, Ferrous Metal, Scrap Types, Non-Ferrous Metal, Wood, Paper/Cardboard,Horticultural Waste,Plastics,Glass,Food,Textiles,Ash and Sludge, Others

        if (currentItem.getWaste_type().equals("Construction Debris")) {
            String imageUrl = "https://images.pexels.com/photos/3794760/pexels-photo-3794760.jpeg?auto=compress&cs=tinysrgb&w=600";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        } else if (currentItem.getWaste_type().equals("Used Slag")) {
            String imageUrl = "https://uploadstarmaccom.blob.core.windows.net/uploads/2020/08/granulated-slag.jpg";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        } else if (currentItem.getWaste_type().equals("Ferrous Metal")) {
            String imageUrl = "https://lirp.cdn-website.com/93c248f854b240fc8ba90ae1fc2d93b8/dms3rep/multi/opt/1204059-call2-1920w.jpg";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Scrap Types")) {
            String imageUrl = "https://wmmetalsandalloys.com/wp-content/uploads/2020/02/stainless-1080x675.jpg";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Non-Ferrous Metal")) {
            String imageUrl = "https://nordholding.bg/wp-content/uploads/2018/01/non-ferrous-copper-pipe-EN-768x512.jpg";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Wood")) {
            String imageUrl = "https://media.gettyimages.com/photos/storage-shelves-in-lumberyard-picture-id920495528?k=20&m=920495528&s=612x612&w=0&h=jMR6klovPVI8PGyCS9smwL5dcJ-8u8Ozdqgc_kBeMhI=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Paper/Cardboard")) {
            String imageUrl = "https://media.gettyimages.com/photos/this-is-the-last-cardboard-box-picture-id1292048023?k=20&m=1292048023&s=612x612&w=0&h=EolXrpeJia4jXjQRQQdM6OlCxmZlYMD0G6-vbIyeTjM=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Horticultural Waste")) {
            String imageUrl = "https://media.gettyimages.com/photos/closeup-of-potting-soil-with-a-mix-of-peat-moss-perlite-compost-and-picture-id969005486?k=20&m=969005486&s=612x612&w=0&h=yI1uL1-utkL9YuOewDHYJy1Dp1Bl75zgHM_4iEEpSEI=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Plastics")) {
            String imageUrl = "https://media.gettyimages.com/photos/tubes-picture-id171137797?k=20&m=171137797&s=612x612&w=0&h=eqzPfdBiAxckr1IEozP_3s0X4x8iewM0KwVjyXJbqoU=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Glass")) {
            String imageUrl = "https://media.gettyimages.com/photos/workers-packaging-glass-sheets-in-warehouse-picture-id913441706?k=20&m=913441706&s=612x612&w=0&h=jDszOhwagOGjmUOB30WSVWyVWA0E55n25EZl6jNU8m4=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Textiles")) {
            String imageUrl = "https://media.gettyimages.com/photos/rolls-of-fabric-of-different-colors-on-a-shelf-picture-id1303569575?k=20&m=1303569575&s=612x612&w=0&h=NP6hpXPXy6sKHTI5vWMO5GbIKuyaslthnJ2kvi5xQt0=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }else if (currentItem.getWaste_type().equals("Ash and Sludge")) {
            String imageUrl = "https://media.gettyimages.com/photos/taking-samples-of-the-soil-and-groundwater-environmental-research-picture-id483989191?k=20&m=483989191&s=612x612&w=0&h=wThRrmjXpLM3QTEEblf3XzcYEpLQRpb07PclUaiM13E=";
            Picasso.with(parent_context).load(imageUrl).into(ivRating);
        }

        return rowView;
    }
}
