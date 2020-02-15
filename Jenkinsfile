pipeline {
 agent any

 stages {
  stage('Get code from Git') {
   steps {
    git 'https://github.com/vinsmon-tp/Jenkins-maven-project.git'
   }
  }
  stage('Build') {
   steps {
    bat "mvn clean test install"
   }
   post {
    // If Maven was able to run the tests, even if some of the test
    // failed, record the test results and archive the jar file.
    success {
     junit '**/target/surefire-reports/TEST-*.xml'
     archiveArtifacts 'target/*.jar'
    }
   }
  }
 }
}
