
def readDependencies(sourceDir) {
    echo 'readDependencies from ' + sourceDir + '/dependencies.json'
}

return [
    readDependencies: this.&readDependencies
]
