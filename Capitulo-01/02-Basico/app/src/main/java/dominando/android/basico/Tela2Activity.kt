package dominando.android.basico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)

        val cliente = intent.getParcelableExtra<Cliente>("cliente")
        val pessoa = intent.getSerializableExtra("pessoa") as Pessoa?


        textMensagem.text = when {
            cliente != null -> {
                getString(R.string.tela2_texto1, cliente.nome, cliente.codigo)
            }
            pessoa != null -> {
                getString(R.string.tela2_texto2, pessoa.nome, pessoa.idade)
            }
            else -> {
                getString(R.string.tela2_texto2, nome, idade)
            }
        }
    }
}
