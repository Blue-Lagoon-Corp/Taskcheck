pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Les-chomeurs/Taskcheck.git'
            }
        }
        stage('Clean') {
            steps {
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/Taskcheck'){
                    bat './mvnw clean'
                }
            }
        }
        stage('Compile'){
            steps{
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/Taskcheck'){
                    bat './mvnw compile'
                }
            }
        }
        stage('Test'){
            steps{
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/Taskcheck'){
                    bat './mvnw test'
                }
            }
        }
        stage('Sonar Validation') {
            steps {
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/Taskcheck'){
                    bat './mvnw verify sonar:sonar -Dsonar.login=634b3180737f5b08ef57317c4263be4fa13370cf -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=les-chomeurs -Dsonar.projectKey=Les-chomeurs_Taskcheck'
                }
            }
        }
        stage('Package'){
            steps{
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/Taskcheck'){
                    bat './mvnw package'
                }
            }
        }
        stage('Archive') {
            steps {
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/Taskcheck'){
                    bat 'rename target\\taskcheck-0.0.1-SNAPSHOT.jar taskcheck-%BUILD_NUMBER%.jar'
                    archiveArtifacts artifacts: 'target\\taskcheck-*.jar', followSymlinks: false
                }
            }
        }
    }
}
