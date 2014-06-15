Anota��es gerais
================

### Lesson 1 - Hello World
- Instalar o JSE JDK (inclui o JRE)
- Instalar o Java EE e JDK 7 e GlassFish 4
- Download e install javadoc offline (download e configura��o em Preferences - .zip) .
- Configurar:
-- o PATH para a pasta C:\Program Files\Java\jdk1.8.0_05\bin
-- JAVA_HOME para C:\Program Files\Java\jdk1.8.0_05
-- CLASSPATH para .;%JAVA_HOME%\bin;%JAVA_HOME%\jre\lib;
-- o src.zip para o F3 funcionar (Windows > Preferences > Java > Installed JREs > selecionar e editar > selecionar tudo e Source Attachment > src.zip do JDK)
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
-- sysout, CTRL + SPACE => System.out.println

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

### Lesson 6 - Packagess, Interfaces and Encapsulation
- Modificador de acesso: se n�o informado � Package (vis�vel �s classes do mesmo package). 
- Variavel "static final" => constante e n�o permite alterar valor no construtor.
- Variavel "final" => constante e permite alterar valor no construtor. Exige ser inicializado.
- M�todo e Classe com "final" => sealed do C# - n�o permite sobreescrever
- Classe "implements" interfaces
- "Maker Interface" interfaces que n�o possuem declaracao dentro dela.
- instanceof => "is" do C#
- for (Person p: personsArray){ => foreach do C#
-- n�o permite usar uma classe diferente do array. Ex: for (Employee p : persons) {..} // erro de compilacao

### Lesson 7 - Programming with abstract Classes and interfaces
- @Override (annotation) => override do C#
- 

### Lesson 13 - Error Handling
- CTRL + 1 - gerar c�digo e resolver problemas como falta de "import".
- Classe base de Exception: Throwable.


### Lesson 14 - Collections
- java.util e java.util.concurrent - cole��es
- Vector (thread synchronization) e ArrayList - somente Objects (tipos basicos ser�o convertidos - boxing)
- // OK   - ArrayList<Integer> inteiros = new ArrayList<Integer>(); (object)
- // ERRO - ArrayList<int> ints = new ArrayList<int>();
- // ERRO - inteiros[0].toString(); --- ArryaList n�o acessa via []. Usa-se o "get(indice)"
- Interface Set n�o permite item duplicado. (HashSet e SortedSet)
- Map � o Dictionary do C#. (Hashtable e HashMap)
- Interface Queue (LinkedList); Enumeration (readonly); Iterator (tem Delete);
- Para Queue e Stack usa-se LinkedList
- ArrayList<? extends Data> data) => o ": where" do Generic do C#

### Lesson 22 - Working with Databases using JDBC
- java.sql e javax.sql
- open-source DBMS called JavaDB (also known as Derby)
- ResultSet => DataReader do C#; conexao.createStatement => DbCommand do C#; 
- PreparedStatement quando executado v�rias vezes o mesmo comando; CallableStatement para Stored Procedure;
- Par�metros por �ndice: "SELECT * from Employee WHERE empno=? and ename=?�

### Lesson 24 - Annotations and Reflection
- * @author ----- o @ � do Javadoc.
- permite Annotation em vari�vel
- java.* (padr�o) - javax.* (extens�es)


### Lesson 26 - Java EE Overview
- Java Community Process (JCP) - http://jcp.org
- Java Specification Request (JSR) - proposta de especifica��o
- "profile" implementa��o de parte do Java EE (ex: Profile Web - web container).