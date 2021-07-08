// GLOBAL defintions. In this section the globals are defined which can be used through the pipeline

workspace = ''
sourceDir = ''
dependencies = {
    bfvlib = ''
}

dependencyRepos {
    bfvlib = 'https://github.com/bfv/bfvlib.git'
}


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
                    setupLib.readDependencies()

                    echo 'dependencies:'
                    echo '  bfvlib: ' + dependencies.bfvlib

                    checkout([
                        $class: 'GitSCM',
                        branches: [['refs/tags/' + dependencies.bfvlib]],
                        userRemoteConfig: [[url: dependencyRepos.bfvlib]]
                    ])
                }
            }
        }
/*
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
*/
    }
}
