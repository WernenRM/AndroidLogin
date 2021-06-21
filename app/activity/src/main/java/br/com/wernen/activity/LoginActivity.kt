package br.com.wernen.activity

import Date.DataBase
import Date.TaskLogin
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

class LoginActivity : AppCompatActivity() {

    private var alunoDAO: TaskLogin? = null
    private var dataBase: DataBase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btLogin: Button = findViewById(R.id.btLogin)


        btLogin.setOnClickListener {
            fun onClick() {

                val tlogin: TextView = findViewById(R.id.tlogin)
                val tsenha: TextView = findViewById(R.id.tSenha)
                val login: String = tlogin.text.toString()
                val senha: String = tsenha.text.toString()

                if (login.equals("wernen") && senha.equals("123"))
                    alert("Login Realizado com Sucesso")
                else alert("Login ou Senha Incorreta")
            }
        }


    }

    private fun alert (alerta: String){

        Toast.makeText(this,alerta,Toast.LENGTH_LONG).show();
    }

    private fun initDatabase(){
        dataBase = Room.databaseBuilder(
            applicationContext,
            DataBase::class.java, "usuarios.db"
        ).build()
    }
    private fun createTask(){

    }
}