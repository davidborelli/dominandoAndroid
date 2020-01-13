# Android Nativo com Kotlin

<p>Repositório criado com o intuito de desenvolver os exercícios propostos no livro <strong>DOMINANDO O ANDROID com Kotlin</strong> de <strong>Nelson Glauber</strong> </p>

- <strong>Guia
  - [Arquivos e recursos](#arquivos-e-recursos)

## Introduçao

<p>Abaixo uma tabela com suas versões e respectivas API Level, à partir do Android Kit Kat</p>
<table>
  <tr>
    <th>Nome da versão</th>
    <th>Versão</th>
    <th>API Levl</th>
  </tr>
  <tr>
    <td>Kit Kat</td>
    <td>4.4 | 4.4W</td>
    <td>19 | 20</td>
  </tr>
  <tr>
    <td>Lollipop</td>
    <td>5.0 | 5.1</td>
    <td>21 | 22</td>
  </tr>
  <tr>
    <td>Marshmallow</td>
    <td>6.0</td>
    <td>23</td>
  </tr>
  <tr>
    <td>Nougat</td>
    <td>7.0 | 7.1</td>
    <td>24 | 25</td>
  </tr>
  <tr>
    <td>Oreo</td>
    <td>8.0 | 8.1</td>
    <td>26 | 27</td>
  </tr>
  <tr>
    <td>Pie</td>
    <td>9.0</td>
    <td>28</td>
  </tr>
  <tr>
    <td>Android 10</td>
    <td>10</td>
    <td>29</td>
  </tr>
</table>

## CAPÍTULO 01

### Conceitos Básicos

#### Android Jetpack:

<p>Coleção de bibliotecas para facilitar o desenvolvimento de aplicativos Android. Elas ajudam o desenvolvedor a seguir as práticas mais recomendadas e simplifica a tarefas complexas, fornecem compatibilidade com versões anteriores e são atualizadas com mais frequência que o sistema operacional, garantindo que o desenvolvedor tenha sempre acesso as versões mais recentes dos componentes.</p>
<p>Uma forma de verificar se a biblioteca utiliza é do <strong>androidx</strong> basta verificar se a importação está vindo do pacote <strong>androidx.*</strong> </p>

#### AndroidManifest.xml

<p>
Armazena informações importantes, tais como: <strong>permissões, requisitos de hardware, serviços  etc...</strong>
</p>
<p>
<strong>android:allowBackup:</strong> informa se o sistema operacional deverá realizar o backup dos dados da aplicação.</br>
<strong>android:supportsRtl:</strong> informa se o aplicativo dará suporte a idiomas com escrita da direita para a esquerda.</br>

Todas as activities da aplicação que serão exibidas para o usuário deverão estar declaradas no **AndroidManifest.xml** com a tag **\<activity>**. </br>

A ação <strong>android.intent.action.MAIN</strong> indica que essa activity é o ponto de entrada da aplicação, e **android.intent.category.LAUNCHER** indica que a activity aparecerá na lista de aplicações do aparelho.

</p>

#### Arquivos e recursos

<p>
Todos os recursos da aplicação (imagem, textos, layouts e etc) ficam localizados na pasta <strong>app/src/main/res</strong> e cada um deles é mapeado em um indentificador diferente na classe R, que é gerada automaticamente. </br>

Por exemplo, para acessar o arquivo <strong>res/mipmap-mdpi/ic_launcher.png</strong> no Kotlin seria da seguinte forma: <strong>R.mipmap.ic_launcher</strong>, e para acessar essa mesma imagem em um arquivo xml, como o AndroidManifest.xml, seria: <strong>@mipmap/ic_launcher</strong>

</p>

<p>
Todos os textos da aplicação ficam em <strong>res/values/strings.xml</strong>

_Mapeamento dos recursos na classe R e no XML_

<table>
  <tr>
    <th>Recurso</th>
    <th>ID da classe R</th>
    <th>Em arquivos XML</th>
  </tr>
  <tr>
    <td>res/mipmap/ic_launcher.png</td>
    <td>R.mipmap.ic_launcher</td>
    <td>@mipmap/ic_launcher</td>
  </tr>
  <tr>
    <td>res/drawable/imagem.png</td>
    <td>R.drawable.imagem</td>
    <td>@drawable/imagem</td>
  </tr>
  <tr>
    <td>res/layout/activity_main.xml</td>
    <td>R.layout.activity_main</td>
    <td>@layout/activity_main</td>
  </tr>
  <tr>
    <td>res/menu/menu_main.xml</td>
    <td>R.menu.menu_main</td>
    <td>@menu/menu_main</td>
  </tr>
  <tr>
    <td>res/values/string.xml < string name="ola"> </td>
    <td>R.string.ola</td>
    <td>@string/ola</td>
  </tr>
  <tr>
    <td>res/values/dimens.xml < dimen name="margem"></td>
    <td>R.dimen.margem</td>
    <td>@dimen/margem</td>
  </tr>
</table>
</p>
