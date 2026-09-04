def call(String project, String tag) {
    echo 'started image pushing to Docker Hub'

    withCredentials([
        usernamePassword(
            credentialsId: 'dockerhub-cred',
            usernameVariable: 'DOCKERHUB_USER',
            passwordVariable: 'DOCKERHUB_PASS'
        )
    ]) {
        sh 'docker login -u "$DOCKERHUB_USER" -p "$DOCKERHUB_PASS"'
        sh "docker image tag ${project}:${tag} ${DOCKERHUB_USER}/${project}:${tag}"
        sh "docker push ${DOCKERHUB_USER}/${project}:${tag}"
    }
}
