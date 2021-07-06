
def readDependencies() {
    echo 'readDependencies'
}

return [
    readDependencies: this.&readDependencies
]
