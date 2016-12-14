package mx.edu.utng.ram;

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
public class RamAdapter  extends ArrayAdapter<Ram>{
    public RamAdapter(Context context,
                          ArrayList<Ram> tarjetas){
        super(context, 0, tarjetas);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        Ram ram = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.ram_layout, parent, false);
        }

        TextView txvTarjeta = (TextView)
                convertView.findViewById(R.id.txv_ram);
        txvTarjeta.setText(ram.getNumero()+" "+
                ram.getMarca()+" "+
                ram.getCapacidad());

        return convertView;
    }
}
