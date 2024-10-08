## Erstellung des Projekts

Mit Intellij kann ganz leicht ein Springboot Projekt erstellt werden. Damit wird die Project Structure erstellt und man kann das Projekt mit Gradle runnen. 

Um es auszuführen, in der gradle-Konsole `gradle bootRun` eingeben. Über [`localhost:8080`](http://localhost:8080) kann man die Ausgabe sehen. 

## Projekt

Es wird ein Controller (`@RestController`) und eine Applikation (`@SpringBootApplication`) benötigt. 

### Controller

Im Controller kann man die `http-Respones` mappen. Dies geht mit der Annotation `@RequestMapping("")`. Wenn in dem Map eine `path variable` vorkommt, muss das angegeben werden. 

```java
@RequestMapping("/pfad/{path}")
public String greeting(@PathVariable String path){
	return "Hello " + path;
}
```

### Application

In der Appkikation befindet sich die `main`- Methode. Mit `SpringApplication.run()`  wird benutzt, um das Projekt zum Laufen zu bringen. 

```java
@SpringBootApplication
public class ElectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectionApplication.class, args);
    }
}
```

## Datentypen

Um die Daten im Browser anzuzeigen wird `MediaType.*APPLICATION_JSON_VALUE`* bzw. `MediaType.*APPLICATION_XML_VALUE*` benötigt.  Diese sind auch in der Mapping-Annotation. 

```java
@RequestMapping(value = "/election/{regionID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
```

### Welche Daten werden verwendet?

Die Daten die in der `XML`/`JSON` - Ausgabe zu sehen sind, sind Werte, die in den Klassen per `getter-Methode` zu kriegen sind. 

```java
public class Mensch {
	private String name;
	private int groesse;
	private int alter;
	
	public Mensch(String name, int groesse, int alter){
		this.name = name;
		this.groesse = groesse;
		this.alter = alter;
	}
	
	public String getName(){
		return name;
	}
	
	public int getGroesse(){
		return groesse;
	}	
	
	public int getAlter(){
		return alter;
	}
}
```

Bei folgendem Objekt: `Person p = new Person(”Maya”, 168, 17)` wäre die Ausgabe in XML

```xml
<Person>
	<name>Maya</name>
	<groesse>168</groesse>
	<alter>17</alter>
</Person>
```
