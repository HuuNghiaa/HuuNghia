package com.example.administrator.bai1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_soA, edt_soB;
    TextView ketqua;
    Button btn_cong, btn_tru, btn_nhan, btn_chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_soA =(EditText) findViewById(R.id.edt_soA);
        edt_soB =(EditText) findViewById(R.id.edt_soB);
        ketqua = (TextView) findViewById(R.id.txt_ketqua);

    }
    public void congHaiSo(View v){

        int a = Integer.parseInt(edt_soA.getText()+"");
        int b = Integer.parseInt(edt_soB.getText()+"");

        int kq = a + b;
        ketqua.setText(kq+"");
    }
    public void truHaiSo(View v){
        int a = Integer.parseInt(edt_soA.getText()+"");
        int b = Integer.parseInt(edt_soB.getText()+"");

        int kq = a - b;
        ketqua.setText(kq+"");
    }
    public void nhanHaiSo(View v){
        int a = Integer.parseInt(edt_soA.getText()+"");
        int b = Integer.parseInt(edt_soB.getText()+"");

        int kq = a * b;
        ketqua.setText(kq+"");
    }
    public void chiaHaiSo(View v){
        int a = Integer.parseInt(edt_soA.getText()+"");
        int b = Integer.parseInt(edt_soB.getText()+"");
        if(b != 0){
            float kq = a / b;
            ketqua.setText(kq+"");
        }
        else {
            ketqua.setText("So b phai khac khong!");
        }

    }
    public  void uocChungLonNhat(View v){
        int a = Integer.parseInt(edt_soA.getText()+"");
        int b = Integer.parseInt(edt_soB.getText()+"");
        if(a>b){
            for (int i =b; i>=1; i--){
                if((a%i==0 )&&( b%i==0)){
                    ketqua.setText(i+"");
                    break;
                }
            }
        }
        else {
            for (int i =a; i>=1; i--){
                if((a%i==0 )&&( b%i==0)){
                    ketqua.setText(i+"");
                    break;
                }
            }
        }
    }
    public void Thoat(View v){
        finish();
    }

}
