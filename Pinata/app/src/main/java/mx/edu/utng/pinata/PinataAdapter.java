package mx.edu.utng.pinata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PabloRam on 13/12/2016.
 */
public class PinataAdapter extends ArrayAdapter<Pinata> {
    public PinataAdapter(Context context,
                         ArrayList<Pinata> pinatas){
        super(context, 0, pinatas);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        Pinata pinata = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.pinata_layout, parent, false);
        }

        TextView txvMicrofono = (TextView)
                convertView.findViewById(R.id.txv_pinata);
        txvMicrofono.setText(pinata.getNumeroPicos()+" "+
                pinata.getMaterial()+" "+
                pinata.getTamaño());

        return convertView;
    }
}

