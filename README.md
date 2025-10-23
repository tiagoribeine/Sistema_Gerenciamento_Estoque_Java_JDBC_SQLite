<h1> Sistema de Gerenciamento de Produtos - Java + SQLite </h1>

Este projeto é um sistema completo de gerenciamento de produtos com interface gráfica JavaFX e banco de dados SQLite.

<h2> Como executar: Compilação e Execução </h2>

Pré-requisitos
- Java JDK 22 ou superior
- JavaFX SDK 22.0.1
- Configure a variável de ambiente:
<pre><code>
set PATH_TO_FX="C:\Java\javafx-sdk-22.0.1\lib"
</code></pre>

<h3>Compilação via terminal: </h3>

<pre><code>
javac --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp "SQLite Files/*" src/*.java -d out/
</code></pre>

<h3>Execução via terminal</h3>

<pre><code>
java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp "out;SQLite Files/*" ProdutoGUI
</code>
</pre>


<h2> Configuração no IntelliJ IDEA </h2>

Esse projeto foi criado no Intellij utilizando VM Options. Abaixo demonstrarei como esse projeto pode ser executado caso esteja utilizando essa IDE

<h3> Passo a passo: </h3>

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

Faça o mesmo para a classe ProdutoGUI.java

<pre><code>Name: ProdutoGUI
Main class: ProdutoGUI
Working directory: C:\Users\tiago\IdeaProjects\ProjetoJavaJDBC
--module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.fxml -cp "out/production/ProjetoJavaJDBC;SQLite Files/sqlite-jdbc-3.46.0.0.jar;SQLite Files/slf4j-api-1.7.13.jar;SQLite Files/slf4j-simple-1.7.13.jar"
</code></pre>


<li> Aplicar Configurações:
<ul>
<li> Clique em Apply </li>
<li> Clique em OK </li>
</ul>

<h2>📁 Estrutura do Projeto</h2>
<pre><code>ProjetoJavaJDBC/
├── src/
│   ├── ConexaoDB.java
│   ├── CriadorTabela.java
│   ├── Produto.java
│   ├── ProdutoDAO.java
│   └── ProdutoGUI.java
├── SQLite Files/
│   └── (arquivos .jar)
└── out/</code></pre>




<!-- Comando para a compilação: <pre><code>
javac --module-path %PATH_TO_FX% --add-modules javafx.controls ProdutoGUI.java
</code></pre> -->









