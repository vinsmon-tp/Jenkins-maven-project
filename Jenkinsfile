pipeline {
 agent any
 stages {
  stage('Clone from git') {
   steps {
    git 'https://github.com/vinsmon-tp/Jenkins-maven-project.git'
   }
  }
  stage('clean') {
   steps {
    bat "mvn clean"
   }
  }
  stage('test') {
   steps {
    bat "mvn test"
   }
  }
  stage('package') {
   steps {
    bat "mvn package"
   }
  }
  post {
   success {
    junit '**/target/surefire-reports/TEST-*.xml'
    archiveArtifacts 'target/*.jar'
   }
  }
 }
}
