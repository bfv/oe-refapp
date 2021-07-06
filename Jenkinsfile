pipeline {

    agent any
    
    stages {
        stage('setup') {
            steps {
                script {
                    workspace = pwd()
                    echo 'setup...'
                    echo '..workspace: ' + workspace
                }
            }
        }

        stage('load databases') {
            steps {
                script {
                    echo 'load df\'s...'
                }
            }
        }

        stage('compile') {
            steps {
                script {
                    echo 'compile...'
                }
            }
        }

        stage('package') {
            steps {
                script {
                    echo 'package...'
                }
            }
        }

        stage('test') {
            steps {
                script {
                    echo 'test...'
                }
            }
        }
    }
}
