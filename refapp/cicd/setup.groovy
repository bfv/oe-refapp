
def readDependencies() {
    echo 'readDependencies from ' + sourceDir + 'dependencies.json'
}

return [
    readDependencies: this.&readDependencies
]
