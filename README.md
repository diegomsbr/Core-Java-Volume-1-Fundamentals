# Core-Java-Volume-1-Fundamentals
Book of Cay S. Horstamann

# Creating the project
mvn archetype:generate -DgroupId=com.diego.core.java.fundamentals -DartifactId=core-java-fundamentals

# Update the parent pom.xml like in the project
# After that, go to the parent project folder and do the following:

cd core-java-fundamentals

mvn archetype:generate -DgroupId=com.diego.core.java.fundamentals -DartifactId=chapter-04

#Automaticaly, the parent pow will by updated with the modules, and the sub-modules will be relacioned with the parent


