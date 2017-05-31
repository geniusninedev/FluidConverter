package com.nineinfosys.fluidconverter.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.nineinfosys.fluidconverter.ConverterActivity.ConcentrationMolarActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.ConcentrationSolutionActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.FlowActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.FlowMassActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.FlowMolarActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.MassFluxDensityActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.PermeabillityActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.SurfaceTensionActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.ViscosityDynamicActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.ViscosityKinematicActivity;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemObject;

import java.util.List;


/**
 * Created by AndriodDev5 on 18-04-2017.
 */

public class RecyclerViewFluidAdapter extends RecyclerView.Adapter<RecyclerViewFluidAdapter.RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewFluidAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }


    public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView countryName;
        public ImageView countryPhoto;


        public RecyclerViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            countryName = (TextView)itemView.findViewById(R.id.country_name);
            countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);

        }

        @Override
        public void onClick(View view) {
          //  Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
            switch (getPosition())
            {
                case 0:
                    Intent i=new Intent(context,FlowActivity.class);
                    context.startActivity(i);
                    break;
                case 1:
                    Intent i1=new Intent(context,FlowMassActivity.class);
                    context.startActivity(i1);
                    break;
                case 2:
                    Intent i2=new Intent(context,FlowMolarActivity.class);
                    context.startActivity(i2);
                    break;
                case 3:
                    Intent i3=new Intent(context,MassFluxDensityActivity.class);
                    context.startActivity(i3);

                    break;
                case 4:
                    Intent i4=new Intent(context,ConcentrationMolarActivity.class);
                    context.startActivity(i4);
                    break;
                case 5:
                    Intent i5=new Intent(context,ConcentrationSolutionActivity.class);
                    context.startActivity(i5);
                    break;
                case 6:
                    Intent i6=new Intent(context,ViscosityDynamicActivity.class);
                    context.startActivity(i6);
                    break;
                case 7:
                    Intent i7=new Intent(context,ViscosityKinematicActivity.class);
                    context.startActivity(i7);
                    break;
                case 8:
                    Intent i8=new Intent(context,SurfaceTensionActivity.class);
                    context.startActivity(i8);
                    break;
                case 9:
                    Intent i9=new Intent(context,PermeabillityActivity.class);
                    context.startActivity(i9);
                    break;



            }


        }



    }
}