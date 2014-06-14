Anota��es gerais
================

### Lesson 1 - Hello World
- Instalar o JSE JDK (inclui o JRE)
- Configurar:
-- o PATH para a pasta C:\Program Files\Java\jdk1.8.0_05\bin
-- JAVA_HOME para C:\Program Files\Java\jdk1.8.0_05
-- CLASSPATH para .;%JAVA_HOME%\bin;%JAVA_HOME%\jre\lib;
- javac HelloWorld.java (source code) => HelloWorld.class (byte code)
- javac HelloWorld.java -verbose => exibir detalhes de erro de compila��o
- java HelloWorld => executar o aplicativo

### Lesson 2 - Eclipse IDE
- Eclipse IDE (eclipse.org) - � um Zip. Vers�es: Uno, Helios, Kepler, etc
- IDE Workspace (solution e prefer�ncias) / WorkingSet (filtro / agrupador)
- IDE Perspective (conjunto de Views). Exemplo: Java EE, Java, etc.
- IDE Views: Server, Tasks, Package Explorer, etc.
- Package Name: reverse domain name (br.com.rafaelleonhardt.lesson2) => equivalente ao Namespace do C# 
- Package folder: src/br/com/rafaelleonhardt/lesson2
- Pastas: bin para .class (byte code) e src para .java (source code)
- .jar - equivalente ao .dll
- IDE Atalhos
-- CTRL + F6 => (CTRL + TAB do Visual Studio)
-- F3 => Go to Definition (F12 do Visual Studio)
- Auto build no Save

### Lesson 3 - OOP
- super => � o "base" do C#, acionando a classe Base no construtor ou sobrecarga de m�todo.
- super => no construtor tem que ser a primeira coisa a ser chamada. Se n�o informado o super � chamado automaticamente.

### Lesson 4 - Class Methods
- Snippets:
-- Construtor padr�o: digitar primeira letra da classe e CTRL + Espa�o.  => ctor do C# com Visual Studio

### Lesson 5 - Java Basic
- Array: colchetes antes ou depois est� correto. Ex: String[] abc; ou String abc[];
-- String[] array1 = new String[1];
-- int[][] array2 = new int[1][1];
- ArrayList no java.uttil;
- IDE atalhos: 
-- excluir linha: CTRL + D => SHIFT + DELETE no Visual Studio
-- ALT + Shift + R - renomear uma variavel e alterar nos pontos utilizados
- java.util.logging.Logger - recurso nativo para log em arquivo ou outro destino.
-- Recomendado usar o nome completo do pacote ou da classe que est� logando. Assim permite filtros.
- Switch: 
-- at� java 7 n�o era suportado switch com variavel string.
-- n�o permite "case" repetido.
-- se valor do switch for nulo levanta exce��o NullPointException.
-- n�o suporta range.
