pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sshagent (credentials: ['6b7eab92-a500-493c-b54d-305fc1272bb4']) {
				    //sh 'ssh -o StrictHostKeyChecking=no -l cloudbees 192.168.1.106 uname -a'
				    
                	sh './gradlew --stacktrace deploy'
				  }
            }
        }
    }
}