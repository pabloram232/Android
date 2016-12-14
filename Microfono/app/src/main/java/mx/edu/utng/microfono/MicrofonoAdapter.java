package mx.edu.utng.microfono;

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
public class MicrofonoAdapter extends ArrayAdapter<Microfono> {
    public MicrofonoAdapter(Context context,
                      ArrayList<Microfono> microfonos){
        super(context, 0, microfonos);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        Microfono microfono = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.microfono_layout, parent, false);
        }

        TextView txvMicrofono = (TextView)
                convertView.findViewById(R.id.txv_microfono);
        txvMicrofono.setText(microfono.getNumero()+" "+
                microfono.getMarca()+" "+
                microfono.getColor());

        return convertView;
    }
}

