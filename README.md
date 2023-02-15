# Connect to MySQL with Java
This repository was created, because at the time of creation I had trouble finding a good Tutorial on how to do it.
If you need further Information there is a 🇩🇪 German [**Tutorial**](https://www.youtube.com/watch?v=Mi9APJdsjaA) available on my Youtube Channel.

### Ussage
As you can see in the MySQL.java you have to add the mysql connector dependency to your `pom.xml` or `build.gradle`

##### Maven

```xml
<!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>VERSION</version>
</dependency>
```

##### Gradle

```xml
// https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
implementation 'com.mysql:mysql-connector-j:VERSION'
```
