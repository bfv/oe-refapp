pipeline {

    agent any
    
    stages {

        stage('init environment') {
            steps {
                script {
                    workspace = pwd()
                    sourceDir = workspace + '/src'
                }
            }
        }

        stage('setup') {
            steps {
                script {
                    echo 'setup...'
                    echo '..workspace: ' + workspace
                    setupLib = load(sourceDir + '/refapp/cicd/setup.groovy')
                    setupLib.readDependencies(sourceDir)
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
