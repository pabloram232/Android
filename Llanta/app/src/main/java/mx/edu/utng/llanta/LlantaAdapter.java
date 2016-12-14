package mx.edu.utng.llanta;

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
public class LlantaAdapter extends ArrayAdapter<Llanta> {
    public LlantaAdapter(Context context,
                      ArrayList<Llanta> llantas){
        super(context, 0, llantas);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        Llanta llanta = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.llanta_layout, parent, false);
        }

        TextView txvTarjeta = (TextView)
                convertView.findViewById(R.id.txv_llanta);
        txvTarjeta.setText(llanta.getNumero()+" "+
                llanta.getMarca()+" "+
                llanta.getTamaño());

        return convertView;
    }
}
