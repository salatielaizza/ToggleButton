package togglebutton.cursoandroid.com.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView textoExibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonID);
        textoExibido= (TextView) findViewById(R.id.textoExibicaoID);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                textoExibido.setText("");
                if ( isChecked ) {
                    textoExibido.setText("ToggleButton Ligado");
                }else {
                    textoExibido.setText("ToggleButton Desligado");
                }
            }
        });
    }
}
