pipeline {
   agent any
   stages {
      stage ('Build') {
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