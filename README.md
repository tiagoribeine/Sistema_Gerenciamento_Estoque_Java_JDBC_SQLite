
<h1> Configuração no IntelliJ IDEA </h1>

Esse projeto foi criado no Intellij utilizando VM Options. Abaixo demonstrarei como esse projeto pode ser executado nessa IDE

<h3> Passo a Passo Detalhado </h3>
<ol>
<li> Acessar Configurações de Execução - Clique na seta dropdown ao lado do botão "Run" ▶ </li>

Selecione "Edit Configurations..."
<br>
![img.png](assets/img/img.png)
<br>

<li> Criar Nova Configuraçã: Clique no + (Adicionar) no canto superior esquerdo. Selecione Application e preencha os Campos:</li>

<br>


<pre><code>Name: CriadorTabela
Main class: CriadorTabela
Working directory: C:\Users\tiago\IdeaProjects\ProjetoJavaJDBC
VM Options: -cp "out/production/ProjetoJavaJDBC;SQLite Files/sqlite-jdbc-3.46.0.0.jar;SQLite Files/slf4j-api-1.7.13.jar;SQLite Files/slf4j-simple-1.7.13.jar"
</code></pre>

<li> Aplicar Configurações:
<ul>
<li> Clique em Apply </li>
<li> Clique em OK </li>
</ul>
</li>

