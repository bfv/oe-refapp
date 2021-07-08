
import groovy.json.JsonSlurper

def readDependencies() {
    echo 'readDependencies from ' + sourceDir + '/dependencies.json'
    def propertyFile = new File(sourceDir + '/dependencies.json')
    def jsonSlurper = new JsonSlurper()
    def deps = jsonSlurper.parse(propertyFile)
    dependencies.bfvlib = deps.bfvlib
}

return [
    readDependencies: this.&readDependencies
]
