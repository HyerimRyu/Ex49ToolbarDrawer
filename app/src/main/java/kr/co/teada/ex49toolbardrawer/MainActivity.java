package kr.co.teada.ex49toolbardrawer;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    //2. 참조
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 툴바를 액션바로 설정하기 _*주의) support 버전(내 버전 맞추기)
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //3. 연결
        drawerLayout=findViewById(R.id.layout_drawer);
        navigationView=findViewById(R.id.navi);
        navigationView.setItemIconTintList(null); //이건 아이콘 다 회색인거 색 있게 보이도록 하는 코드

        //4. 토글버튼: 툴바쓰면 간단!!!
        drawerToggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    //5. (layput-menu.xml 만들고)액션바에 붙는 메뉴(오른쪽 상단 점3개 : 옵션메뉴) 만들기 위해 자동 호출되는 메소드
    //액티비티가 처음 실행될 때 자동 호출


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
