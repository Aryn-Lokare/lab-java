# Java Practicals (1–25)

The folders and source filenames follow the requested structure: `exp-no/exp-no.java`. The classes are package-private because Java identifiers cannot contain hyphens; this lets `javac` compile each hyphenated source filename.

## Run a standard practical

Open a practical folder in Command Prompt and run `run.bat`, or run (example for Experiment 1):

```bash
javac exp-1.java
java exp1
```

Experiments 1–20 and 25 use the standard Java library. Java 16+ is recommended because Experiment 17 uses `Stream.toList()`.

## Special setup

- **Experiment 21 and 22 (JDBC):** Requires MySQL running, a database named `java_practicals`, and MySQL Connector/J on the classpath. Set `DB_USER` and `DB_PASSWORD` environment variables. Experiment 22 also needs the `students` table and `count_students` stored procedure described in its source comments.
- **Experiment 23 (Hibernate):** Requires Hibernate 6, Jakarta Persistence, MySQL Connector/J, and a database named `hibernateeg`. A `hibernate.cfg.xml` template is included; configure credentials before running.
- **Experiment 24 (JUnit):** Requires JUnit 5 and is intended to be run by a JUnit test runner. A Maven `pom.xml` is included.

The PDF lists experiment titles only, so examples use reasonable demonstration inputs and schemas where details were not specified. Experiment 25 is a console-based Student Task Manager mini project.
