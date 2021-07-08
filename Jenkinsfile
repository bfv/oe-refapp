// GLOBAL defintions. In this section the globals are defined which can be used through the pipeline

workspace = ''
sourceDir = ''

bfvlibRepo = 'https://github.com/bfv/bfvlib.git'
bfvlibBranch = ''


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
                    echo '  - workspace: ' + workspace
                    echo '  - sourceDir' + sourceDir

                    setupLib = load(sourceDir + '/refapp/cicd/setup.groovy')
                    setupLib.readDependencies()

                    echo 'dependencies:'
                    echo '  repo:' + bfvlibRepo
                    echo '  branch: ' + bfvlibBranch
 
                    checkout([
                        $class: 'GitSCM',
                        userRemoteConfigs: [
                            [url: "${bfvlibRepo}", name: 'origin']
                        ],
                        extension: [
                            [$class: 'RelativeTargetDirectory', relativeTargetDir: "bfvlib"]
                        ]
                    ])

                    /*
                    checkout(scm: [$class: 'GitSCM', userRemoteConfigs: [[url: "${gitURL}"], [name: "origin"]], branches: [[name: "${gitTag}"]]])
                    */
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
