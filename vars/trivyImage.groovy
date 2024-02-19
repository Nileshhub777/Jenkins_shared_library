def call() {
    sh 'trivy image nilesh496/youtube:latest > trivyimage.txt'
}
