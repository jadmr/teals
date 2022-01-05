JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)
main = Startpoint

all: program

program: $(classes)

clean:
	rm -f *.class

%.class: %.java
	$(JAVAC) $<

jar: $(classes)
	jar cvf program.jar $(classes)

run:
	java $(main)

.PHONY: all program clean jar