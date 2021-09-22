package com.example.list_view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mad_pet_doctor.Doctors;
import com.example.mad_pet_doctor.R;
import com.example.model.DoctorReg;

import java.util.List;

public class DoctorList extends ArrayAdapter<DoctorReg> {

    private Activity context;

    List<DoctorReg> doctors;

    public DoctorList(Activity context, List<DoctorReg> doctors){

        super(context, R.layout.activity_doctor_list,doctors);

        this.context = context;

        this.doctors = doctors;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.activity_user_list_details, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.user_name_list_textview);

        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.user_email_list_textview);

        TextView textViewMobileNumber = (TextView) listViewItem.findViewById(R.id.user_phone_list_textview);

        DoctorReg doctor = doctors.get(position);

        textViewName.setText(doctor.getDoctorId());

        textViewEmail.setText(doctor.getEmail());

       // textViewMobileNumber.setText(doctor.getPhoneNumber());


        return listViewItem;
    }

}