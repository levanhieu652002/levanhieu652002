package com.example.levanhieu_2050531200143;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lvBongDa;
    ArrayList<BongDa> arrayBongDa;
    BongDaAdapter adapter;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AnhXa();
        adapter = new BongDaAdapter(this,R.layout.dong_trai_cay,arrayBongDa);
        lvBongDa.setAdapter(adapter);
        lvBongDa.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                XacNhanXoa(i);
                return false;
            }
        });

    }

    private void XacNhanXoa(int position) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Thông báo");
        alertDialog.setIcon(R.drawable.ic_launcher_foreground);
        alertDialog.setMessage("Bạn có muốn xóa cái này không?");
        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayBongDa.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }

    private void   AnhXa() {
        lvBongDa= (ListView) findViewById(R.id.listviewTraiCay);
        arrayBongDa=new ArrayList<>();
        arrayBongDa.add(new BongDa("Cristiano Ronaldo","Ông vua Champions league ",R.drawable.ronaldo));
        arrayBongDa.add(new BongDa("Leo Messi ","Ông hoàngr ê bóng",R.drawable.messi));
        arrayBongDa.add(new BongDa("Zlatan Ibrahimovic","Kẻ ngông cuồng",R.drawable.ibraimmovic));
        arrayBongDa.add(new BongDa("Ricardo KaKa","Thiên thần của xứ sở Samba",R.drawable.kaka));
        arrayBongDa.add (new BongDa("Sergio Ramos ","Thiên thần hay ác quỷ ",R.drawable.ramos));



    }



}
