pipeline {
    agent any

    stages {
        stage('code') {
           
            steps {
    
                   git url: 'https://github.com/abhipatil1390/react_demo.git', branch: 'main'
            }
        }
        stage('build') {
            steps {
                sh 'docker build . -t first:latest'
            }
        }
        stage('test') {
            steps {
                echo "test has successfully!"
            }
        }
        stage('test') {
            steps {
                echo "test has successfully!"
            }
        }
        stage('deploy') {
            steps {
                sh 'docker run -d --name react_d -p 8001:8001 first:latest '
            }
        }
    }
}
