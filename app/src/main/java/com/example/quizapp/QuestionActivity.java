package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {
    private Button mSubmit ;
    private RadioGroup Question1,Question2,Question3,Question4,Question5 ;
    private RadioButton html, assembler,swift,csharp,scala;
    private TextView textView;

    public int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Question1=findViewById(R.id.Quest1);
        Question2=findViewById(R.id.Quest2);
        Question3=findViewById(R.id.Quest3);
        Question4=findViewById(R.id.Quest4);
        Question5=findViewById(R.id.Quest5);
        html=findViewById(R.id.id_html);
        assembler=findViewById(R.id.id_assembler);
        swift=findViewById(R.id.id_swift);
        csharp=findViewById(R.id.id_c_sharp);
        scala=findViewById(R.id.scala);
        mSubmit= findViewById(R.id.submit_button);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Question1.getCheckedRadioButtonId())==(html.getId())) counter ++;
                if((Question2.getCheckedRadioButtonId())==(assembler.getId())) counter ++;
                if((Question3.getCheckedRadioButtonId())==(swift.getId())) counter ++;
                if((Question4.getCheckedRadioButtonId())==(csharp.getId())) counter ++;
                if((Question5.getCheckedRadioButtonId())==(scala.getId())) counter ++;
                Intent intent=new Intent(QuestionActivity.this,ResultActivity.class);
                intent.putExtra("score",counter);
                startActivity(intent);
            }
        });
    }

}