package appcom.example.comunicacionactivitis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class segundaA extends AppCompatActivity {
    private Button aceptar,rechazar;
    private TextView textView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda);

        textView = (TextView) findViewById(R.id.name2);
        aceptar = (Button) findViewById(R.id.aceptar);
        rechazar = (Button) findViewById(R.id.rechazar);


          mostrarDatos();
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aceptados();
            }
        });

        rechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rechazados();
            }
        });

    }
        public void aceptados(){

            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            intent.putExtra("resultado","Aceptado");
            setResult(RESULT_OK, intent);
            finish();

        }


        public void rechazados(){

            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            intent.putExtra("resultado","Rechazado");
            setResult(RESULT_OK, intent);
            finish();
        }

    public void mostrarDatos(){


        Bundle data = getIntent().getExtras();
        String s = data.getString("name");
        textView.setText("Hola " + s + " ¿Aceptas las condiciones?");
        System.out.println(s);


    }




}
