package appcom.example.comunicacionactivitis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button  verificar;
    private EditText names;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verificar = (Button)findViewById(R.id.verificar);
        names = (EditText)findViewById(R.id.edit);
        resultado =(TextView)findViewById(R.id.resultado);



        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enviarDatos();
            }
        });
    }




    public void enviarDatos(){
        Intent  intent = new Intent (getApplicationContext(),segundaA.class);
        String name = names.getText().toString();
        intent.putExtra("name",name);
        startActivity(intent);



    }








}