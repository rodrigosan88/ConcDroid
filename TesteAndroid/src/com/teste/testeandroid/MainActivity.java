package com.teste.testeandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.teste.testeandroid.MESSAGE";
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        // Verificar o arquivo .xml que corresponde ao layout desta atividade
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void actQuestoes(View view)
    {
    	/* Uma objeto do tipo Intent provê ligação em tempo de execução 
    	 * entre dois componentes, tais como objetos Activity 
    	 *
    	 * A Classe Intent reprsenta a intenção de um aplicativo em fazer alguma coisa.
    	 * Você pode usar um Intent para uma grande variedades de tarefas, mas na maior
    	 * parte elas são usadas para iniciar uma outra atividade.
    	 */
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	Button btQuest = (Button) findViewById(R.id.button_questoes);
    	String message = (String)btQuest.getText();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
   

    
}
