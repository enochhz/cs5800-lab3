pipeline {
    agent {
        dockerfile true
    }
    stages {
        stage('Beginning') {
            steps {
                echo 'Hello World'
                sh 'echo myVar = $myVar'
            }
        }
    }
}