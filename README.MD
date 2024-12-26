

# First init Gradle Project

```text
repositories {
    maven{ url 'https://maven.aliyun.com/nexus/content/groups/public/'}
    mavenCentral()
}
```



Upgrade Gradle version

```bash 
./gradlew wrapper --gradle-version=8.11.1 --distribution-type=all
./gradlew clean
```
