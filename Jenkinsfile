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
	            	sh './gradlew --stacktrace deploy'
				}
            }
        }
    }
}