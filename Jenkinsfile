pipeline {
    agent any
 
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/dkkdark/javaMaven.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
 
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
