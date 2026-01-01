pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'Java'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ShrinivasC96/jenkins-ci-cd-project.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            when {
                success()
            }
            steps {
                echo 'Deploying application...'
                sh '''
                mkdir -p /tmp/jenkins-deploy
                cp target/jenkins-ci-cd-1.0.jar /tmp/jenkins-deploy/
                '''
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed! Fix errors and try again.'
        }
    }
}
