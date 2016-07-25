package com.example.sam.ch05_ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ch05_ex2 extends AppCompatActivity {
    private TextView textshow;
    private RadioButton radO,radA,radB,radAB;
    private RadioGroup radG;
    private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch05_ex2);

        radO=(RadioButton)findViewById(R.id.radioButton);
        radA=(RadioButton)findViewById(R.id.radioButton2);
        radB=(RadioButton)findViewById(R.id.radioButton3);
        radAB=(RadioButton)findViewById(R.id.radioButton4);
        radG=(RadioGroup)findViewById(R.id.radioG);
        textshow=(TextView)findViewById(R.id.textView3);
        edit=(EditText)findViewById(R.id.editText);

        radG.setOnCheckedChangeListener(radioListener);

    }

    private RadioGroup.OnCheckedChangeListener radioListener=new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup group,int checkedId){
            RadioButton rad=(RadioButton)findViewById(checkedId);
            textshow.setText(edit.getText()+" 您的血型為 "+rad.getText()+" 型");
        }
    };
}
