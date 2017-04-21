This project is a dummy attempt at testing JaCoCo + Lombok @Data code generation + SonarQube.

Steps to reproduce:
 * `mvn clean install`
 * Check the JaCoCo report in `./target/site/jacoco/index.html`
   * **Make sure the coverage is 100% for class `Example`**
 * Import this project in SonarQube using `sonar-scanner` and see that the code coverage displayed is a lot lower.
   * Don't forget to configure your SonarQube URL and credentials in `sonar-project.properties` in case it's different from `http://localhost:9000`
   * Example command: `~/sonar-scanner-3.0.1.733-linux/bin/sonar-scanner`
   * **Code coverage is extremely low (16.7% on my SonarQube report)**
