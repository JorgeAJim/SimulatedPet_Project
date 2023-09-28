Main.class: Main.java
	javac -g Main.java

Cat.class: Cat.java
	javac -g Cat.java

Pet.class: Pet.java
	javac -g Pet.java

Energy.class: Energy.java
	javac -g Energy.java

Intelligence.class: Intelligence.java
	javac -g Intelligence.java

Hunger.class: Hunger.java
	javac -g Hunger.java

Happiness.class: Happiness.java
	javac -g Happiness.java

Attribute.class: Attribute.java
	javac -g Attribute.java

clean:
	rm *.class

run: Main.class
	java Main

debug: Main.class
	jdb Main
