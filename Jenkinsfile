pipeline {
   agent any
   stages {
      stage ('Test') {
         steps {
            withMaven() {
              withSonarQubeEnv('Sonar Cloud - sdeyris') {
                   sh "./mvnw verify sonar:sonar"
              }
            }
         }
      }
   }
}
