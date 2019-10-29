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
        stage('Push to DockerHub') {
            steps {
                sh 'docker build -t lab3_image .'
                sh 'docker tag lab3_image enochhaozheng/lab3_image:3'
                sh 'docker push enochhaozheng/lab3_image:3'
            }
        }
    }
}