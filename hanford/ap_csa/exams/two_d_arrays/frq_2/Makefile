JAVAC=javac
sources = $(wildcard ./*.java ./answer/*.java ./students/*.java ./submissions/*.java ./grading/*.java)
classes = $(sources:.java=.class)
main = Problem

all: program

program: $(classes)

clean:
	rm -f *.class
	rm -f ./students/*.class
	rm -f ./answer/*.class
	rm -f ./grading/*.class
	rm -f ./submissions/*.class

%.class: %.java
	$(JAVAC) $<

jar: $(classes)
	jar cvf program.jar $(classes)

run:
	java $(main)

.PHONY: all program clean jar