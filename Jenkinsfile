pipeline {
   agent any
   stages {
      stage ('Code Quality') {
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
