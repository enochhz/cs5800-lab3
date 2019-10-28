pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
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