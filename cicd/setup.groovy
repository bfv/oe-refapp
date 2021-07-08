
import groovy.json.JsonSlurper

def readDependencies() {

    def depsFilename = sourceDir + '/refapp/dependencies.json'
    echo 'readDependencies from ' + depsFilename
    def propertyFile = new File(depsFilename)
    def jsonSlurper = new JsonSlurper()
    def deps = jsonSlurper.parse(propertyFile)
    bfvlibBranch = deps.bfvlib
}

return [
    readDependencies: this.&readDependencies
]
