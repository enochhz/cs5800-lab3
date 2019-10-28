pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'
                sh 'mvn package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
                echo 'Test'
                sh 'java -jar target/lab3-0.0.1-SNAPSHOT.jar'
            }
        }
        stage('Publish') {
            steps {
                echo 'Publish'
            }
        }
    }
}