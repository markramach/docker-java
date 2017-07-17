pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -DskipTests -Dmaven.test.skip=true clean org.jacoco:jacoco-maven-plugin:prepare-agent test package install'
            }
        }
    }
}
