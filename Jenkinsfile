pipeline {
    agent any

    tools {
        jdk 'JDK-17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Srushti-111/Jenkins_springboot.git'
            }
        }

        stage('Check Java & Maven') {
            steps {
                sh '''
                    echo "JAVA_HOME=$JAVA_HOME"
                    java -version
                    javac -version
                    mvn -version
                '''
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t springbootapp:latest .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                    docker stop springbootapp || true
                    docker rm springbootapp || true
                    docker run -d --name springbootapp -p 8081:8081 springbootapp:latest
                '''
            }
        }
    }
}