
import groovy.json.JsonSlurper

def readDependencies(sourceDir) {
    echo 'readDependencies from ' + sourceDir + '/dependencies.json'
    def propertyFile = new File(sourceDir + '/dependencies.json')
    def jsonSlurper = new JsonSlurper()
    dependencies = jsonSlurper.parse(propertyFile)
    println(dependencies.bfvlib)
}

return [
    readDependencies: this.&readDependencies
]
