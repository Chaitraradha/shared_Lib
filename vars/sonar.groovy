def call() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://3.27.235.192/ -Dsonar.java.binaries=target/classes'
   }
return this
