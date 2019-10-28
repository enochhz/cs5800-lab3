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
        stage('Push to DockerHub') {
            steps {
                sh 'docker build -t lab3_image .'
                sh 'docker run --rm lab3_image:latest'
                sh 'docker tag lab3_image enochhaozheng/lab3_image:2'
                sh 'docker push enochhaozheng/lab3_image:3'
            }
        }
    }
}